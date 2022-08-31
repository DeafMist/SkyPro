package course1.lesson5;

public class Tasks {
    public static void main(String[] args) {
        task5();
    }

    private static void task1() {
        int clientOS = 0;

        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;

            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
        }
    }

    private static void task2() {
        int clientOS = 1;
        String name = "";

        switch (clientOS) {
            case 0:
                name = "IOS";
                break;

            case 1:
                name = "Android";
                break;
        }

        int clientDeviceYear = 2015;

        if (clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для " + name + " по ссылке");
        }
        else {
            System.out.println("Установите версию приложения для " + name + " по ссылке");
        }
    }

    private static void task3() {
        int year = 2021;

        if (year % 4 != 0 || year % 100 == 0 && year % 400 != 0) {
            System.out.println(year + " год не является високосным");
        }
        else {
            System.out.println(year + " год является високосным");
        }
    }

    private static void task4() {
        int deliveryDistance = 95;
        int days = 0;

        if (deliveryDistance < 20) {
            days = 1;
        }
        else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            days = 2;
        }
        else {
            days = 3;
        }

        System.out.println("Потребуется дней: " + days);
    }

    private static void task5() {
        int monthNumber = 12;

        if (monthNumber <= 12) {
            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                    System.out.println("Это зимний месяц");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Это весенний месяц");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Это летний месяц");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Это осенний месяц");
                    break;
            }
        }
    }
}
