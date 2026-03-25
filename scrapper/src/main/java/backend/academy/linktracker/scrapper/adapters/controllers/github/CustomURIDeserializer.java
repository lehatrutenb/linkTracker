package backend.academy.linktracker.scrapper.adapters.controllers.github;

import java.net.URI;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import org.springframework.boot.jackson.JacksonComponent;
import tools.jackson.core.JacksonException;
import tools.jackson.core.JsonParser;
import tools.jackson.core.JsonToken;
import tools.jackson.databind.DeserializationContext;
import tools.jackson.databind.ValueDeserializer;

@JacksonComponent
public class CustomURIDeserializer extends ValueDeserializer<URI> { // TODO move deserilizers to another idir
    @Override
    public URI deserialize(JsonParser p, DeserializationContext ctxt) throws JacksonException {
        JsonToken token = p.currentToken();

        if (token == JsonToken.VALUE_STRING) {
            String uriString = p.getString();
            if (uriString == null || uriString.trim().isEmpty()) {
                return null;
            }
            return URI.create(
                    URLEncoder.encode(URLDecoder.decode(uriString, StandardCharsets.UTF_8), StandardCharsets.UTF_8)
                            .replace("+", "%20")
                            .replace("%2F", "/")
                            .replace("%3A", ":"));
        }
        return null;
    }
}
