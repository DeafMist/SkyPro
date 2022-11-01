package course2.lesson4_5.category;

import course2.lesson4_5.transport.Truck;

public class DriverCategoryC <A extends Truck> extends Driver {
    public DriverCategoryC(String fio, boolean hasLicense, int experience, A car) {
        super(fio, hasLicense, experience, car);
    }
}
