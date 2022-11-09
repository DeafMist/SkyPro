package course2.lesson6.category;

import course2.lesson6.transport.PassengerCar;

public class DriverCategoryB <A extends PassengerCar> extends Driver {
    public DriverCategoryB(String fio, boolean hasLicense, int experience, A car) {
        super(fio, hasLicense, experience, car);
    }
}
