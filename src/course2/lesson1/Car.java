package course2.lesson1;

public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    public Car() {

    }

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        if (brand == null) {
            brand = "default";
        }

        if (model == null) {
            model = "default";
        }

        if (productionCountry == null) {
            productionCountry = "default";
        }

        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }

        if (color == null) {
            color = "белый";
        }

        if (productionYear <= 0) {
            productionYear = 2000;
        }

        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
    }
}
