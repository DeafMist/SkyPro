package course2.lesson4_5.category;

import course2.lesson4_5.transport.Car;

public class DriverCategoryB <A extends Car> extends Driver {
    public DriverCategoryB(String fio, boolean hasLicense, int experience, A car) {
        super(fio, hasLicense, experience, car);
    }
}
