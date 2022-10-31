package course2.lesson4;

import course2.lesson4.transport.Car;

public class DriverCategoryB <A extends Car> extends Driver {
    private final A car;

    public DriverCategoryB(String fio, boolean hasLicense, int experience, A car) {
        super(fio, hasLicense, experience);

        if (car == null) {
            throw new IllegalArgumentException("У водителя должна быть машина");
        }

        this.car = car;
    }

    public A getCar() {
        return car;
    }

    @Override
    public String toString() {
        return "Водитель " + getFio() + " управляет автомобилем " + getCar().getBrand() + " " + getCar().getModel() +
                " и будет участвовать в заездe";
    }
}
