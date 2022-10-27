package course2.lesson2;

public class Human {
    private int yearOfBirth;
    public String name;
    private String town;

    public String job;

    public Human() {

    }
    public Human(int yearOfBirth, String name, String town, String job) {
        if (yearOfBirth < 0) {
            yearOfBirth = 0;
        }

        if (name == null) {
            name = "Информация не указана";
        }

        if (town == null || town.equals("")) {
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

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth < 0) {
            yearOfBirth = 0;
        }

        this.yearOfBirth = yearOfBirth;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town.equals("") || town == null) {
            town = "Информация не указана";
        }

        this.town = town;
    }

    @Override
    public String toString() {
        return "Привет!\nМеня зовут " + name + ".\n" +
                "Я из города " + town + ".\n" +
                "Я родился в " + yearOfBirth + " году.\n" +
                "Я работаю на должности " + job + ".\n" +
                "Будем знакомы!\n";
    }
}
