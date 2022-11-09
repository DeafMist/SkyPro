package course2.lesson6.category;

import course2.lesson6.Main;
import course2.lesson6.transport.Transport;

import java.util.Objects;

public abstract class Driver <A extends Transport> {
    private String fio;

    private boolean hasLicense;

    private final int experience;

    private A car;

    public Driver(String fio, boolean hasLicense, int experience, A car) {
        setFio(fio);

        if (experience < 0) {
            experience = Math.abs(experience);
        }

        if (car == null) {
            throw new IllegalArgumentException("У водителя должна быть машина");
        }

        this.hasLicense = hasLicense;
        this.experience = experience;
        this.car = car;
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

    public boolean isHasLicense() {
        return hasLicense;
    }

    public void setHasLicense(boolean hasLicense) {
        this.hasLicense = true;
    }

    public int getExperience() {
        return experience;
    }

    public A getCar() {
        return car;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return hasLicense == driver.hasLicense && experience == driver.experience && fio.equals(driver.fio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fio, hasLicense, experience);
    }

    @Override
    public String toString() {
        return "Водитель " + getFio() + " управляет автомобилем " + getCar().getBrand() + " " + getCar().getModel() +
                " и будет участвовать в заездe";
    }
}
