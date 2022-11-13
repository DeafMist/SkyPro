package course2.lesson7.transport;

import java.util.ArrayDeque;
import java.util.Queue;

public class ServiceStation {
    private Queue<Car> cars = new ArrayDeque<>();

    public void add(Car car) {
        cars.offer(car);
    }

    public void service() {
        if (!cars.isEmpty()) {
            Car car = cars.poll();

            if (!car.service()) {
                car.repair();
            }
        }
    }
}
