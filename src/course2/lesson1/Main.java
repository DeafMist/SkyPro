package course2.lesson1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

    }

    private static void task1_2() {
        System.out.println("------Задание №1------");

        Human maxim = new Human();
        maxim.name = "Максим";
        maxim.yearOfBirth = LocalDate.now().getYear() - 35;
        maxim.town = "Минск";
        System.out.println(
                "Привет!\nМеня зовут " + maxim.name + ".\n" +
                        "Я из города " + maxim.town + ".\n" +
                        "Я родился в " + maxim.yearOfBirth + " году.\n" +
                        "Будем знакомы!\n"
        );

        Human anya = new Human();
        anya.name = "Аня";
        anya.yearOfBirth = LocalDate.now().getYear() - 29;
        anya.town = "Москва";
        System.out.println(
                "Привет!\nМеня зовут " + anya.name + ".\n" +
                        "Я из города " + anya.town + ".\n" +
                        "Я родился в " + anya.yearOfBirth + " году.\n" +
                        "Будем знакомы!\n"
        );

        Human katya = new Human();
        katya.name = "Катя";
        katya.yearOfBirth = LocalDate.now().getYear() - 28;
        katya.town = "Калининград";
        System.out.println(
                "Привет!\nМеня зовут " + katya.name + ".\n" +
                        "Я из города " + katya.town + ".\n" +
                        "Я родился в " + katya.yearOfBirth + " году.\n" +
                        "Будем знакомы!\n"
        );

        Human artem = new Human();
        artem.name = "Артем";
        artem.yearOfBirth = LocalDate.now().getYear() - 27;
        artem.town = "Москва";
        System.out.println(
                "Привет!\nМеня зовут " + artem.name + ".\n" +
                        "Я из города " + artem.town + ".\n" +
                        "Я родился в " + artem.yearOfBirth + " году.\n" +
                        "Будем знакомы!\n"
        );




        System.out.println("------Задание №2------");

        maxim.job = "бренд-менеджер";
        System.out.println(
                "Привет!\nМеня зовут " + maxim.name + ".\n" +
                        "Я из города " + maxim.town + ".\n" +
                        "Я родился в " + maxim.yearOfBirth + " году.\n" +
                        "Я работаю на должности " + maxim.job + ".\n" +
                        "Будем знакомы!\n"
        );

        anya.job = "методист образовательных программ";
        System.out.println(
                "Привет!\nМеня зовут " + anya.name + ".\n" +
                        "Я из города " + anya.town + ".\n" +
                        "Я родился в " + anya.yearOfBirth + " году.\n" +
                        "Я работаю на должности " + anya.job + ".\n" +
                        "Будем знакомы!\n"
        );

        katya.job = "продакт-менеджер";
        System.out.println(
                "Привет!\nМеня зовут " + katya.name + ".\n" +
                        "Я из города " + katya.town + ".\n" +
                        "Я родился в " + katya.yearOfBirth + " году.\n" +
                        "Я работаю на должности " + katya.job + ".\n" +
                        "Будем знакомы!\n"
        );

        artem.job = "директор по развитию бизнеса";
        System.out.println(
                "Привет!\nМеня зовут " + artem.name + ".\n" +
                        "Я из города " + artem.town + ".\n" +
                        "Я родился в " + artem.yearOfBirth + " году.\n" +
                        "Я работаю на должности " + artem.job + ".\n" +
                        "Будем знакомы!\n"
        );
    }

    private static void task3() {
        Car lada = new Car();
        lada.brand = "Lada";
        lada.model = "Grande";
        lada.productionYear = 2015;
        lada.productionCountry = "Россия";
        lada.color = "желтый";
        lada.engineVolume = 1.7;
        System.out.println(
                "Марка автомобиля " + lada.brand +
                        ", модель " + lada.model +
                        ", страна-производитель " + lada.productionCountry +
                        ", цвет " + lada.color +
                        ", объем двигателя " + lada.engineVolume
        );

        Car audi = new Car();
        audi.brand = "Audi";
        audi.model = "A8 50 L TDI quattro";
        audi.productionYear = 2020;
        audi.productionCountry = "Германия";
        audi.color = "черный";
        audi.engineVolume = 3.0;
        System.out.println(
                "Марка автомобиля " + audi.brand +
                        ", модель " + audi.model +
                        ", страна-производитель " + audi.productionCountry +
                        ", цвет " + audi.color +
                        ", объем двигателя " + audi.engineVolume
        );

        Car bmw = new Car();
        bmw.brand = "BMW";
        bmw.model = "Z8";
        bmw.productionYear = 2021;
        bmw.productionCountry = "Германия";
        bmw.color = "черный";
        bmw.engineVolume = 3.0;
        System.out.println(
                "Марка автомобиля " + bmw.brand +
                        ", модель " + bmw.model +
                        ", страна-производитель " + bmw.productionCountry +
                        ", цвет " + bmw.color +
                        ", объем двигателя " + bmw.engineVolume
        );

        Car kia = new Car();
        kia.brand = "Kia";
        kia.model = "Sportage 4 поколение";
        kia.productionYear = 2018;
        kia.productionCountry = "Южная Корея";
        kia.color = "красный";
        kia.engineVolume = 2.4;
        System.out.println(
                "Марка автомобиля " + kia.brand +
                        ", модель " + kia.model +
                        ", страна-производитель " + kia.productionCountry +
                        ", цвет " + kia.color +
                        ", объем двигателя " + kia.engineVolume
        );

        Car hyundai = new Car();
        hyundai.brand = "Hyundai";
        hyundai.model = "Avante";
        hyundai.productionYear = 2016;
        hyundai.productionCountry = "Южная Корея";
        hyundai.color = "оранжевый";
        hyundai.engineVolume = 1.6;
        System.out.println(
                "Марка автомобиля " + hyundai.brand +
                        ", модель " + hyundai.model +
                        ", страна-производитель " + hyundai.productionCountry +
                        ", цвет " + hyundai.color +
                        ", объем двигателя " + hyundai.engineVolume
        );
    }

    private static void task4() {
        Human maxim = new Human(LocalDate.now().getYear() - 35, "Максим", "Минск", "бренд-менеджер");
        System.out.println(
                "Привет!\nМеня зовут " + maxim.name + ".\n" +
                        "Я из города " + maxim.town + ".\n" +
                        "Я родился в " + maxim.yearOfBirth + " году.\n" +
                        "Я работаю на должности " + maxim.job + ".\n" +
                        "Будем знакомы!\n"
        );

        Human anya = new Human(LocalDate.now().getYear() - 29, "Аня", "Москва", "методист образовательных программ");
        System.out.println(
                "Привет!\nМеня зовут " + anya.name + ".\n" +
                        "Я из города " + anya.town + ".\n" +
                        "Я родился в " + anya.yearOfBirth + " году.\n" +
                        "Я работаю на должности " + anya.job + ".\n" +
                        "Будем знакомы!\n"
        );

        Human katya = new Human(LocalDate.now().getYear() - 28, "Катя", "Калининград", "продакт-менеджер");
        System.out.println(
                "Привет!\nМеня зовут " + katya.name + ".\n" +
                        "Я из города " + katya.town + ".\n" +
                        "Я родился в " + katya.yearOfBirth + " году.\n" +
                        "Я работаю на должности " + katya.job + ".\n" +
                        "Будем знакомы!\n"
        );

        Human artem = new Human(LocalDate.now().getYear() - 27, "Артем", "Москва", "директор по развитию бизнеса");
        System.out.println(
                "Привет!\nМеня зовут " + artem.name + ".\n" +
                        "Я из города " + artem.town + ".\n" +
                        "Я родился в " + artem.yearOfBirth + " году.\n" +
                        "Я работаю на должности " + artem.job + ".\n" +
                        "Будем знакомы!\n"
        );
    }

    private static void task5() {
        Car lada = new Car("Lada", "Grande", 1.7, "желтый", 2015, "Россия");
        System.out.println(
                "Марка автомобиля " + lada.brand +
                        ", модель " + lada.model +
                        ", страна-производитель " + lada.productionCountry +
                        ", цвет " + lada.color +
                        ", объем двигателя " + lada.engineVolume
        );

        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия");
        System.out.println(
                "Марка автомобиля " + audi.brand +
                        ", модель " + audi.model +
                        ", страна-производитель " + audi.productionCountry +
                        ", цвет " + audi.color +
                        ", объем двигателя " + audi.engineVolume
        );

        Car bmw = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия");
        System.out.println(
                "Марка автомобиля " + bmw.brand +
                        ", модель " + bmw.model +
                        ", страна-производитель " + bmw.productionCountry +
                        ", цвет " + bmw.color +
                        ", объем двигателя " + bmw.engineVolume
        );

        Car kia = new Car("Kia", "Sportage 4 поколение", 2.4, "красный", 2018, "Южная Корея");
        System.out.println(
                "Марка автомобиля " + kia.brand +
                        ", модель " + kia.model +
                        ", страна-производитель " + kia.productionCountry +
                        ", цвет " + kia.color +
                        ", объем двигателя " + kia.engineVolume
        );

        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");
        System.out.println(
                "Марка автомобиля " + hyundai.brand +
                        ", модель " + hyundai.model +
                        ", страна-производитель " + hyundai.productionCountry +
                        ", цвет " + hyundai.color +
                        ", объем двигателя " + hyundai.engineVolume
        );
    }


}
