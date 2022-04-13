package ua.lviv.iot.JavaLab.models;

public class Fertilizer extends Good{

	private double weightPerBagInKilo;

	public Fertilizer(String name, int quantity, String category,double weightPerBagInKilo) {
		super(name, quantity, category);
		this.setWeightPerBagInKilo(weightPerBagInKilo);
	}

	public double getWeightPerBagInKilo() {
		return weightPerBagInKilo;
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
