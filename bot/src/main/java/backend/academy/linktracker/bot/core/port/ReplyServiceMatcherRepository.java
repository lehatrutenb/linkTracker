package backend.academy.linktracker.bot.core.port;

import backend.academy.linktracker.bot.core.entities.BotChat;
import backend.academy.linktracker.bot.core.entities.BotChatID;
import java.util.Collection;
import java.util.Optional;

public interface ReplyServiceMatcherRepository {
    Collection<BotChat> readAllBotChats();
    Optional<BotChat> readBotChat(BotChatID chatID);
    void createBotChat(BotChat botChat);
    BotChat updateBotChat(BotChat botChat);
    void deleteBotChatByID(BotChatID chatID);
}