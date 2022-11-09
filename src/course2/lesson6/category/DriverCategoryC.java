package course2.lesson6.category;

import course2.lesson6.transport.Truck;

public class DriverCategoryC <A extends Truck> extends Driver {
    public DriverCategoryC(String fio, boolean hasLicense, int experience, A car) {
        super(fio, hasLicense, experience, car);
    }
}
