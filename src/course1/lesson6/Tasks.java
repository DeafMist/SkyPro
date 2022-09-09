package course1.lesson6;

public class Tasks {
    public static void main(String[] args) {

    }

    private static void task1() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    private static void task2() {
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }

    private static void task3() {
        for (int i = 0; i < 17; i += 2) {
            System.out.println(i);
        }
    }

    private static void task4() {
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
    }

    private static void task5() {
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + "год является високосным");
        }
    }

    private static void task6() {
        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }
    }

    private static void task7() {
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }
    }

    private static void task8() {
        int sum = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total += sum;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }

    private static void task9() {
        int sum = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total *= 1.01;
            total += sum;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }
}
