package course2.lesson7.logicPackage;

import course2.lesson7.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Sponsor {
    private String name;

    private int supportAmount;

    private final List<Transport> transports = new ArrayList<>();

    public Sponsor(String name) {
        this(name, 1000);
    }

    public Sponsor(String name, int supportAmount) {
        setName(name);
        setSupportAmount(supportAmount);
    }

    public void sponsorRace() {
        System.out.println(getName() + " спонсировал следующий заезд для " + getTransports());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = Main.doCorrectStringIfNeeded(name);
    }

    public int getSupportAmount() {
        return supportAmount;
    }

    public void setSupportAmount(int supportAmount) {
        if (supportAmount < 0) {
            supportAmount = Math.abs(supportAmount);
        }

        this.supportAmount = supportAmount;
    }

    public List<Transport> getTransports() {
        return transports;
    }

    public void addTransport(Transport transport) {
        transports.add(transport);
        transport.addSponsor(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsor sponsor = (Sponsor) o;
        return supportAmount == sponsor.supportAmount && name.equals(sponsor.name) && Objects.equals(transports, sponsor.transports);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, supportAmount, transports);
    }

    @Override
    public String toString() {
        return "Sponsor{" +
                "name='" + name + '\'' +
                ", supportAmount=" + supportAmount + '}';
    }
}
