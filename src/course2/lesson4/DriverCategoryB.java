package course2.lesson4;

import course2.lesson4.transport.Car;
import course2.lesson4.transport.Transport;

public class DriverCategoryB <A extends Car> extends Driver {
    public DriverCategoryB(String fio, boolean hasLicense, int experience, A car) {
        super(fio, hasLicense, experience, car);
    }

    @Override
    public String toString() {
        return "Водитель " + getFio() + " управляет автомобилем " + getCar().getBrand() + " " + getCar().getModel() +
                " и будет участвовать в заездe";
    }
}