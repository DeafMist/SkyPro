package course2.lesson6.transport;

import java.time.LocalTime;

public interface Competing {
    void pitStop();

    void bestLapTime(LocalTime startTime, LocalTime endTime);

    void maxSpeed(double speed);
}
