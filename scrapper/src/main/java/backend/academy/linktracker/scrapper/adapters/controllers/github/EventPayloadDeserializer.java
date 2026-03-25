package backend.academy.linktracker.scrapper.adapters.controllers.github;

import backend.academy.linktracker.scrapper.adapters.controllers.github.models.CommitCommentEvent;
import backend.academy.linktracker.scrapper.adapters.controllers.github.models.CreateEvent;
import backend.academy.linktracker.scrapper.adapters.controllers.github.models.DeleteEvent;
import backend.academy.linktracker.scrapper.adapters.controllers.github.models.DiscussionEvent;
import backend.academy.linktracker.scrapper.adapters.controllers.github.models.EventPayload;
import backend.academy.linktracker.scrapper.adapters.controllers.github.models.ForkEvent;
import backend.academy.linktracker.scrapper.adapters.controllers.github.models.GollumEvent;
import backend.academy.linktracker.scrapper.adapters.controllers.github.models.IssueCommentEvent;
import backend.academy.linktracker.scrapper.adapters.controllers.github.models.IssuesEvent;
import backend.academy.linktracker.scrapper.adapters.controllers.github.models.MemberEvent;
import backend.academy.linktracker.scrapper.adapters.controllers.github.models.PullRequestEvent;
import backend.academy.linktracker.scrapper.adapters.controllers.github.models.PullRequestReviewCommentEvent;
import backend.academy.linktracker.scrapper.adapters.controllers.github.models.PullRequestReviewEvent;
import backend.academy.linktracker.scrapper.adapters.controllers.github.models.PushEvent;
import backend.academy.linktracker.scrapper.adapters.controllers.github.models.ReleaseEvent;
import backend.academy.linktracker.scrapper.adapters.controllers.github.models.WatchEvent;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import lombok.Setter;
import tools.jackson.core.JacksonException;
import tools.jackson.core.JsonParser;
import tools.jackson.databind.DeserializationContext;
import tools.jackson.databind.ValueDeserializer;

public class EventPayloadDeserializer extends ValueDeserializer<EventPayload> {
    private final Map<String, Class<? extends EventPayload>> typeMap = new ConcurrentHashMap<>();

    @Setter
    private String type;

    public EventPayloadDeserializer() {
        super();
        typeMap.put("PullRequestReviewCommentEvent", PullRequestReviewCommentEvent.class);
        typeMap.put("PullRequestReviewEvent", PullRequestReviewEvent.class);
        typeMap.put("PullRequestEvent", PullRequestEvent.class);
        typeMap.put("PushEvent", PushEvent.class);
        typeMap.put("CreateEvent", CreateEvent.class);
        typeMap.put("WatchEvent", WatchEvent.class);
        typeMap.put("GollumEvent", GollumEvent.class);
        typeMap.put("MemberEvent", MemberEvent.class);
        typeMap.put("IssuesEvent", IssuesEvent.class);
        typeMap.put("CommitCommentEvent", CommitCommentEvent.class);
        typeMap.put("DiscussionEvent", DiscussionEvent.class);
        typeMap.put("DeleteEvent", DeleteEvent.class);
        typeMap.put("IssueCommentEvent", IssueCommentEvent.class);
        typeMap.put("ReleaseEvent", ReleaseEvent.class);
        typeMap.put("ForkEvent", ForkEvent.class);
    }

    @Override
    public EventPayload deserialize(JsonParser p, DeserializationContext ctxt) throws JacksonException {
        Class<? extends EventPayload> targetClass = typeMap.get(type);
        if (targetClass != null) {
            var deserializer = ctxt.findNonContextualValueDeserializer(ctxt.constructType(targetClass));
            return (EventPayload) deserializer.deserialize(p, ctxt);
        }

        return null;
    }
}
