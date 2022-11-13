package course2.lesson7.logicPackage;

import course2.lesson7.Main;
import course2.lesson7.transport.Competing;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Transport implements Competing {
    private final String brand;

    private final String model;

    private double engineVolume;

    private Driver<?> driver;

    private final List<Sponsor> sponsors = new ArrayList<>();

    private final List<Mechanic<?>> mechanics = new ArrayList<>();

    public Transport(String brand, String model) {
        this(brand, model, 1.5);
    }

    public Transport(String brand, String model, double engineVolume) {
        this.brand = Main.doCorrectStringIfNeeded(brand);
        this.model = Main.doCorrectStringIfNeeded(model);
        setEngineVolume(engineVolume);
    }

    public abstract void startMoving();

    public abstract void endMoving();

    @Override
    public void pitStop() {
        System.out.println(getBrand() + " " + getModel() + " заезжает на пит-стоп");
    }

    @Override
    public void bestLapTime(LocalTime startTime, LocalTime endTime) {
        System.out.println("Лучшее время круга " + getBrand() + " " + getModel() + ": " +
                (endTime.getHour() - startTime.getHour()) + " часов, " +
                (endTime.getMinute() - startTime.getMinute()) + " минут, " +
                (endTime.getSecond() - startTime.getSecond()) + " секунд");
    }

    @Override
    public void maxSpeed(double speed) {
        System.out.println("Максимальная скорость " + getBrand() + " " + getModel() + ": " + speed);
    }

    public abstract void printType();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume < 0) {
            engineVolume = Math.abs(engineVolume);
        }

        this.engineVolume = engineVolume;
    }

    public Driver<?> getDriver() {
        return driver;
    }

    void setDriver(Driver<?> driver) {
        this.driver = driver;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    void addSponsor(Sponsor sponsor) {
        sponsors.add(sponsor);
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    <T extends Transport> void addMechanic(Mechanic<T> mechanic) {
        mechanics.add(mechanic);
    }

    public void repair() {
        System.out.println(getBrand() + " " + getModel() + " починена");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && brand.equals(transport.brand) && model.equals(transport.model) && Objects.equals(driver, transport.driver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, driver);
    }

    @Override
    public String toString() {
        return "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", driver=" + driver;
    }
}
