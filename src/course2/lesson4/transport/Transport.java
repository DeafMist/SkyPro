package course2.lesson4.transport;

import course2.lesson4.Main;

import java.util.Objects;

public abstract class Transport {
    private final String brand;

    private final String model;

    private double engineVolume;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && brand.equals(transport.brand) && model.equals(transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume);
    }

    @Override
    public String toString() {
        return "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume;
    }
}
