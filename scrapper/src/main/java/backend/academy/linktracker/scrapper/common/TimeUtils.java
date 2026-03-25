package backend.academy.linktracker.scrapper.common;

import java.time.Instant;
import org.springframework.stereotype.Component;

@Component
public class TimeUtils {
    public Instant now() {
        return Instant.now();
    }
}
