package backend.academy.linktracker.scrapper.adapter.scrapper.github;

import backend.academy.linktracker.scrapper.adapter.scrapper.github.models.CommitCommentEvent;
import backend.academy.linktracker.scrapper.adapter.scrapper.github.models.CreateEvent;
import backend.academy.linktracker.scrapper.adapter.scrapper.github.models.DeleteEvent;
import backend.academy.linktracker.scrapper.adapter.scrapper.github.models.DiscussionEvent;
import backend.academy.linktracker.scrapper.adapter.scrapper.github.models.EventPayload;
import backend.academy.linktracker.scrapper.adapter.scrapper.github.models.ForkEvent;
import backend.academy.linktracker.scrapper.adapter.scrapper.github.models.GollumEvent;
import backend.academy.linktracker.scrapper.adapter.scrapper.github.models.IssueCommentEvent;
import backend.academy.linktracker.scrapper.adapter.scrapper.github.models.IssuesEvent;
import backend.academy.linktracker.scrapper.adapter.scrapper.github.models.MemberEvent;
import backend.academy.linktracker.scrapper.adapter.scrapper.github.models.PullRequestEvent;
import backend.academy.linktracker.scrapper.adapter.scrapper.github.models.PullRequestReviewCommentEvent;
import backend.academy.linktracker.scrapper.adapter.scrapper.github.models.PullRequestReviewEvent;
import backend.academy.linktracker.scrapper.adapter.scrapper.github.models.PushEvent;
import backend.academy.linktracker.scrapper.adapter.scrapper.github.models.ReleaseEvent;
import backend.academy.linktracker.scrapper.adapter.scrapper.github.models.WatchEvent;
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
        typeMap.put("IssueCommentEvent", null); // Badly parse it - so ignore and null
        typeMap.put("ReleaseEvent", ReleaseEvent.class);
        typeMap.put("ForkEvent", ForkEvent.class);
    }

    @Override
    public EventPayload deserialize(JsonParser p, DeserializationContext ctxt) throws JacksonException {
        Class<? extends EventPayload> targetClass = typeMap.get(type);
        if (targetClass != null) {
            return ctxt.readValue(p, ctxt.constructType(targetClass));
        }

        return null;
    }
}
