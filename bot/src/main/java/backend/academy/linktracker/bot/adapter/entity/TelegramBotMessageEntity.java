package backend.academy.linktracker.bot.adapter.entity;

import backend.academy.linktracker.bot.core.entities.TelegramBotMessage;
import backend.academy.linktracker.bot.core.entities.TelegramBotMessageID;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import java.time.Instant;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "telegram_bot_message")
@NoArgsConstructor
public class TelegramBotMessageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "message_id_gen")
    @SequenceGenerator(name = "message_id_gen", sequenceName = "message_id_seq", allocationSize = 10)
    @Column(name = "message_id")
    private Long messageID;

    @Column(name = "local_chat_id")
    private long localChatID;

    private String message;
    private Instant date;

    @ManyToOne(cascade = {CascadeType.MERGE})
    @JoinColumn(name = "chat_id")
    private BotChatEntity chat;

    @ManyToOne(cascade = {CascadeType.MERGE})
    @JoinColumn(name = "user_id")
    private TelegramBotUserEntity user;

    public TelegramBotMessageEntity(TelegramBotMessage message) {
        messageID = getID(message.id());
        localChatID = message.id().getForChatUniqueId();
        this.message = message.message();
        date = message.date();
        chat = new BotChatEntity(message.chat());
        user = new TelegramBotUserEntity(message.user());
    }

    public static Long getID(TelegramBotMessageID id) {
        return id.getTechID();
    }

    public TelegramBotMessage toDomain() {
        return new TelegramBotMessage(message, toDomainID(), date, chat.toDomain(), user.toDomain());
    }

    public TelegramBotMessageID toDomainID() {
        return new TelegramBotMessageID(messageID, localChatID, chat.toDomainID());
    }
}
