package course1.lesson3;

public class Tasks {
    public static void main(String[] args) {
        task8();
    }

    private static void task1() {
        byte a = -50;
        System.out.println("Значение переменной " + "a" + " с типом " + "byte" + " равно " + a);

        short b = 267;
        System.out.println("Значение переменной " + "b" + " с типом " + "short" + " равно " + b);

        int c = 1_000;
        System.out.println("Значение переменной " + "c" + " с типом " + "int" + " равно " + c);

        long d = -1_987_465L;
        System.out.println("Значение переменной " + "d" + " с типом " + "long" + " равно " + d);

        float e = 2.67f;
        System.out.println("Значение переменной " + "e" + " с типом " + "float" + " равно " + e);

        double f = 5.1182;
        System.out.println("Значение переменной " + "f" + " с типом " + "double" + " равно " + f);
    }

    private static void task2() {
        float a = 27.12f;
        long b = 987_678_965_549L;
        byte c = 2;
        short d = 786;
        boolean e = false;
        short f = 569;
        short g = -159;
        int h = 27897;
        double i = 67;
    }

    private static void task3() {
        int class1 = 23;
        int class2 = 27;
        int class3 = 30;

        int totalPapers = 480;

        System.out.println("На каждого ученика рассчитано " + totalPapers / (class1 + class2 + class3) + " листов бумаги");
    }

    private static void task4() {
        int bottlePerMin = 8;

        int minutes = 20;
        System.out.println("За " + minutes + " минут работы машины произведено " + (bottlePerMin * minutes) + " штук бутылок");

        int hours = 24;
        System.out.println("За " + hours + " часа работы машины произведено " + (bottlePerMin * hours * 60) + " штук бутылок");

        int days = 3;
        System.out.println("За " + days + " дня работы машины произведено " + (bottlePerMin * days * 24 * 60) + " штук бутылок");

        int months = 1;
        System.out.println("За " + months + " месяц работы машины произведено " + (bottlePerMin * months * 30 * 24 * 60) + " штук бутылок");
    }

    private static void task5() {
        int sum = 120;
        int classes = sum / (2 + 4);

        System.out.println("В школу, где " + classes + " классов, нужно " + (2 * classes) + " банок белой краски и " +
                (4 * classes) + " банок коричневой краски");
    }

    private static void task6() {
        int bananaWeight = 80;
        int milkWeight = 105;
        int iceCreamWeight = 100;
        int eggWeight = 70;

        double sum = (bananaWeight * 5 + milkWeight * 2 + iceCreamWeight * 2 + eggWeight * 4) / 1000.;
        System.out.println("Вес такого завтрака равен " + sum + " килограмм");
    }

    private static void task7() {
        int weight1 = 250;
        int weight2 = 500;
        int goal = 7000;

        double days1 = (double) goal / weight1;
        double days2 = (double) goal / weight2;
        double midDays = (days1 + days2) / 2;

        System.out.println("Max - " + days1);
        System.out.println("Min - " + days2);
        System.out.println("Avg - " + midDays);
    }

    private static void task8() {
        int mashaSalaryBefore = 67_760;
        double mashaSalaryAfter = 1.1 * mashaSalaryBefore;
        System.out.println("Маша теперь получает " + mashaSalaryAfter + " рублей. " +
                "Годовой доход вырос на " + (mashaSalaryAfter - mashaSalaryBefore) * 12 + " рублей");

        int denisSalaryBefore = 83_690;
        double denisSalaryAfter = 1.1 * denisSalaryBefore;
        System.out.println("Денис теперь получает " + denisSalaryAfter + " рублей. " +
                "Годовой доход вырос на " + (denisSalaryAfter - denisSalaryBefore) * 12 + " рублей");

        int kristinaSalaryBefore = 76_230;
        double kristinaSalaryAfter = 1.1 * kristinaSalaryBefore;
        System.out.println("Кристина теперь получает " + kristinaSalaryAfter + " рублей. " +
                "Годовой доход вырос на " + (kristinaSalaryAfter - kristinaSalaryBefore) * 12 + " рублей");
    }
}
