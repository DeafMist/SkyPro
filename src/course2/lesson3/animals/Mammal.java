package course2.lesson3.animals;

import java.util.Objects;

public class Mammal extends Animal {
    private String habitat;

    private int speed;

    public Mammal(String name, int age, String habitat, int speed) {
        super(name, age);
        setHabitat(habitat);
        setSpeed(speed);
    }

    public void walk() {
        System.out.println("I am mammal and i am walking");
    }

    @Override
    public void eat() {
        System.out.println("I am mammal and i am eating");
    }

    @Override
    public void go() {
        System.out.println("I am mammal and i am going");
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        if (habitat == null || habitat.isEmpty()) {
            habitat = "default";
        }

        this.habitat = habitat;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            speed = Math.abs(speed);
        }

        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return speed == mammal.speed && habitat.equals(mammal.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), habitat, speed);
    }
}
