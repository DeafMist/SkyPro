package course2.lesson6.category;

import course2.lesson6.transport.Bus;

public class DriverCategoryD <A extends Bus> extends Driver {
    public DriverCategoryD(String fio, boolean hasLicense, int experience, A car) {
        super(fio, hasLicense, experience, car);
    }
}
