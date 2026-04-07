package backend.academy.linktracker.scrapper.adapters.controllers.github;

import backend.academy.linktracker.scrapper.adapters.controllers.github.models.Actor;
import backend.academy.linktracker.scrapper.adapters.controllers.github.models.Event;
import backend.academy.linktracker.scrapper.adapters.controllers.github.models.EventPayload;
import backend.academy.linktracker.scrapper.adapters.controllers.github.models.EventRepo;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import tools.jackson.core.JacksonException;
import tools.jackson.core.JsonParser;
import tools.jackson.databind.DeserializationContext;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.ValueDeserializer;

public class EventDeserializer extends ValueDeserializer<Event> {
    @Override
    public Event deserialize(JsonParser p, DeserializationContext ctxt) throws JacksonException {
        JsonNode rootNode = p.objectReadContext().readTree(p);
        var readContext = p.objectReadContext();

        Event event = new Event();
        event.setType(JsonNullable.of(rootNode.get("type").asString()));
        event.setId(rootNode.get("id").asString());
        event.setPublic(rootNode.get("public").asBoolean());
        event.setActor(readContext.readValue(rootNode.get("actor").traverse(ctxt), Actor.class));
        event.setOrg(
                Optional.ofNullable(readContext.readValue(rootNode.get("org").traverse(ctxt), Actor.class)));
        event.setRepo(readContext.readValue(rootNode.get("repo").traverse(ctxt), EventRepo.class));
        event.setCreatedAt(JsonNullable.of(
                readContext.readValue(rootNode.get("created_at").traverse(ctxt), OffsetDateTime.class)));

        ctxt.setAttribute("type", event.getType());
        event.setPayload(readContext.readValue(rootNode.get("payload").traverse(ctxt), EventPayload.class));
        return event;
    }
}
