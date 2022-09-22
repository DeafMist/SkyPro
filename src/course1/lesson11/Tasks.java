package course1.lesson11;

import java.time.LocalDate;

public class Tasks {
    public static void main(String[] args) {
        isALeapYear(LocalDate.now().getYear());
        System.out.println();
        needLightOrFullVersion(0, LocalDate.now().getYear());
        System.out.println();
        System.out.println("Количество дней доставки - " + calculateDeliveryTime(2000));
    }

    private static void isALeapYear(int year) {
       if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)) {
            System.out.println(year + " год не является високосным");
        }
        else {
            System.out.println(year + " год является високосным");
        }
    }

    private static void needLightOrFullVersion(int clientOS, int clientDeviceYear) {
        String name = "";
        if (clientOS == 0) {
            name = "IOS";
        }
        else {
            name = "Android";
        }

        if (clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для " + name + " по ссылке");
        }
        else {
            System.out.println("Установите версию приложения для " + name + " по ссылке");
        }
    }

    private static int calculateDeliveryTime(int deliveryDistance) {
        int days = 1;
        deliveryDistance -= 19;

        if (deliveryDistance > 0) {
            days += deliveryDistance / 40;
            
            if (deliveryDistance % 40 != 0) {
                days += 1;
            }
        }

        return days;
    }
}
