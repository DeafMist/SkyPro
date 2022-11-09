package course2.lesson6;

import course2.lesson6.category.Driver;
import course2.lesson6.category.DriverCategoryB;
import course2.lesson6.category.DriverCategoryC;
import course2.lesson6.category.DriverCategoryD;
import course2.lesson6.transport.*;

public class Main {
    public static void main(String[] args) {
        task2();
    }

    private static void task1() {
        try {
            boolean isCorrect = Data.checkParams("DeafMist", "012!320", "23171");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void task2() {
        PassengerCar audi = new PassengerCar("Audi", "A8 50 L TDI quattro", 3.0);
        Bus boogai = new Bus("Boogai", "CP-1251");
        Truck boombox = new Truck("Boom", "Box", -2.0);

        DriverCategoryB<PassengerCar> vladimir = new DriverCategoryB<>("Бондарчук Владимир Васильевич",
                true, 2, audi);
        DriverCategoryC<Truck> sergay = new DriverCategoryC<>("Кранькович Сергей Александрович",
                true, -5, boombox);
        DriverCategoryD<Bus> andrey = new DriverCategoryD<>("Карпатов Андрей Михайлович",
                false, 9, boogai);

        diagnose(vladimir, sergay, andrey);
    }

    private static void diagnose(Driver... drivers) {
        for (Driver driver : drivers) {
            Transport transport = driver.getCar();
            if (transport instanceof Bus) {
                System.out.println("Автобус " + transport.getBrand() + " " + transport.getModel() + " в диагностике не требуется");
                continue;
            }

            assert transport instanceof Car;
            Car car = (Car) transport;

            if (!car.getDiagnosed(driver)) {
                String message;
                if (car instanceof Truck) {
                    message = "Грузовой автомобиль ";
                }
                else {
                    message = "Легковой автомобиль ";
                }

                message += car.getBrand() + " " + car.getModel() + " не прошел диагностику";
                throw new RuntimeException(message);
            }
        }

        System.out.println("Все остальные автомобили прошли диагностику");
    }

    public static String doCorrectStringIfNeeded(String str) {
        if (str == null || str.isEmpty() || str.isBlank()) {
            str = "default";
        }

        return str;
    }
}
