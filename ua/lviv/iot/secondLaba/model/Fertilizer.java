package ua.lviv.iot.secondLaba.model;

public class Fertilizer extends Good{

	private double weightPerBag;

	public Fertilizer(String name, int quantity, String category,double weightPerBag) {
		super(name, quantity, category);
		this.setWeightPerBag(weightPerBag);
	}

	public double getWeightPerBag() {
		return weightPerBag;
	}

	public void setWeightPerBag(double weightPerBag) {
		this.weightPerBag = weightPerBag;
	}
	
}
