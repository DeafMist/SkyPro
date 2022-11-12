package course2.lesson7.transport;

import course2.lesson7.license.License;
import course2.lesson7.logicPackage.Transport;

public class Bus extends Transport {
    public enum TypeCapacity {
        VERY_SMALL(0, 10),
        SMALL(10, 25),
        MEDIUM(40, 50),
        BIG(60, 80),
        VERY_BIG(100, 120);

        private final int from;

        private final int to;

        TypeCapacity(int from, int to) {
            this.from = from;
            this.to = to;
        }

        public int getFrom() {
            return from;
        }

        public int getTo() {
            return to;
        }
    }

    private final TypeCapacity typeCapacity;

    public static License LICENSE = License.D;

    public Bus(String brand, String model) {
        this(brand, model, 1.5);
    }

    public Bus(String brand, String model, double engineVolume) {
        this(brand, model, engineVolume, null);
    }

    public Bus(String brand, String model, double engineVolume, TypeCapacity typeCapacity) {
        super(brand, model, engineVolume);
        this.typeCapacity = typeCapacity;
    }

    @Override
    public void startMoving() {
        System.out.println("Автобус начинает движение");
    }

    @Override
    public void endMoving() {
        System.out.println("Автобус заканчивает движение");
    }

    @Override
    public void printType() {
        if (typeCapacity == null) {
            System.out.println("Данных об авто недостаточно");
        }
        else {
            System.out.println("Вместимость - от " + typeCapacity.getFrom() + " до " + typeCapacity.getTo() + " мест");
        }
    }

    public TypeCapacity getTypeCapacity() {
        return typeCapacity;
    }

    @Override
    public String toString() {
        return "Bus{" + super.toString() + "}";
    }
}
