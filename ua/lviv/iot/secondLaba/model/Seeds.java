package ua.lviv.iot.secondLaba.model;

public class Seeds extends Good{

	private double weightPerPacket;

	public Seeds(String name, int quantity, String category, double weightPerPacket) {
		super(name, quantity, category);
		this.setWeightPerPacket(weightPerPacket);
	}

	public double getWeightPerPacket() {
		return weightPerPacket;
	}

	public void setWeightPerPacket(double weightPerPacket) {
		this.weightPerPacket = weightPerPacket;
	}

}
