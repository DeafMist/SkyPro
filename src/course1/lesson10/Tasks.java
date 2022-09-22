package course1.lesson10;

public class Tasks {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
    }

    private static void task1() {
        String firstName = "Владислав";
        String middleName = "Алексеевич";
        String lastName = "Горбунов";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
    }

    private static void task2() {
        String fullName = "Ivanov Ivan Ivanovich";
        String upperCaseFullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + upperCaseFullName);
    }

    private static void task3() {
        String fullName = "Иванов Семён Семёнович";
        String updatedFullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника - " + updatedFullName);
    }
}
