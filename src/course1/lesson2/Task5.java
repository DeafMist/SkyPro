package course1.lesson2;

public class Task5 {
    public static void main(String[] args) {
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
