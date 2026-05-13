package backend.academy.linktracker.scrapper.adapter.scrapper.github;

import lombok.extern.slf4j.Slf4j;
import tools.jackson.core.JacksonException;
import tools.jackson.core.JsonParser;
import tools.jackson.databind.DeserializationContext;
import tools.jackson.databind.ValueDeserializer;

@Slf4j
public class ProblematicClassDeserializer<T> extends ValueDeserializer<T> {
    @Override
    public T deserialize(JsonParser p, DeserializationContext ctxt) throws JacksonException {
        log.debug("Got problematic class");
        return null;
    }
}
