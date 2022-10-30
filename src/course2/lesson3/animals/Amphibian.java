package course2.lesson3.animals;

public class Amphibian extends Animal {
    private String habitat;

    public Amphibian(String name, int age, String habitat) {
        super(name, age);
        setHabitat(habitat);
    }

    public void hunt() {
        System.out.println("I am amphibian and i am hunting");
    }

    @Override
    public void eat() {
        System.out.println("I am amphibian and i am eating");
    }

    @Override
    public void go() {
        System.out.println("I am amphibian and i am going");
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

    @Override
    public String toString() {
        return "name='" + getName() + '\'' +
                ", age='" + getAge() + '\'' +
                ", habitat='" + getHabitat() + '\'';
    }
}
