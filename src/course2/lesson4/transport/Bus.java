package course2.lesson4.transport;

import java.time.LocalTime;

public class Bus extends Transport implements Competing {
    public Bus(String brand, String model) {
        super(brand, model);
    }

    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Автобус начинает движение");
    }

    @Override
    public void endMoving() {
        System.out.println("Автобус заканчивает движение");
    }

    @Override
    public void pitStop() {
        System.out.println(getBrand() + " " + getModel() + " заезжает на пит-стоп");
    }

    @Override
    public void bestLapTime(LocalTime startTime, LocalTime endTime) {

        System.out.println("Лучшее время круга: " + (endTime.getHour() - startTime.getHour()) + " часов, " +
                (endTime.getMinute() - startTime.getMinute()) + " минут, " +
                (endTime.getSecond() - startTime.getSecond()) + " секунд");
    }

    @Override
    public void maxSpeed(double speed) {
        System.out.println("Максимальная скорость: " + speed);
    }

    @Override
    public String toString() {
        return "Bus{" + super.toString() + "}";
    }
}
