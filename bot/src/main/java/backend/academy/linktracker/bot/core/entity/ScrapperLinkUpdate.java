package backend.academy.linktracker.bot.core.entity;

import java.net.URI;
import java.util.List;

public record ScrapperLinkUpdate(LinkUpdateID id, URI url, String description, List<BotChatID> botChatIDS) {}
