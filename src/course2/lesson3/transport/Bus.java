package course2.lesson3.transport;

public class Bus extends Transport {

    public Bus(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
        setFuel("бензин");
    }

    @Override
    public String refill() {
        return "Заправить " + (getFuel().equals("бензин") ? "бензином" : "дизелем");
    }

    @Override
    public void setFuel(String fuel) {
        if (fuel.equals("бензин") || fuel.equals("дизель")) {
            super.setFuel(fuel);
        }
    }

    @Override
    public String toString() {
        return "Bus{" + super.toString() + "}";
    }
}
