package course1.lesson9;

public class Tasks {
    private static int[] arr = generateRandomArray();

    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
    }

    private static void task1() {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }

        System.out.println("Сумма затрат за месяц составила " + total + " рублей");
    }

    private static void task2() {
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Минимальная сумма трат за день составила " + min + " рублей.\n" +
                "Максимальная сумма трат за день составила " + max + " рублей");
    }

    private static void task3() {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }

        double res = (double) total / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + res + " рублей");
    }

    private static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
