package pl.edu.agh.asd3.utils;

import java.time.Duration;
import java.time.Instant;

public class TimeMeasure {

    private Instant start;
    private long result;

    public void startMeasurement() {
        start = Instant.now();
    }

    public void stopMeasurement() {
        Instant stop = Instant.now();
        result = Duration.between(start, stop).toNanos();
    }

    public long getResult() {
        return result;
    }
}
