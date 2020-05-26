package utils.schedule;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/**
 * For general Schedule-related resources to avoid
 * duplicate objects
 * @author villa
 */
public class Schedule {
    public static final ScheduledExecutorService SCHEDULER =
     Executors.newScheduledThreadPool(1);
}
