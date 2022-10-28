package course2.lesson3.transport;

public class Train extends Transport {
    private int tripCost;

    private int tripTime;

    private String startStation;

    private String endStation;

    private int wagonsCount;

    public Train(String brand,
                 String model,
                 int productionYear,
                 String productionCountry,
                 String color,
                 int maxSpeed,
                 int tripCost,
                 int tripTime,
                 String startStation,
                 String endStation,
                 int wagonsCount) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);

        setTripCost(tripCost);
        setTripTime(tripTime);
        setStartStation(startStation);
        setEndStation(endStation);
        setWagonsCount(wagonsCount);
        setFuel("дизель");
    }

    public int getTripCost() {
        return tripCost;
    }

    public void setTripCost(int tripCost) {
        if (tripCost < 0) {
            tripCost = Math.abs(tripCost);
        }

        this.tripCost = tripCost;
    }

    public int getTripTime() {
        return tripTime;
    }

    public void setTripTime(int tripTime) {
        if (tripTime < 0) {
            tripTime = Math.abs(tripTime);
        }

        this.tripTime = tripTime;
    }

    public String getStartStation() {
        return startStation;
    }

    public void setStartStation(String startStation) {
        if (startStation == null || startStation.isEmpty()) {
            startStation = "default";
        }

        this.startStation = startStation;
    }

    public String getEndStation() {
        return endStation;
    }

    public void setEndStation(String endStation) {
        if (endStation == null || endStation.isEmpty()) {
            endStation = "default";
        }

        this.endStation = endStation;
    }

    public int getWagonsCount() {
        return wagonsCount;
    }

    public void setWagonsCount(int wagonsCount) {
        if (wagonsCount < 0) {
            wagonsCount = Math.abs(wagonsCount);
        }

        this.wagonsCount = wagonsCount;
    }

    @Override
    public String refill() {
        return "Заправить дизелем";
    }

    @Override
    public void setFuel(String fuel) {}

    @Override
    public String toString() {
        return "Train{" + super.toString() +
                ", tripCost=" + tripCost +
                ", tripTime=" + tripTime +
                ", startStation='" + startStation + '\'' +
                ", endStation='" + endStation + '\'' +
                ", wagonsCount=" + wagonsCount +
                '}';
    }
}
