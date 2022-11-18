package course2.lesson8;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class Passport {
    private static final Set<Passport> passports = new HashSet<>();

    private String number;

    private String surname;

    private String name;

    private String middleName;

    private LocalDate birthDate;

    public Passport(String number, String surname, String name, String middleName, LocalDate birthDate) {
        if (number == null || surname == null || name == null || birthDate == null) {
            throw new IllegalArgumentException("Только отчество может быть не заполнено!");
        }

        this.number = number;
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.birthDate = birthDate;
    }

    public static void addPassport(Passport passport) {
        passports.remove(passport);
        passports.add(passport);
    }

    public static Passport findPassport(String number) {
        for (Passport passport : passports) {
            if (passport.getNumber().equals(number)) {
                return passport;
            }
        }

        return null;
    }

    public static Set<Passport> getPassports() {
        return passports;
    }

    public String getNumber() {
        return number;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return number.equals(passport.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "Passport{" +
                "number='" + number + '\'' +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
