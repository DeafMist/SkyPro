package course2.lesson3;

import course2.lesson3.animals.*;
import course2.lesson3.transport.Bus;
import course2.lesson3.transport.Car;
import course2.lesson3.transport.Train;

public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println();

        task2();
        System.out.println();

        task3();
        System.out.println();

        lastTask();
    }

    private static void task1() {
        Car lada = new Car("Lada", "Grande", 1.7, "желтый", 2015, "Россия");
        System.out.println(lada);

        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия");
        System.out.println(audi);

        Car bmw = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия");
        System.out.println(bmw);

        Car kia = new Car("Kia", "Sportage 4 поколение", 2.4, "красный", 2018, "Южная Корея");
        System.out.println(kia);

        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");
        System.out.println(hyundai);
        System.out.println(hyundai.refill());
    }

    private static void task2() {
        Train lastochka = new Train("Ласточка", "B-901", 2011, "Россия",
                null, 301, 3500, 0, "Белорусский вокзал", "Минск-Пассажирский",
                11);
        System.out.println(lastochka);

        Train leningrad = new Train("Ленинград", "D-125", 2019, "Россия",
                null, 270, 1700, 0, "Ленинградский вокзал", "Ленинград-Пассажирский",
                8);
        System.out.println(leningrad);
        System.out.println(leningrad.refill());
    }

    private static void task3() {
        Bus boogai = new Bus("Boogai", "CP-1251", 2020, "Germany", "black", 228);
        System.out.println(boogai);

        Bus puff = new Bus("Puff", "WD-208", 2019, null, null, 240);
        System.out.println(puff);

        Bus monster = new Bus("Monster", "ENERGY", 2022, "Russia", null, 300);
        System.out.println(monster);
        System.out.println(monster.refill());
    }

    private static void lastTask() {
        Herbivore gazel = new Herbivore("Gazel", 5, "forest", 100, null);
        System.out.println(gazel);

        Herbivore giraf = new Herbivore("Giraf", 3, null, 20, null);
        System.out.println(giraf);

        Herbivore horse = new Herbivore("Horse", 14, "farm", 59, null);
        System.out.println(horse);


        Predator giena = new Predator("Giena", 7, null, 26, null);
        System.out.println(giena);

        Predator tiger = new Predator("Tiger", 16, null, 84, null);
        System.out.println(tiger);

        Predator bear = new Predator("Bear", 25, "forest", 49, null);
        System.out.println(bear);


        Amphibian frog = new Amphibian("Frog", -2, "swamp");
        System.out.println(frog);

        Amphibian snake = new Amphibian("Snake Freshwater", 0, "");
        System.out.println(snake);


        Flightless pavlin = new Flightless("Pavlin", 6, "", "");
        System.out.println(pavlin);

        Flightless pinguin = new Flightless("Pinguin", 9, "zoo", null);
        System.out.println(pinguin);

        Flightless dodo = new Flightless("Dodo", 27, null, null);
        System.out.println(dodo);


        Flying chaika = new Flying("Chaika", -3, "sea", "pupu");
        System.out.println(chaika);

        Flying albatros = new Flying("Albatros", 4, "", "");
        System.out.println(albatros);

        Flying sokol = new Flying("Sokol", 6, "field", "");
        System.out.println(sokol);
    }
}
