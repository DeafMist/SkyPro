package course1.lesson4;

public class Tasks {
    public static void main(String[] args) {
        task9();
    }

    private static void task1() {
        int age = 19;

        if (age >= 18) {
            System.out.println("Поздравляю с совершеннолетием!");
        }

        if (age < 18) {
            System.out.println("Подождите немного, возраст совершеннолетия еще не наступил");
        }
    }

    private static void task2() {
        int age = 19;

        if (age >= 7) {
            System.out.println("Ты ходишь в школу");
        }

        if (age >= 18) {
            System.out.println("Можешь отправляться учиться в университет");
        }

        if (age >= 24) {
            System.out.println("Пора искать работу");
        }
    }

    private static void task3() {
        int capacity = 102;
        int seatPlaces = 60;
        int loaded = 100;

        if (loaded <= seatPlaces) {
            System.out.println("Пока есть сидячие места");
        }

        if (loaded > seatPlaces && loaded <= capacity) {
            System.out.println("Остались только стоячие места");
        }

        if (loaded > capacity) {
            System.out.println("Мест больше нет");
        }
    }

    private static void task4() {
        int age = 19;

        if (age >= 18) {
            System.out.println("Поздравляю с совершеннолетием!");
        }
        else {
            System.out.println("Подождите немного, возраст совершеннолетия еще не наступил");
        }
    }

    private static void task5() {
        int age = 19;

        if (age >= 7 && age < 18) {
            System.out.println("Ты ходишь в школу");
        }
        else if (age >= 18 && age < 24) {
            System.out.println("Можешь отправляться учиться в университет");
        }
        else {
            System.out.println("Пора искать работу");
        }
    }

    private static void task6() {
        int capacity = 102;
        int seatPlaces = 60;
        int loaded = 100;

        if (loaded <= seatPlaces) {
            System.out.println("Пока есть сидячие места");
        }
        else if (loaded > seatPlaces && loaded <= capacity) {
            System.out.println("Остались только стоячие места");
        }
        else {
            System.out.println("Мест больше нет");
        }
    }

    private static void task7() {
        int age = 6;

        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
        else if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        else if (age > 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        }
        else {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }
    }

    private static void task8() {
        int age = 1;

        if (age < 5) {
            System.out.println("Ребенок не может кататься на аттракционе");
        }
        else if (age >= 5 && age < 14) {
            System.out.println("Ребенок может кататься на аттракционе, но только в сопровождении взрослого");
        }
        else {
            System.out.println("Ребенок может кататься на аттракционе");
        }
    }

    private static void task9() {
        int one = 8;
        int two = 15;
        int three = 12;


        if (one >= two && one >= three) {
            System.out.println(one);
        }
        else if (two >= one && two >= three) {
            System.out.println(two);
        }
        else {
            System.out.println(three);
        }
    }
}
