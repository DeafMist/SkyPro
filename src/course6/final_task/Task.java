package course6.final_task;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println("Ответ = " + (a / b));
        }
        catch (InputMismatchException | ArithmeticException e) {
            if (e instanceof InputMismatchException) {
                throw new RuntimeException("Требуется ввести число!");
            } else if (e instanceof ArithmeticException) {
                System.out.println("Ответ = infinity");
            }
        }
    }
}
