package backend.academy.linktracker.bot.core.entities;

import java.net.URI;
import java.util.List;

public record LinkUpdate(LinkUpdateID id, URI url, String description, List<BotChatID> botChatIDS) {}
