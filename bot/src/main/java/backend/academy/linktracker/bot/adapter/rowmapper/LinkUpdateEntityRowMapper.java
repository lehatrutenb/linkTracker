package backend.academy.linktracker.bot.adapter.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import backend.academy.linktracker.bot.adapter.entity.EventIDEntity;
import backend.academy.linktracker.bot.adapter.entity.LinkUpdateEntity;
import backend.academy.linktracker.bot.core.enums.OwnerIDType;

public class LinkUpdateEntityRowMapper implements ResultSetExtractor<List<LinkUpdateEntity>> {

    @Override
    public List<LinkUpdateEntity> extractData(ResultSet rs) throws SQLException, DataAccessException {
        Map<Long, LinkUpdateEntity> map = new HashMap<>();
        while (rs.next()) {
            var curEntity = mapRow(rs);
            if (!map.containsKey(curEntity.getId())) {
                map.put(curEntity.getId(), curEntity);
            } else {
                map.get(curEntity.getId()).getTgChatIDs().addAll(curEntity.getTgChatIDs());
            }
        }
        return map.values().stream().toList();
    }

    private LinkUpdateEntity mapRow(ResultSet rs) throws SQLException {
        var entity = new LinkUpdateEntity();
        var eventIDEntity = new EventIDEntity();
        eventIDEntity.setId(rs.getLong("event_id"));
        eventIDEntity.setOwnerIDType(OwnerIDType.valueOf(rs.getString("event_owner_id_type")));
        
        entity.setId(rs.getLong("id"));
        entity.setEventID(eventIDEntity);
        entity.setUrl(rs.getString("url"));
        entity.setDescription(rs.getString("description"));
        entity.setTgChatIDs(new ArrayList<>(List.of(rs.getLong("bot_chat_id"))));
        return entity;
    }
}