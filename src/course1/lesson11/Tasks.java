package course1.lesson11;

public class Tasks {
    public static void main(String[] args) {

    }

    private static void isALeapYear(int year) {
       if (year % 4 != 0 || year % 100 == 0 && year % 400 != 0) {
            System.out.println(year + " год не является високосным");
        }
        else {
            System.out.println(year + " год является високосным");
        }
    }

    private static void needLightOrFullVersion(int clientOS, int clientDeviceYear) {
        String name = "";
        switch (clientOS) {
            case 0:
                name = "IOS";
                break;

            case 1:
                name = "Android";
                break;
        }

        if (clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для " + name + " по ссылке");
        }
        else {
            System.out.println("Установите версию приложения для " + name + " по ссылке");
        }
    }

    private static int calculateDeliveryTime(int deliveryDistance) {
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

        return days;
    }
}
