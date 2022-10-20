package course2.lesson1;

public class Human {
    int yearOfBirth;
    String name;
    String town;

    String job;

    public Human() {

    }
    public Human(int yearOfBirth, String name, String town, String job) {
        if (yearOfBirth < 0) {
            yearOfBirth = Math.abs(yearOfBirth);
        }

        if (name == null) {
            name = "Информация не указана";
        }

        if (town == null) {
            town = "Информация не указана";
        }

        if (job == null) {
            job = "Информация не указана";
        }

        this.yearOfBirth = yearOfBirth;
        this.name = name;
        this.town = town;
        this.job = job;
    }
}
