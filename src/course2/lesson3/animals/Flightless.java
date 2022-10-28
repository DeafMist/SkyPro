package course2.lesson3.animals;

import java.util.Objects;

public class Flightless extends Bird {
    private final String moveType;

    public Flightless(String name, int age, String habitat, String moveType) {
        super(name, age, habitat);

        if (moveType == null || moveType.isEmpty()) {
            moveType = "going on legs";
        }

        this.moveType = moveType;
    }

    public void walk() {
        System.out.println("I am flightless and i am walking");
    }

    @Override
    public void eat() {
        System.out.println("I am flightless and i am eating");
    }

    @Override
    public void go() {
        System.out.println("I am flightless and i am going");
    }

    public String getMoveType() {
        return moveType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flightless that = (Flightless) o;
        return moveType.equals(that.moveType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), moveType);
    }

    @Override
    public String toString() {
        return "name='" + getName() + '\'' +
                ", age='" + getAge() + '\'' +
                ", habitat='" + getHabitat() + '\'' +
                ", moveType='" + getMoveType() + '\'';
    }
}
