package backend.academy.linktracker.bot.core.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class BotChat {
    private final BotChatID botChatID;
    private final String replyService;
}
