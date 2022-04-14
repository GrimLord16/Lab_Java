package ua.lviv.iot.term2.model;

import lombok.Getter;

@Getter
public class Fertilizer extends Good{

	private double weightPerBagInKilo;

	public Fertilizer(String name, int quantity, String category,double weightPerBagInKilo) {
		super(name, quantity, category);
		this.setWeightPerBagInKilo(weightPerBagInKilo);
	}

	public void setWeightPerBagInKilo(double weightPerBagInKilo) {
		this.weightPerBagInKilo = weightPerBagInKilo;
	}
	public String toString() {
        return "Fertilizer {" +
                "name: " + getName() +
                ", quantity = " + getQuantity() +
                ", weight of a bag = " + weightPerBagInKilo +
                ", category: " + getCategory() +
                "}";
    }
}
