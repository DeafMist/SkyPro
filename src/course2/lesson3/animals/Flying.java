package course2.lesson3.animals;

import java.util.Objects;

public class Flying extends Bird {
    private final String moveType;

    public Flying(String name, int age, String habitat, String moveType) {
        super(name, age, habitat);

        if (moveType == null || moveType.isEmpty()) {
            moveType = "flying on wings";
        }

        this.moveType = moveType;
    }

    public void fly() {
        System.out.println("I am flying and i am flying");
    }

    @Override
    public void eat() {
        System.out.println("I am flying and i am eating");
    }

    @Override
    public void go() {
        System.out.println("I am flying and i am going");
    }

    public String getMoveType() {
        return moveType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flying flying = (Flying) o;
        return moveType.equals(flying.moveType);
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
