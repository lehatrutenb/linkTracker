package backend.academy.linktracker.bot.core.port;

import backend.academy.linktracker.bot.core.entities.BotChat;
import backend.academy.linktracker.bot.core.entities.BotChatID;
import java.util.Optional;

public interface ReplyServiceMatcherRepository {
    Optional<BotChat> getBotChat(BotChatID chatID);

    void addBotChat(BotChat botChat);
}
