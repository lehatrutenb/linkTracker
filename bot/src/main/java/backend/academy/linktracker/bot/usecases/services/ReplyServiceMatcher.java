package backend.academy.linktracker.bot.usecases.services;

import backend.academy.linktracker.bot.adapters.controllers.LinkTracerTelegramBotReplier;
import backend.academy.linktracker.bot.adapters.repository.ReplyServiceMatcherRepository;
import backend.academy.linktracker.bot.core.entities.TelegramBotChatID;
import java.util.Map;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReplyServiceMatcher {
    private final ApplicationContext applicationContext;
    private final ReplyServiceMatcherRepository serviceMatcherRepository;

    public Optional<LinkTracerTelegramBotReplier> getReplyService(TelegramBotChatID chatID) {
        var replyServiceQualifier = serviceMatcherRepository.getReplyServiceQualifier(chatID);
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

    public void setReplyService(TelegramBotChatID chatID, Qualifier replyServiceQualifier) {
        serviceMatcherRepository.setReplyServiceQualifier(chatID, replyServiceQualifier.value());
    }
}
