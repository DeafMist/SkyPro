package course1.lesson2;

public class Task4 {
    public static void main(String[] args) {
        int weight1 = 250;
        int weight2 = 500;
        int goal = 7000;

        double days1 = (double) goal / weight1;
        double days2 = (double) goal / weight2;
        double midDays = (days1 + days2) / 2;

        System.out.println(days1);
        System.out.println(days2);
        System.out.println(midDays);
    }
}
