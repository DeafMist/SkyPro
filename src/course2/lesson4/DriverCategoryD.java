package course2.lesson4;

import course2.lesson4.transport.Bus;
import course2.lesson4.transport.Transport;

public class DriverCategoryD <A extends Bus> extends Driver{
    public DriverCategoryD(String fio, boolean hasLicense, int experience, A car) {
        super(fio, hasLicense, experience, car);
    }
}
