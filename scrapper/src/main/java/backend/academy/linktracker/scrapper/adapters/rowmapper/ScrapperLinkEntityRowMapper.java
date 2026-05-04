package backend.academy.linktracker.scrapper.adapters.rowmapper;

import backend.academy.linktracker.scrapper.adapters.entity.ScrapperLinkEntity;
import backend.academy.linktracker.scrapper.adapters.entity.ScrapperLinkIDEntity;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ScrapperLinkEntityRowMapper implements RowMapper<ScrapperLinkEntity> {
    @Override
    public ScrapperLinkEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
        var idEntity = new ScrapperLinkIDEntityRowMapper().mapRow(rs, rowNum);
        var entity = new ScrapperLinkEntity();

        entity.setId(idEntity);
        entity.setUpdatedAt(rs.getTimestamp("updated_at").toInstant());
        entity.setVersion(rs.getLong("version"));
        return entity;
    }
}
