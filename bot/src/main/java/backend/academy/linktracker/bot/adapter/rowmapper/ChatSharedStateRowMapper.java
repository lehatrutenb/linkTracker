package backend.academy.linktracker.bot.adapter.rowmapper;

import backend.academy.linktracker.bot.adapter.entity.ChatSharedStateEntity;
import backend.academy.linktracker.bot.core.enumeration.ChatCommandFlowState;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

public class ChatSharedStateRowMapper implements ResultSetExtractor<List<ChatSharedStateEntity>> {

    @Override
    public List<ChatSharedStateEntity> extractData(ResultSet rs) throws SQLException, DataAccessException {
        Map<Long, ChatSharedStateEntity> map = new HashMap<>();
        while (rs.next()) {
            var curEntity = mapRow(rs);
            if (!map.containsKey(curEntity.getId())) {
                map.put(curEntity.getId(), curEntity);
            } else {
                map.get(curEntity.getId()).getTelegramBotMessages().addAll(curEntity.getTelegramBotMessages());
            }
        }
        return map.values().stream().toList();
    }

    private ChatSharedStateEntity mapRow(ResultSet rs) throws SQLException {
        var entity = new ChatSharedStateEntity();
        entity.setTelegramBotMessages(new ArrayList<>());
        if (rs.getLong("message_id") != 0) {
            var telegramBotMessageEntity = new TelegramBotMessageEntityRowMapper().mapRow(rs, 0);
            entity.setTelegramBotMessages(new ArrayList<>(List.of(telegramBotMessageEntity)));
        }

        entity.setId(rs.getLong("id"));
        entity.setCommandFlowState(ChatCommandFlowState.valueOf(rs.getString("command_flow_state")));
        entity.setProcessingCommand(rs.getString("processing_command"));
        entity.setProcessingCommandStep(rs.getInt("processing_command_step"));
        return entity;
    }
}
