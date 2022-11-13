package course2.lesson7.transport;

import course2.lesson7.license.License;

public class PassengerCar extends Car {
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

    public static final License LICENSE = License.B;

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
    public void startMoving() {
        System.out.println("Легковой автомобиль " + getBrand() + " " + getModel() + " начинает движение");
    }

    @Override
    public void endMoving() {
        System.out.println("Легковой автомобиль " + getBrand() + " " + getModel() + " заканчивает движение");
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

    public BodyType getBodyType() {
        return bodyType;
    }

    @Override
    public String toString() {
        return "PassengerCar{" + super.toString() + "}";
    }
}
