package course2.lesson6.transport;

import course2.lesson6.category.Driver;

import java.time.LocalTime;

public class PassengerCar extends Car implements Competing {
    public enum BodyType {
        SEDAN("седан"),
        HATCHBACK("хетчбек"),
        COUPE("купе"),
        UNIVERSAL("универсал"),
        SUV("внедорожник"),
        CROSSOVER("кроссовер"),
        PICKUP("пикап"),
        VAN("фургон"),
        MINIVAN("минивэн");

        private final String name;

        BodyType(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    private final BodyType bodyType;

    public PassengerCar(String brand, String model) {
        this(brand, model, 1.5);
    }

    public PassengerCar(String brand, String model, double engineVolume) {
        this(brand, model, engineVolume, null);
    }

    public PassengerCar(String brand, String model, double engineVolume, BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
    }

    @Override
    public boolean getDiagnosed(Driver driver) {
        return driver.getCar().equals(this) && driver.isHasLicense();
    }

    @Override
    public void startMoving() {
        System.out.println("Легковой автомобиль начинает движение");
    }

    @Override
    public void endMoving() {
        System.out.println("Легковой автомобиль заканчивает движение");
    }

    @Override
    public void printType() {
        if (bodyType == null) {
            System.out.println("Данных об авто недостаточно");
        }
        else {
            System.out.println("Тип кузова - " + bodyType.getName());
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

    public BodyType getBodyType() {
        return bodyType;
    }

    @Override
    public String toString() {
        return "PassengerCar{" + super.toString() + "}";
    }
}
