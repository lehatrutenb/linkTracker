package backend.academy.linktracker.scrapper.configuration;

import backend.academy.linktracker.scrapper.adapter.scrapper.github.EventDeserializer;
import backend.academy.linktracker.scrapper.adapter.scrapper.github.models.Event;
import backend.academy.linktracker.scrapper.usecase.deserializer.CustomURIDeserializer;
import java.net.URI;
import org.springframework.boot.jackson.autoconfigure.JsonMapperBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tools.jackson.databind.DeserializationFeature;
import tools.jackson.databind.JacksonModule;
import tools.jackson.databind.json.JsonMapper;
import tools.jackson.databind.module.SimpleModule;

@Configuration
public class JacksonConfig {
    @Bean
    public JsonMapperBuilderCustomizer jsonMapperBuilderCustomizer() {
        return builder ->
                builder.disable(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE).addModule(customURIModule());
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
        module.addDeserializer(Event.class, new EventDeserializer());
        return module;
    }
}
