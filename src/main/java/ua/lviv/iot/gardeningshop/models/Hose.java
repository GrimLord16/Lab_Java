package ua.lviv.iot.gardeningshop.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Hose extends Good {

    private double lengthInMeters;

    public Hose(String name, int quantity, String category, double lengthInMeters) {
        super(name, quantity, category);
        this.setLengthInMeters(lengthInMeters);
    }
    @Override
    public String getHeader(){
        return String.format("%s, %s\n", super.getHeader(), "lengthInMeters");
    }

    @Override
    public String toCSV() {
        return String.format("%s,%s\n", super.toCSV(), getLengthInMeters());
    }
}
