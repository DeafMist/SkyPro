package course2.lesson3.transport;

public abstract class Transport {
    private final String brand;

    private final String model;

    private final int productionYear;

    private final String productionCountry;

    private String color;

    private int maxSpeed;

    private String fuel;

    public Transport(String brand, String model, int productionYear, String productionCountry) {
        this(brand, model, productionYear, productionCountry, null, 100);
    }

    public Transport(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed) {
        if (brand == null || brand.isEmpty()) {
            brand = "default";
        }

        if (model == null || model.isEmpty()) {
            model = "default";
        }

        if (productionYear <= 0) {
            productionYear = 2000;
        }

        if (productionCountry == null || productionCountry.isEmpty()) {
            productionCountry = "default";
        }

        setColor(color);

        setMaxSpeed(maxSpeed);

        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
    }

    public abstract String refill();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty()) {
            color = "белый";
        }

        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed < 0) {
            maxSpeed = Math.abs(maxSpeed);
        }

        this.maxSpeed = maxSpeed;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    };

    @Override
    public String toString() {
        return "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", productionYear=" + productionYear +
                ", productionCountry='" + productionCountry + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", fuel=" + fuel + '\'';
    }
}
