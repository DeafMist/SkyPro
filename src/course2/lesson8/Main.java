package course2.lesson8;

import course2.lesson7.license.License;
import course2.lesson7.logicPackage.Driver;
import course2.lesson7.logicPackage.Mechanic;
import course2.lesson7.logicPackage.Sponsor;
import course2.lesson7.logicPackage.Transport;
import course2.lesson7.transport.*;

import java.time.LocalDate;
import java.util.*;

public class Main {
    private static final Random random = new Random();

    public static void main(String[] args) {
        task5();
    }

    private static void task1() {
        Product banana = new Product("Бананы", 60.0, 5.0);
        Product tomato = new Product("Томаты", 100.0, 3.0);
        Product potato = new Product("Картофель", 36.0, 10.0);
        Product apple = new Product("Яблоки", 150.0, 4.0);

        ProductsList productsList = new ProductsList();
        productsList.addProduct(banana);
        productsList.addProduct(tomato);
        productsList.addProduct(potato);
        productsList.addProduct(apple);
        System.out.println(productsList.getProducts());

        productsList.buyProduct(banana);
        productsList.buyProduct(apple);
        System.out.println(productsList.getProducts());

        productsList.removeProduct(tomato);
        productsList.removeProduct(potato);
        System.out.println(productsList.getProducts());
    }

    private static void task2() {
        Recipe omlet = new Recipe("Омлет",
                new Product("Яйцо", 50.0, 6.0),
                new Product("Молоко", 70.0, 0.1));
        Recipe yaichniza = new Recipe("Яичница",
                new Product("Яйцо", 50.0, 6.0),
                new Product("Молоко", 70.0, 0.1));
//        Recipe a = new Recipe("Яичница",
//                new Product("Яйцо", 100.0, 3.3),
//                new Product("Молоко", 70.0, 0.1));

        Set<Recipe> recipesSet = new HashSet<>();
        addRecipes(recipesSet, omlet, yaichniza);
    }

    private static void addRecipes(Set<Recipe> recipesSet, Recipe... recipes) {
        for (Recipe recipe : recipes) {
            if (recipesSet.contains(recipe)) {
                throw new IllegalArgumentException("Рецепт с таким именем уже есть!");
            }

            recipesSet.add(recipe);
        }
    }

    private static void task3() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            numbers.add(random.nextInt(1000));
        }
        System.out.println(numbers);

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int next = iterator.next();
            if (next % 2 != 0) {
                iterator.remove();
            }
        }
        System.out.println(numbers);
    }

    private static void task4() {
        PassengerCar audi = new PassengerCar("Audi", "A8 50 L TDI quattro", 3.0);
        Bus boogai = new Bus("Boogai", "CP-1251");
        Truck boombox = new Truck("Boom", "Box", -2.0);

        Set<Transport> transports = new HashSet<>(List.of(audi, boogai, boombox));
        transports.add(audi);
        transports.add(boogai);
        transports.add(boombox);

        Driver<PassengerCar> vladimir = new Driver<>("Бондарчук Владимир Васильевич", License.B, 2, audi);
        Driver<Truck> sergay = new Driver<>("Кранькович Сергей Александрович", License.C, -5, boombox);
        Driver<Bus> andrey = new Driver<>("Карпатов Андрей Михайлович", License.D, 9, boogai);

        Set<Driver> drivers = new HashSet<>(List.of(vladimir, sergay, andrey));
        drivers.add(vladimir);
        drivers.add(andrey);

        Sponsor farux = new Sponsor("Дембелев Фарух Фарухович", 2000);
        Sponsor dmitriy = new Sponsor("Лагунов Дмитрий Арсеньевич");

        Set<Sponsor> sponsors = new HashSet<>(List.of(farux, dmitriy));
        sponsors.add(farux);

        Mechanic<PassengerCar> mamal = new Mechanic<>("Забетов", "Мамал", "РИЦЦА");
        Mechanic<Truck> garux = new Mechanic<>("Гарухов", "Гарух", "Лагуна");

        Set<Mechanic> mechanics = new HashSet<>(List.of(mamal, garux));
        mechanics.add(garux);

        farux.addTransport(audi);
        farux.addTransport(boogai);

        dmitriy.addTransport(audi);
        dmitriy.addTransport(boogai);
        dmitriy.addTransport(boombox);

        mamal.addTransport(audi);
        garux.addTransport(boombox);

        System.out.println(transports);
        System.out.println();
        System.out.println(drivers);
        System.out.println();
        System.out.println(sponsors);
        System.out.println();
        System.out.println(mechanics);
    }

    private static void task5() {
        Set<String> mult = new HashSet<>();

        int count = 0;
        while (count < 15) {
            int x1 = random.nextInt(10);
            int x2 = random.nextInt(10);
            if (!mult.contains(x1 + "*" + x2) && !mult.contains(x2 + "*" + x1)) {
                mult.add(x1 + "*" + x2);
                mult.add(x2 + "*" + x1);
                System.out.println(x1 + " * " + x2);
                count++;
            }
        }
    }

    private static void task6() {
        Passport.addPassport(new Passport("1234", "fsdf", "fsaf", null, LocalDate.of(2002, 10, 2)));
        Passport.addPassport(new Passport("5678", "asffa", "gereg", "gwewggew", LocalDate.of(2000, 8, 25)));
        System.out.println(Passport.getPassports());
        System.out.println(Passport.findPassport("1234"));
        Passport.addPassport(new Passport("1234", "jkfehkkwfjwhkej", "fsaewklgnlewnleglf", null, LocalDate.of(1999, 10, 2)));
        System.out.println(Passport.getPassports());
    }
}
