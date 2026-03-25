package backend.academy.linktracker.scrapper.configuration;

import backend.academy.linktracker.scrapper.adapters.controllers.github.CustomURIDeserializer;
import backend.academy.linktracker.scrapper.adapters.controllers.github.EventDeserializer;
import backend.academy.linktracker.scrapper.adapters.controllers.github.ProblematicClassDeserializer;
import backend.academy.linktracker.scrapper.adapters.controllers.github.models.Event;
import backend.academy.linktracker.scrapper.adapters.controllers.github.models.EventPayload;
import backend.academy.linktracker.scrapper.adapters.controllers.github.models.IntegrationOwner;
import java.net.URI;
import org.springframework.boot.jackson.autoconfigure.JsonMapperBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tools.jackson.databind.JacksonModule;
import tools.jackson.databind.json.JsonMapper;
import tools.jackson.databind.module.SimpleModule;

@Configuration
public class JacksonConfig {
    @Bean
    public JsonMapperBuilderCustomizer jsonMapperBuilderCustomizer() {
        return builder -> builder.addModule(customURIModule()).build();
    }

    @Bean
    public JsonMapper jsonMapper() {
        var builder = JsonMapper.builder();
        jsonMapperBuilderCustomizer()
                .customize(builder); // Am i really need to create builder here ot it will work automatically?
        return new JsonMapper(builder);
    }

    public static JacksonModule customURIModule() {
        SimpleModule module = new SimpleModule();
        module.addDeserializer(URI.class, new CustomURIDeserializer());
        return module;
    }

    public static JacksonModule customGithubAPIEventModule() {
        SimpleModule module = (SimpleModule) customURIModule();
        module.addDeserializer(EventPayload.class, new ProblematicClassDeserializer<>());
        module.addDeserializer(IntegrationOwner.class, new ProblematicClassDeserializer<>());
        module.addDeserializer(Event.class, new EventDeserializer());
        return module;
    }
}
