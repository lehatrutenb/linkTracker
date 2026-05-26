package backend.academy.linktracker.bot.core.port;

import backend.academy.linktracker.bot.core.entity.BotChat;
import backend.academy.linktracker.bot.core.entity.BotChatID;
import java.util.Optional;

public interface BotChatEntityRepository {
    Optional<BotChat> getBotChat(BotChatID chatID);

    BotChat createBotChat(BotChat botChat);

    BotChat updateBotChat(BotChat botChat);

    void deleteBotChat(BotChatID chatID);
}
