package course2.lesson4;

import course2.lesson4.transport.Bus;

public class DriverCategoryD <A extends Bus> extends Driver{
    private final A car;

    public DriverCategoryD(String fio, boolean hasLicense, int experience, A car) {
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
