package course2.lesson6.transport;

import course2.lesson6.category.Driver;

import java.time.LocalTime;

public class Truck extends Car implements Competing {
    public enum TypeLoadCapacity {
        N1(0, 3.5),
        N2(3.5, 12),
        N3(12, Double.MAX_VALUE);

        private final double from;

        private final double to;

        TypeLoadCapacity(double from, double to) {
            this.from = from;
            this.to = to;
        }

        public double getFrom() {
            return from;
        }

        public double getTo() {
            return to;
        }
    }

    private final TypeLoadCapacity typeLoadCapacity;

    public Truck(String brand, String model) {
        this(brand, model, 1.5);
    }

    public Truck(String brand, String model, double engineVolume) {
        this(brand, model, engineVolume, null);
    }

    public Truck(String brand, String model, double engineVolume, TypeLoadCapacity typeLoadCapacity) {
        super(brand, model, engineVolume);
        this.typeLoadCapacity = typeLoadCapacity;
    }

    @Override
    public boolean getDiagnosed(Driver driver) {
        return driver.getCar().equals(this) && driver.isHasLicense();
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
    public void printType() {
        if (typeLoadCapacity == null) {
            System.out.println("Данных об авто недостаточно");
        }
        else {
            System.out.println("Грузоподъемность - от " + typeLoadCapacity.getFrom() + " до " + typeLoadCapacity.getTo() + " тонн");
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

    public TypeLoadCapacity getTypeLoadCapacity() {
        return typeLoadCapacity;
    }

    @Override
    public String toString() {
        return "Truck{" + super.toString() + "}";
    }
}
