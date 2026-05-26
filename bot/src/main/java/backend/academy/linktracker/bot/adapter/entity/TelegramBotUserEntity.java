package backend.academy.linktracker.bot.adapter.entity;

import backend.academy.linktracker.bot.core.entity.TelegramBotUser;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Table(name = "telegram_bot_user")
@Entity
@NoArgsConstructor
public
class TelegramBotUserEntity { // User is expected to be constant and not even used outside of message context - so
    // currently it merged with it
    @Id
    private long id;

    private String userName;
    private String firstName;
    private boolean isBot;

    public TelegramBotUserEntity(TelegramBotUser user) {
        id = getID(user);
        userName = user.userName();
        firstName = user.firstName();
        isBot = user.isBot();
    }

    public static long getID(TelegramBotUser user) {
        return user.userId();
    }

    public TelegramBotUser toDomain() {
        return new TelegramBotUser(id, userName, firstName, isBot);
    }
}
