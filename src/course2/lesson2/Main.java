package course2.lesson2;

import course2.lesson2.transport.Car;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();

        task2();
        System.out.println();

        task3();
    }

    private static void task1() {
        Human maxim = new Human(LocalDate.now().getYear() - 35, "Максим", "Минск", "бренд-менеджер");
        System.out.println(maxim);

        Human anya = new Human(LocalDate.now().getYear() - 29, "Аня", "Москва", "методист образовательных программ");
        System.out.println(anya);

        Human katya = new Human(LocalDate.now().getYear() - 28, "Катя", "Калининград", "продакт-менеджер");
        System.out.println(katya);

        Human artem = new Human(LocalDate.now().getYear() - 27, "Артем", "Москва", "директор по развитию бизнеса");
        System.out.println(artem);

        Human vladimir = new Human(LocalDate.now().getYear() - 21, "Владимир", "Казань", "нигде не работает");
        System.out.println(vladimir);
    }

    private static void task2() {
        Flower rose = new Flower("", "Голландия", 35.59);
        System.out.println(rose);

        Flower hrizantema = new Flower("", "", 15, 5);
        System.out.println(hrizantema);

        Flower pion = new Flower("", "Англия", 69.9, 1);
        System.out.println(pion);

        Flower hypsofila = new Flower("", "Турция", 19.5, 10);
        System.out.println(hypsofila);
    }

    private static void printCostAndLifespanOfBouquet(Flower... flowers) {
        int minLifeSpan = Integer.MAX_VALUE;
        double cost = 0;

        for (int i = 0; i < flowers.length; i++) {
            if (flowers[i].lifeSpan < minLifeSpan) {
                minLifeSpan = flowers[i].lifeSpan;
            }

            cost += flowers[i].getCost();
        }

        System.out.println("Букет будет стоить " + cost + "руб и простоит " + minLifeSpan + "суток");
    }

    private static void task3() {
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
    }
}
