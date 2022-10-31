package course2.lesson4;

import course2.lesson4.transport.Transport;

import java.util.Objects;

public abstract class Driver {
    private String fio;

    private boolean hasLicense;

    private final int experience;

    public Driver(String fio, boolean hasLicense, int experience) {
        setFio(fio);
        isHasLicense();

        if (experience < 0) {
            experience = Math.abs(experience);
        }

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

    public boolean isHasLicense() {
        return hasLicense;
    }

    public void setHasLicense(boolean hasLicense) {
        if (hasLicense == false) {
            throw new IllegalArgumentException("Чтобы управлять автомобилем, водитель должен иметь права");
        }

        this.hasLicense = true;
    }

    public int getExperience() {
        return experience;
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
}
