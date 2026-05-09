package backend.academy.linktracker.bot.core.entities;

import jakarta.validation.Valid;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public record LinkUpdate(LinkUpdateID id, URI url, String description, List<BotChatID> botChatIDS) {
}
