package backend.academy.linktracker.bot.core.port;

import backend.academy.linktracker.bot.core.entities.BotChat;
import backend.academy.linktracker.bot.core.entities.BotChatID;
import java.util.Optional;

public interface BotChatEntityRepository {
    Optional<BotChat> getBotChat(BotChatID chatID);
    BotChat createBotChat(BotChat botChat);
    BotChat updateBotChat(BotChat botChat);
    void deleteBotChat(BotChatID chatID);
}
