package course2.lesson6.transport;

import course2.lesson6.category.Driver;

public abstract class Car extends Transport {
    public Car(String brand, String model) {
        this(brand, model, 1.5);
    }

    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public abstract boolean getDiagnosed(Driver driver);
}
