package backend.academy.linktracker.bot.core.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class BotChat {
    private final BotChatID id;
    private final String replyService;
}
