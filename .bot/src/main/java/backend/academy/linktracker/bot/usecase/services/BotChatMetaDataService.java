package backend.academy.linktracker.bot.usecase.services;

import backend.academy.linktracker.bot.adapter.controller.LinkTracerTelegramBotReplier;
import backend.academy.linktracker.bot.core.entities.BotChat;
import backend.academy.linktracker.bot.core.entities.BotChatID;
import backend.academy.linktracker.bot.core.port.ReplyServiceMatcherRepository;
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
    private final ReplyServiceMatcherRepository serviceMatcherRepository;

    public Optional<LinkTracerTelegramBotReplier> getReplyService(BotChatID chatID) {
        var replyServiceQualifier = serviceMatcherRepository.getBotChat(chatID);
        if (replyServiceQualifier.isEmpty()) {
            return Optional.empty();
        }
        return applicationContext.getBeansWithAnnotation(Qualifier.class).entrySet().stream()
                .filter(bean -> applicationContext
                        .findAnnotationOnBean(bean.getKey(), Qualifier.class)
                        .value()
                        .equals(replyServiceQualifier.orElseThrow()))
                .map(Map.Entry::getValue)
                .map(replier -> (LinkTracerTelegramBotReplier) replier)
                .findAny();
    }

    public void addBotChat(BotChat botChat) {
        serviceMatcherRepository.addBotChat(botChat);
    }
}
