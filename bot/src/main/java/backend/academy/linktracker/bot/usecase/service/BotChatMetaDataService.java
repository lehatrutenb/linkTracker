package backend.academy.linktracker.bot.usecase.service;

import backend.academy.linktracker.bot.adapter.client.LinkTracerTelegramBotClient;
import backend.academy.linktracker.bot.core.entity.BotChat;
import backend.academy.linktracker.bot.core.entity.BotChatID;
import backend.academy.linktracker.bot.core.port.BotChatEntityRepository;
import java.util.Map;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BotChatMetaDataService {
    private final ApplicationContext applicationContext;
    private final BotChatEntityRepository repository;

    public Optional<LinkTracerTelegramBotClient> getReplyService(BotChatID chatID) {
        var replyServiceQualifier = repository.getBotChat(chatID);
        if (replyServiceQualifier.isEmpty()) {
            return Optional.empty();
        }
        return applicationContext.getBeansWithAnnotation(Qualifier.class).entrySet().stream()
                .filter(bean -> applicationContext
                        .findAnnotationOnBean(bean.getKey(), Qualifier.class)
                        .value()
                        .equals(replyServiceQualifier.orElseThrow().getReplyService()))
                .map(Map.Entry::getValue)
                .map(LinkTracerTelegramBotClient.class::cast)
                .findAny();
    }

    public void createBotChat(BotChat botChat) {
        repository.createBotChat(botChat);
    }
}
