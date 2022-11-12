package course2.lesson7;

import course2.lesson7.license.License;
import course2.lesson7.logicPackage.Driver;
import course2.lesson7.logicPackage.Mechanic;
import course2.lesson7.logicPackage.Sponsor;
import course2.lesson7.transport.*;
import course2.lesson7.logicPackage.Transport;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        task1_2();
        System.out.println();
        task3();
        System.out.println();
        Chessboard.chessboard();
    }

    private static void task1_2() {
        PassengerCar audi = new PassengerCar("Audi", "A8 50 L TDI quattro", 3.0);
        Bus boogai = new Bus("Boogai", "CP-1251");
        Truck boombox = new Truck("Boom", "Box", -2.0);

        List<Transport> transports = new ArrayList<>();
        transports.add(audi);
        transports.add(boogai);
        transports.add(boombox);

        Driver<PassengerCar> vladimir = new Driver<>("Бондарчук Владимир Васильевич", License.B, 2, audi);
        Driver<Truck> sergay = new Driver<>("Кранькович Сергей Александрович", License.C, -5, boombox);
        Driver<Bus> andrey = new Driver<>("Карпатов Андрей Михайлович", License.D, 9, boogai);

        Sponsor farux = new Sponsor("Дембелев Фарух Фарухович", 2000);
        Sponsor dmitriy = new Sponsor("Лагунов Дмитрий Арсеньевич");

        Mechanic<PassengerCar> mamal = new Mechanic<>("Забетов", "Мамал", "РИЦЦА");
        Mechanic<Truck> garux = new Mechanic<>("Гарухов", "Гарух", "Лагуна");

        farux.addTransport(audi);
        farux.addTransport(boogai);

        dmitriy.addTransport(audi);
        dmitriy.addTransport(boogai);
        dmitriy.addTransport(boombox);

        mamal.addTransport(audi);
        garux.addTransport(boombox);

        ServiceStation serviceStation = new ServiceStation();
        for (Transport transport : transports) {
            System.out.println(transport.getDriver());
            System.out.println(transport.getSponsors());
            System.out.println(transport.getMechanics());

            if (!(transport instanceof Bus)) {
                serviceStation.add((Car) transport);
            }
        }

        serviceStation.service();
        serviceStation.service();
    }

    private static void task3() {
        Shop.shop();
    }

    public static String doCorrectStringIfNeeded(String str) {
        if (str == null || str.isEmpty() || str.isBlank()) {
            str = "default";
        }

        return str;
    }
}
