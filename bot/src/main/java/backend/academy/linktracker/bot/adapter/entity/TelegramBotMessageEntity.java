package backend.academy.linktracker.bot.adapter.entity;

import backend.academy.linktracker.bot.core.entities.TelegramBotMessage;
import backend.academy.linktracker.bot.core.entities.TelegramBotMessageID;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Version;
import java.time.Instant;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class TelegramBotMessageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "message_id_gen")
    @SequenceGenerator(name = "message_id_gen", sequenceName = "message_id_seq", allocationSize = 10)
    private Long techID;

    private long id;

    private String message;
    private Instant date;
    private long chatID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "chat_id")
    private TelegramBotChatEntity chat;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private TelegramBotUserEntity user;

    @Version
    private Long version;

    public TelegramBotMessageEntity(TelegramBotMessage message) {
        techID = message.id().getTechID();
        id = getID(message.id());
        chatID = message.id().getChatID().getNumericID();
        this.message = message.message();
        date = message.date();
        chat = new TelegramBotChatEntity(message.chat());
        user = new TelegramBotUserEntity(message.user());
    }

    public static long getID(TelegramBotMessageID id) {
        return id.getForChatUniqueId();
    }

    public TelegramBotMessage toDomain() {
        return new TelegramBotMessage(message, toDomainID(), date, chat.toDomain(), user.toDomain());
    }

    public TelegramBotMessageID toDomainID() {
        return new TelegramBotMessageID(id, chat.toDomainID());
    }
}
