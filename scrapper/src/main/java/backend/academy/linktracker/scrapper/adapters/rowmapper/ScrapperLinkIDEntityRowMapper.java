package backend.academy.linktracker.scrapper.adapters.rowmapper;

import backend.academy.linktracker.scrapper.adapters.entity.ScrapperLinkIDEntity;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class ScrapperLinkIDEntityRowMapper implements RowMapper<ScrapperLinkIDEntity> {
    @Override
    public ScrapperLinkIDEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
        var idEntity = new ScrapperLinkIDEntity();
        idEntity.setLinkID(rs.getLong("link_id"));
        idEntity.setLinkURI(rs.getString("link_uri"));
        return idEntity;
    }
}
