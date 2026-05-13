package backend.academy.linktracker.bot.usecase.service;

import backend.academy.linktracker.bot.core.entity.CommandHandler;
import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CommandsMetaDataService {
    private final ApplicationContext applicationContext;

    public Collection<CommandHandler> getAllCommandList() {
        Map<String, Object> nameToBean = applicationContext.getBeansWithAnnotation(CommandHandler.class);
        return nameToBean.keySet().stream()
                .map(beanName -> applicationContext.findAnnotationOnBean(beanName, CommandHandler.class))
                .toList();
    }

    public Collection<CommandHandler> getUserCommandList() {
        return getAllCommandList().stream().filter(CommandHandler::showToUser).toList();
    }

    /**
     * Return CommandHandler annotation by command string
     * @param command - command string, like "/help" or "/start"
     * @return : Optional.empty() if no such CommandHandler found, Optional.of(CommandHandler) otherwise
     */
    public Optional<CommandHandler> getCommandHandlerByCommand(String command) {
        return getAllCommandList().stream()
                .filter(commandHandler -> commandHandler.command().equals(command))
                .findAny();
    }
}
