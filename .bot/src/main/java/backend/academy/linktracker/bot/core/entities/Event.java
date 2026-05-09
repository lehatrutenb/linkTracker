package backend.academy.linktracker.bot.core.entities;

import backend.academy.linktracker.bot.core.enums.EventState;
import java.time.Instant;

// No ideas for better naming - it's not just bot event or chat event or even link tracer event
// - it is globally just event id and current state, so may be used in many ways
public record Event(EventID id, EventState state, Instant updatedAt) {}
