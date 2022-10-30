package course2.lesson3.animals;

import java.util.Objects;

public class Herbivore extends Mammal {
    private final String foodType;

    public Herbivore(String name, int age, String habitat, int speed, String foodType) {
        super(name, age, habitat, speed);

        if (foodType == null || foodType.isEmpty()) {
            foodType = "grass";
        }

        this.foodType = foodType;
    }

    public void graze() {
        System.out.println("I am herbivore and i am grazing");
    }

    @Override
    public void eat() {
        System.out.println("I am herbivore and i am eating");
    }

    @Override
    public void go() {
        System.out.println("I am herbivore and i am going");
    }

    public String getFoodType() {
        return foodType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivore herbivore = (Herbivore) o;
        return foodType.equals(herbivore.foodType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), foodType);
    }

    @Override
    public String toString() {
        return "name='" + getName() + '\'' +
                ", age='" + getAge() + '\'' +
                ", habitat='" + getHabitat() + '\'' +
                ", speed='" + getSpeed() +
                ", foodType='" + foodType + '\'';
    }
}
