package backend.academy.linktracker.scrapper.adapter.rowmapper;

import backend.academy.linktracker.scrapper.adapter.entity.ScrapperLinkMetaDataEntity;
import backend.academy.linktracker.scrapper.adapter.entity.ScrapperLinkMetaDataEntity.ScrapperLinkMetaDataIDEntity;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.ResultSetExtractor;

public class ScrapperLinkMetaDataEntityRowMapper implements ResultSetExtractor<List<ScrapperLinkMetaDataEntity>> {
    @Override
    public List<ScrapperLinkMetaDataEntity> extractData(ResultSet rs) throws SQLException {
        Map<ScrapperLinkMetaDataIDEntity, ScrapperLinkMetaDataEntity> map = new HashMap<>();
        while (rs.next()) {
            var curEntity = mapRow(rs);
            if (!map.containsKey(curEntity.getId())) {
                map.put(curEntity.getId(), curEntity);
            } else {
                map.get(curEntity.getId()).getTags().addAll(curEntity.getTags());
            }
        }
        return map.values().stream().toList();
    }

    private ScrapperLinkMetaDataEntity mapRow(ResultSet rs) throws SQLException {
        var linkIDEntity = new ScrapperLinkIDEntityRowMapper().mapRow(rs, 0);
        var entity = new ScrapperLinkMetaDataEntity();
        var metaDataIDEntity = new ScrapperLinkMetaDataIDEntity();
        metaDataIDEntity.setLinkID(linkIDEntity);
        metaDataIDEntity.setListenerID(rs.getLong("listener_id"));

        entity.setId(metaDataIDEntity);
        entity.setTags(new ArrayList<>());
        var tagName = rs.getString("tag_name");
        if (tagName != null) {
            entity.getTags().add(new ScrapperLinkMetaDataEntity.TagEntity(tagName));
        }
        return entity;
    }
}
