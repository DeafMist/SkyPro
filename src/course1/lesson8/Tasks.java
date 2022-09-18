package course1.lesson8;

public class Tasks {
    public static void main(String[] args) {
        tasks();
    }

    private static void tasks() {
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;

        double[] b = {1.57, 7.654, 9.986};

        boolean[] c = {true, false, true, true};

        System.out.println("---------Прямой порядок---------");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);

            if (i < a.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);

            if (i < b.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);

            if (i < c.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("---------Обратный порядок---------");

        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i]);

            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = b.length - 1; i >= 0; i--) {
            System.out.print(b[i]);

            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = c.length - 1; i >= 0; i--) {
            System.out.print(c[i]);

            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("---------Делаем целочисленный массив со всеми четными значениями---------");

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                a[i]++;
            }

            System.out.print(a[i]);

            if (i < a.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
    }
}
