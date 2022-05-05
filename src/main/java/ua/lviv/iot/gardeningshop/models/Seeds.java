package ua.lviv.iot.gardeningshop.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Seeds extends Good {

    private double weightPerPacketInGrams;

    public Seeds(String name, int quantity, String category, double weightPerPacketInGrams) {
        super(name, quantity, category);
        this.setWeightPerPacketInGrams(weightPerPacketInGrams);
    }
    @Override
    public String getHeader(){
        return String.format("%s, %s\n", super.getHeader(), "weightPerPacketInGrams");
    }
    @Override
    public String toCSV() {
        return String.format("%s,%s\n", super.toCSV(), getWeightPerPacketInGrams());
    }
}
