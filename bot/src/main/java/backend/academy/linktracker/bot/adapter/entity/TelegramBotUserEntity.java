package backend.academy.linktracker.bot.adapter.entity;

import backend.academy.linktracker.bot.core.entities.TelegramBotUser;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Table(name = "telegram_bot_user")
@Entity
@NoArgsConstructor
public class TelegramBotUserEntity {
    @Id
    private long id;

    private String userName;
    private String firstName;
    private boolean isBot;

    @Version
    private Long version;

    public TelegramBotUserEntity(TelegramBotUser user) {
        id = user.userId();
        userName = user.userName();
        firstName = user.firstName();
        isBot = user.isBot();
    }

    public TelegramBotUser toDomain() {
        return new TelegramBotUser(id, userName, firstName, isBot);
    }
}
