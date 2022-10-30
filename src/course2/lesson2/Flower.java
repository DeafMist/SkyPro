package course2.lesson2;

public class Flower {
    private String flowerColor;
    private String country;
    private double cost;
    public int lifeSpan;

    public Flower(String flowerColor, String country, double cost) {
        this(flowerColor, country, cost, 3);
    }

    public Flower(String flowerColor, String country, double cost, int lifeSpan) {
        if (flowerColor == null || flowerColor.equals("")) {
            flowerColor = "белый";
        }

        if (country.equals("") || country == null) {
            country = "Россия";
        }

        if (cost <= 0) {
            cost = 1;
        }

        if (lifeSpan <= 0) {
            lifeSpan = 3;
        }

        this.flowerColor = flowerColor;
        this.country = country;
        this.cost = cost;
        this.lifeSpan = lifeSpan;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Цвет: " + flowerColor + ", " +
                "страна: " + country + ", " +
                "цена: " + cost + ", " +
                "срок стояния: " + lifeSpan;
    }
}
