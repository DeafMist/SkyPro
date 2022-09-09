package course1.lesson7;

public class Tasks {
    public static void main(String[] args) {
        task9();
    }

    private static void task1() {
        int sum = 29000;
        int total = 0;
        int i = 1;
        while (total < 2_459_000) {
            total *= 1.01;
            total += sum;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
            i++;
        }
    }

    private static void task2() {
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }

    private static void task3() {
        int population = 12_000_000;
        double birthRateForHuman = 17. / 1000;
        double deathRateForHuman = 8. / 1000;

        for (int year = 1; year <= 10; year++) {
            population += population * birthRateForHuman - population * deathRateForHuman;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
    }

    private static void task4() {
        int total = 15000;
        int i = 1;

        while (total < 12_000_000) {
            total *= 1.07;
            System.out.println("Месяц " + i + ", сумма накоплений " + total);
            i++;
        }
    }

    private static void task5() {
        int total = 15000;
        int i = 1;

        while (total < 12_000_000) {
            total *= 1.07;

            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений " + total);
            }

            i++;
        }
    }

    private static void task6() {
        int total = 15000;
        int i = 1;

        while (i <= 9 * 12) {
            total *= 1.07;

            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений " + total);
            }

            i++;
        }
    }

    private static void task7() {
        int firstFriday = 4;

        for (int i = firstFriday; i <= 31; i += 7) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
        }
    }

    private static void task8() {
        int year = 2022;
        int start = year - 200;
        int end = year + 100;

        while (start % 79 != 0) {
            start++;
        }

        for (int i = start; i < end; i += 79) {
            System.out.println(i);
        }
    }

    private static void task9() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + 2 * i);
        }
    }
}
