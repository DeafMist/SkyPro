package course2.lesson7.transport;

import course2.lesson7.license.License;

public class Truck extends Car {
    public enum TypeLoadCapacity {
        N1(0, 3.5),
        N2(3.5, 12),
        N3(12, Double.MAX_VALUE);

        private final double from;

        private final double to;

        TypeLoadCapacity(double from, double to) {
            this.from = from;
            this.to = to;
        }

        public double getFrom() {
            return from;
        }

        public double getTo() {
            return to;
        }
    }

    private final TypeLoadCapacity typeLoadCapacity;

    public static License LICENSE = License.C;

    public Truck(String brand, String model) {
        this(brand, model, 1.5);
    }

    public Truck(String brand, String model, double engineVolume) {
        this(brand, model, engineVolume, null);
    }

    public Truck(String brand, String model, double engineVolume, TypeLoadCapacity typeLoadCapacity) {
        super(brand, model, engineVolume);
        this.typeLoadCapacity = typeLoadCapacity;
    }

    @Override
    public void startMoving() {
        System.out.println("Грузовой автомобиль " + getBrand() + " " + getModel() + " начинает движение");
    }

    @Override
    public void endMoving() {
        System.out.println("Грузовой автомобиль " + getBrand() + " " + getModel() + " заканчивает движение");
    }

    @Override
    public void printType() {
        if (typeLoadCapacity == null) {
            System.out.println("Данных об авто недостаточно");
        }
        else {
            System.out.println("Грузоподъемность - от " + typeLoadCapacity.getFrom() + " до " + typeLoadCapacity.getTo() + " тонн");
        }
    }

    public TypeLoadCapacity getTypeLoadCapacity() {
        return typeLoadCapacity;
    }

    @Override
    public String toString() {
        return "Truck{" + super.toString() + "}";
    }
}
