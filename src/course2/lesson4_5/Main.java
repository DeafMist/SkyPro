package course2.lesson4_5;

import course2.lesson4_5.category.DriverCategoryB;
import course2.lesson4_5.category.DriverCategoryC;
import course2.lesson4_5.category.DriverCategoryD;
import course2.lesson4_5.transport.Bus;
import course2.lesson4_5.transport.Car;
import course2.lesson4_5.transport.Truck;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        tasks();
    }

    private static void tasks() {
        Car lada = new Car("Lada", "Grande");
        System.out.println(lada);
        lada.pitStop();
        lada.bestLapTime(LocalTime.of(10,43,12), LocalTime.of(10,44,12));
        lada.maxSpeed(220);
        System.out.println();

        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0);
        System.out.println(audi);
        audi.pitStop();
        audi.bestLapTime(LocalTime.of(10,43,12), LocalTime.of(10,43,57));
        audi.maxSpeed(300);
        System.out.println();

        Car bmw = new Car("BMW", "Z8", 2.3);
        System.out.println(bmw);
        bmw.pitStop();
        bmw.bestLapTime(LocalTime.of(10,43,12), LocalTime.of(10,44,43));
        bmw.maxSpeed(186);
        System.out.println();

        Car kia = new Car("Kia", "Sportage 4 поколение", 2.4);
        System.out.println(kia);
        kia.pitStop();
        kia.bestLapTime(LocalTime.of(10,43,12), LocalTime.of(10,43,36));
        kia.maxSpeed(358);
        System.out.println();


        Bus boogai = new Bus("Boogai", "CP-1251");
        System.out.println(boogai);
        boogai.pitStop();
        boogai.bestLapTime(LocalTime.of(10,43,12), LocalTime.of(10,45,0));
        boogai.maxSpeed(167);
        System.out.println();

        Bus puff = new Bus("Puff", "WD-208", 3.5);
        System.out.println(puff);
        puff.pitStop();
        puff.bestLapTime(LocalTime.of(10,43,12), LocalTime.of(10,44,47));
        puff.maxSpeed(195);
        System.out.println();

        Bus monster = new Bus("Monster", "ENERGY", 1.2);
        System.out.println(monster);
        monster.pitStop();
        monster.bestLapTime(LocalTime.of(10,43,12), LocalTime.of(10,43,26));
        monster.maxSpeed(400);
        System.out.println();

        Bus buster = new Bus("Buster", null, 4.1);
        System.out.println(buster);
        buster.pitStop();
        buster.bestLapTime(LocalTime.of(10,43,12), LocalTime.of(10,43,27));
        buster.maxSpeed(399.99);
        System.out.println();


        Truck boombox = new Truck("Boom", "Box", -2.0);
        System.out.println(boombox);
        boombox.pitStop();
        boombox.bestLapTime(LocalTime.of(10,43,12), LocalTime.of(10,44,2));
        boombox.maxSpeed(278);
        System.out.println();

        Truck oasis = new Truck("   ", "Oasis");
        System.out.println(oasis);
        oasis.pitStop();
        oasis.bestLapTime(LocalTime.of(10,43,12), LocalTime.of(10,44,30));
        oasis.maxSpeed(286);
        System.out.println();

        Truck rumba = new Truck("Rumba", "Dance", -0.5);
        System.out.println(rumba);
        rumba.pitStop();
        rumba.bestLapTime(LocalTime.of(10,43,12), LocalTime.of(10,46,29));
        rumba.maxSpeed(85);
        System.out.println();

        Truck support = new Truck("", "   ", 3.2);
        System.out.println(support);
        support.pitStop();
        support.bestLapTime(LocalTime.of(10,43,12), LocalTime.of(10,45,27));
        support.maxSpeed(150);
        System.out.println();


        DriverCategoryB<Car> vladimir = new DriverCategoryB<>("Бондарчук Владимир Васильевич",
                true, 2, audi);
        System.out.println(vladimir);

        DriverCategoryC<Truck> sergay = new DriverCategoryC<>("Кранькович Сергей Александрович",
                true, -5, rumba);
        System.out.println(sergay);

        DriverCategoryD<Bus> andrey = new DriverCategoryD<>("Карпатов Андрей Михайлович",
                true, 9, monster);
        System.out.println(andrey);
    }

    public static String doCorrectStringIfNeeded(String str) {
        if (str == null || str.isEmpty() || str.isBlank()) {
            str = "default";
        }

        return str;
    }
}
