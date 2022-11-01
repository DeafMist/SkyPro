package course2.lesson4.transport;

import java.time.LocalTime;

public class Truck extends Transport implements Competing {
    public Truck(String brand, String model) {
        super(brand, model);
    }

    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Грузовой автомобиль начинает движение");
    }

    @Override
    public void endMoving() {
        System.out.println("Грузовой автомобиль заканчивает движение");
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
        return "Truck{" + super.toString() + "}";
    }
}
