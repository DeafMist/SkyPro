package course2.lesson4;

import course2.lesson4.transport.Bus;
import course2.lesson4.transport.Transport;

public class DriverCategoryD <A extends Bus> extends Driver{
    public DriverCategoryD(String fio, boolean hasLicense, int experience, A car) {
        super(fio, hasLicense, experience, car);
    }

    @Override
    public String toString() {
        return "Водитель " + getFio() + " управляет автомобилем " + getCar().getBrand() + " " + getCar().getModel() +
                " и будет участвовать в заездe";
    }
}
