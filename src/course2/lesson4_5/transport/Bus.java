package course2.lesson4_5.transport;

import java.time.LocalTime;

public class Bus extends Transport implements Competing {
    public enum TypeCapacity {
        VERY_SMALL(0, 10),
        SMALL(10, 25),
        MEDIUM(40, 50),
        BIG(60, 80),
        VERY_BIG(100, 120);

        private final int from;

        private final int to;

        TypeCapacity(int from, int to) {
            this.from = from;
            this.to = to;
        }

        public int getFrom() {
            return from;
        }

        public int getTo() {
            return to;
        }
    }

    private final TypeCapacity typeCapacity;

    public Bus(String brand, String model) {
        this(brand, model, 1.5);
    }

    public Bus(String brand, String model, double engineVolume) {
        this(brand, model, engineVolume, null);
    }

    public Bus(String brand, String model, double engineVolume, TypeCapacity typeCapacity) {
        super(brand, model, engineVolume);
        this.typeCapacity = typeCapacity;
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
    public void printType() {
        if (typeCapacity == null) {
            System.out.println("Данных об авто недостаточно");
        }
        else {
            System.out.println("Вместимость - от " + typeCapacity.getFrom() + " до " + typeCapacity.getTo() + " мест");
        }
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

    public TypeCapacity getTypeCapacity() {
        return typeCapacity;
    }

    @Override
    public String toString() {
        return "Bus{" + super.toString() + "}";
    }
}
