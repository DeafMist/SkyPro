package course2.lesson3.animals;

public class Bird extends Animal {
    private String habitat;

    public Bird(String name, int age, String habitat) {
        super(name, age);
        setHabitat(habitat);
    }

    public void hunt() {
        System.out.println("I am bird and i am hunting");
    }

    @Override
    public void eat() {
        System.out.println("I am bird and i am eating");
    }

    @Override
    public void go() {
        System.out.println("I am bird and i am going");
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
}
