package course2.final_task;

public class Task {
    public static void main(String[] args) {
        System.out.println(sumNumbers(1_246_572_524L));
    }

    private static long sumNumbers(long number) {
        long total = 0L;

        while (number > 0) {
            total += number % 10;
            number /= 10;
        }

        return total;
    }
}
