package course2.lesson7.transport;

import course2.lesson7.logicPackage.Transport;

public abstract class Car extends Transport {
    public Car(String brand, String model) {
        this(brand, model, 1.5);
    }

    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public boolean service() {
        return Math.random() > 0.85;
    }
}
