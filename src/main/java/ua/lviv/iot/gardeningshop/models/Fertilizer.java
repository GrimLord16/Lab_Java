package ua.lviv.iot.gardeningshop.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Fertilizer extends Good{

    private double weightPerBagInKilo;

    public Fertilizer(String name, int quantity, String category,double weightPerBagInKilo) {
        super(name, quantity, category);
        this.setWeightPerBagInKilo(weightPerBagInKilo);
    }
    @Override
    public String getHeader(){
        return String.format("%s, %s \n",super.getHeader(), "weightPerBagInKilo");
    }
    @Override
    public String toCSV(){
        return String.format("%s, %s \n", super.toCSV(),getWeightPerBagInKilo());
    }
}
