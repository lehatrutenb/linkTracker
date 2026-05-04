package backend.academy.linktracker.scrapper.adapters.rowmapper;

import backend.academy.linktracker.scrapper.adapters.entity.ScrapperLinkMetaDataEntity;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.ResultSetExtractor;
import java.util.ArrayList;
import backend.academy.linktracker.scrapper.adapters.entity.ScrapperLinkMetaDataEntity.ScrapperLinkMetaDataIDEntity;
import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkMetaDataID;
import backend.academy.linktracker.scrapper.adapters.entity.ScrapperLinkIDEntity;
import java.util.Map;
import java.util.HashMap;

public class ScrapperLinkMetaDataEntityRowMapper implements ResultSetExtractor<List<ScrapperLinkMetaDataEntity>> {
    @Override
    public List<ScrapperLinkMetaDataEntity> extractData(ResultSet rs) throws SQLException {
        Map<ScrapperLinkMetaDataIDEntity, ScrapperLinkMetaDataEntity> map = new HashMap<>();
        while (rs.next()) {
            var curEntity = mapRow(rs);
            if (!map.containsKey(curEntity.getId())) {
                map.put(curEntity.getId(), curEntity);
            }
            map.get(curEntity.getId()).getTags().add(new ScrapperLinkMetaDataEntity.TagEntity(rs.getString("tag_name")));
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
        entity.setVersion(rs.getLong("version"));
        return entity;
    }
}
