package course2.lesson7.logicPackage;

import course2.lesson7.Main;
import course2.lesson7.transport.Bus;
import course2.lesson7.transport.Car;
import course2.lesson7.transport.Truck;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Mechanic <T extends Transport> {
    private String lastName;

    private String firstName;

    private String companyName;

    private final List<T> transports = new ArrayList<>();

    public Mechanic(String lastName, String firstName, String companyName) {
        setLastName(lastName);
        setFirstName(firstName);
        setCompanyName(companyName);
    }

    public void service(T transport) {
        if (transport == null) {
            throw new IllegalArgumentException("Машина не указана");
        }

        if (!transports.contains(transport)) {
            throw new IllegalArgumentException("Механик не занимается этой машиной");
        }

        if (transport instanceof Bus) {
            System.out.println("Автобус " + transport.getBrand() + " " + transport.getModel() + " в диагностике не нуждается");
        }
        else {
            assert transport instanceof Car;
            Car car = (Car) transport;

            String message;
            if (car instanceof Truck) {
                message = "Грузовой автомобиль ";
            }
            else {
                message = "Легковой автомобиль ";
            }

            message += car.getBrand() + " " + car.getModel();

            if (!car.service()) {
                message += " не прошел диагностику";
                throw new RuntimeException(message);
            }
            else {
                message += " прошел диагностику";
                System.out.println(message);
            }
        }
    }

    public void repairCar(T car) {
        if (car == null) {
            throw new IllegalArgumentException("Машина не указана");
        }

        if (!transports.contains(car)) {
            throw new IllegalArgumentException("Механик не занимается этой машиной");
        }

        car.repair();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = Main.doCorrectStringIfNeeded(lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = Main.doCorrectStringIfNeeded(firstName);
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = Main.doCorrectStringIfNeeded(companyName);
    }

    public List<T> getTransports() {
        return transports;
    }

    public void addTransport(T transport) {
        transports.add(transport);
        transport.addMechanic(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic<?> mechanic = (Mechanic<?>) o;
        return lastName.equals(mechanic.lastName) && firstName.equals(mechanic.firstName) && companyName.equals(mechanic.companyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName, companyName);
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
