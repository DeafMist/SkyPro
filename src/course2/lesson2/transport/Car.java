package course2.lesson2.transport;

import java.time.LocalDate;

public class Car {
    public static class Key {
        private final boolean remoteEngineStart;

        private final boolean keylessAccess;

        public Key() {
            this(false, false);
        }

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }

        @Override
        public String toString() {
            return "Key{" +
                    "remoteEngineStart=" + remoteEngineStart +
                    ", keylessAccess=" + keylessAccess +
                    '}';
        }
    }

    public static class Insurance {
        private final LocalDate expireDate;

        private final int cost;

        private final String number;

        public Insurance() {
            this(LocalDate.now().plusDays(365), 1000, "123456789");
        }

        public Insurance(LocalDate expireDate, int cost, String number) {
            if (expireDate == null) {
                expireDate = LocalDate.now().plusDays(365);
            }

            if (number == null) {
                number = "123456789";
            }

            this.expireDate = expireDate;
            this.cost = cost;
            this.number = number;
        }

        public void checkExpireDate() {
            if (expireDate.isBefore(LocalDate.now()) || expireDate.isEqual(LocalDate.now())) {
                System.out.println("Пора срочно менять страховку: у нынешней закончился срок действия!!!");
            }
        }

        public void checkNumber() {
            if (number.length() != 9) {
                System.out.println("Номер страховки некорректный");
            }
        }

        public LocalDate getExpireDate() {
            return expireDate;
        }

        public int getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

        @Override
        public String toString() {
            return "Insurance{" +
                    "expireDate=" + expireDate +
                    ", cost=" + cost +
                    ", number='" + number + '\'' +
                    '}';
        }
    }
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int productionYear;
    private final String productionCountry;

    private String transmission;

    private final String bodyType;

    private String registrationNumber;

    private final int seatsNumber;

    private String rubber;

    private Key key;

    private Insurance insurance;

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        this(brand, model, engineVolume, color, productionYear, productionCountry,
                "МКПП", "седан", "x000xx000", 5, "летняя", null, null);
    }

    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int productionYear,
               String productionCountry,
               String transmission,
               String bodyType,
               String registrationNumber,
               int seatsNumber,
               String rubber,
               Key key,
               Insurance insurance) {
        if (brand == null) {
            brand = "default";
        }

        if (model == null) {
            model = "default";
        }

        if (productionCountry == null) {
            productionCountry = "default";
        }

        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }

        if (color == null) {
            color = "белый";
        }

        if (productionYear <= 0) {
            productionYear = 2000;
        }

        if (transmission == null) {
            transmission = "МКПП";
        }

        if (bodyType == null) {
            bodyType = "седан";
        }

        if (registrationNumber == null || !isCorrectRegNumber()) {
            registrationNumber = "x000xx000";
        }

        if (seatsNumber <= 0) {
            seatsNumber = 5;
        }

        if (rubber == null) {
            rubber = "летняя";
        }

        if (key == null) {
            key = new Key();
        }

        if (insurance == null) {
            insurance = new Insurance();
        }

        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.registrationNumber = registrationNumber;
        this.seatsNumber = seatsNumber;
        this.rubber = rubber;
        this.key = key;
        this.insurance = insurance;
    }

    public void changeRubber() {
        if (rubber.equals("летняя")) {
            rubber = "зимняя";
        }
        else {
            rubber = "летняя";
        }
    }

    public boolean isCorrectRegNumber() {
        if (registrationNumber == null) {
            return false;
        }

        if (registrationNumber.length() != 9) {
            return false;
        }

        if (!Character.isAlphabetic(registrationNumber.charAt(0)) || !Character.isAlphabetic(registrationNumber.charAt(4))
        || !Character.isAlphabetic(registrationNumber.charAt(5))) {
            return false;
        }

        if (!Character.isDigit(registrationNumber.charAt(1)) || !Character.isDigit(registrationNumber.charAt(2)) ||
                !Character.isDigit(registrationNumber.charAt(3)) || !Character.isDigit(registrationNumber.charAt(6)) ||
                !Character.isDigit(registrationNumber.charAt(7)) || !Character.isDigit(registrationNumber.charAt(8))) {
            return false;
        }

        return true;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }

        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null) {
            color = "белый";
        }

        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null) {
            transmission = "МКПП";
        }

        this.transmission = transmission;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || !isCorrectRegNumber()) {
            registrationNumber = "x000xx000";
        }

        this.registrationNumber = registrationNumber;
    }

    public String getRubber() {
        return rubber;
    }

    public void setRubber(String rubber) {
        if (rubber == null) {
            rubber = "летняя";
        }

        this.rubber = rubber;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        if (key == null) {
            key = new Key();
        }

        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        if (insurance == null) {
            insurance = new Insurance();
        }

        this.insurance = insurance;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", productionYear=" + productionYear +
                ", productionCountry='" + productionCountry + '\'' +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", seatsNumber=" + seatsNumber +
                ", rubber='" + rubber + '\'' +
                ", key=" + key +
                ", insurance=" + insurance +
                '}';
    }
}
