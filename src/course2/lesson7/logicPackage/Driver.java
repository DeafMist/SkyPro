package course2.lesson7.logicPackage;

import course2.lesson7.Main;
import course2.lesson7.license.License;
import course2.lesson7.transport.Bus;
import course2.lesson7.transport.PassengerCar;
import course2.lesson7.transport.Truck;

import java.util.Objects;

public class Driver <A extends Transport> {
    private String fio;

    private final License license;

    private final int experience;

    private A car;

    public Driver(String fio, License license, int experience, A car) {
        setFio(fio);

        if (experience < 0) {
            experience = Math.abs(experience);
        }

        if (license == null) {
            throw new IllegalArgumentException("Необходимо указать тип прав!");
        }

        if (car instanceof PassengerCar && license != License.B ||
                car instanceof Truck && license != License.C ||
                car instanceof Bus && license != License.D) {
            throw new IllegalArgumentException("Неверный тип прав!");
        }

        setCar(car);
        this.license = license;
        this.experience = experience;
    }

    public void startMoving() {
        System.out.println("Водитель " + getFio() + " начинает движение");

    }

    public void stopMoving() {
        System.out.println("Водитель " + getFio() + " заканчивает движение");
    }

    public void refuelCar() {
        System.out.println("Водитель " + getFio() + " заправляет машину");

    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = Main.doCorrectStringIfNeeded(fio);
    }

    public License getLicense() {
        return license;
    }

    public int getExperience() {
        return experience;
    }

    public A getCar() {
        return car;
    }

    private void setCar(A car) {
        car.setDriver(this);
        this.car = car;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver<?> driver = (Driver<?>) o;
        return experience == driver.experience && fio.equals(driver.fio) && license.equals(driver.license);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fio, license, experience);
    }

    @Override
    public String toString() {
        if (getCar() == null) {
            return "У водителя нет машины";
        }

        return "Водитель " + getFio() + " управляет автомобилем " + getCar().getBrand() + " " + getCar().getModel() +
                " и будет участвовать в заездe";
    }
}
