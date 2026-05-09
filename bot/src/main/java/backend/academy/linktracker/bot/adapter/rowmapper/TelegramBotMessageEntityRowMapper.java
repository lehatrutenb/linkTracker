package backend.academy.linktracker.bot.adapter.rowmapper;

import backend.academy.linktracker.bot.adapter.entity.BotChatEntity;
import backend.academy.linktracker.bot.adapter.entity.TelegramBotMessageEntity;
import backend.academy.linktracker.bot.adapter.entity.TelegramBotUserEntity;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class TelegramBotMessageEntityRowMapper implements RowMapper<TelegramBotMessageEntity> {

    @Override
    public TelegramBotMessageEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
        var entity = new TelegramBotMessageEntity();
        entity.setMessageID(rs.getLong("message_id"));
        entity.setLocalChatID(rs.getLong("local_chat_id"));
        entity.setMessage(rs.getString("message"));
        entity.setDate(rs.getTimestamp("date").toInstant());

        var chatEntity = new BotChatEntity();
        chatEntity.setId(rs.getLong("chat_id"));
        chatEntity.setReplyService(rs.getString("reply_service"));
        entity.setChat(chatEntity);

        var userEntity = new TelegramBotUserEntity();
        userEntity.setId(rs.getLong("user_id"));
        userEntity.setFirstName(rs.getString("first_name"));
        userEntity.setUserName(rs.getString("user_name"));
        userEntity.setBot(rs.getBoolean("is_bot"));
        entity.setUser(userEntity);

        return entity;
    }
}
