package course2.lesson3.animals;

import java.util.Objects;

public abstract class Animal {
    private String name;

    private final int age;

    public Animal(String name) {
        this(name, 0);
    }

    public Animal(String name, int age) {
        setName(name);

        if (age < 0) {
            age = Math.abs(age);
        }

        this.age = age;
    }

    public abstract void eat();

    public void sleep() {
        System.out.println("I am sleeping");
    }

    public abstract void go();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            name = "Animal";
        }

        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && name.equals(animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
