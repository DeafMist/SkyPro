package course2.lesson3.animals;

import java.util.Objects;

public class Predator extends Mammal {
    private final String foodType;

    public Predator(String name, int age, String habitat, int speed, String foodType) {
        super(name, age, habitat, speed);

        if (foodType == null || foodType.isEmpty()) {
            foodType = "meat";
        }

        this.foodType = foodType;
    }

    public void hunt() {
        System.out.println("I am predator and i am hunting");
    }

    @Override
    public void eat() {
        System.out.println("I am predator and i am eating");
    }

    @Override
    public void go() {
        System.out.println("I am predator and i am going");
    }

    public String getFoodType() {
        return foodType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predator predator = (Predator) o;
        return foodType.equals(predator.foodType);
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
