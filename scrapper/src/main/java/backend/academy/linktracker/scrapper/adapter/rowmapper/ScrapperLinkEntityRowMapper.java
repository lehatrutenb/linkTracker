package backend.academy.linktracker.scrapper.adapter.rowmapper;

import backend.academy.linktracker.scrapper.adapter.entity.ScrapperLinkEntity;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class ScrapperLinkEntityRowMapper implements RowMapper<ScrapperLinkEntity> {
    @Override
    public ScrapperLinkEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
        var idEntity = new ScrapperLinkIDEntityRowMapper().mapRow(rs, rowNum);
        var entity = new ScrapperLinkEntity();

        entity.setId(idEntity);
        entity.setUpdatedAt(rs.getTimestamp("updated_at").toInstant());
        return entity;
    }
}
