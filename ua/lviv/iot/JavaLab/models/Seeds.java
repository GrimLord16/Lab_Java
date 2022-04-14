package ua.lviv.iot.JavaLab.models;

public class Seeds extends Good{

	private double weightPerPacketInGrams;

	public Seeds(String name, int quantity, String category, double weightPerPacket) {
		super(name, quantity, category);
		this.setWeightPerPacketInGrams(weightPerPacket);
	}

	public double getWeightPerPacketInGrams() {
		return weightPerPacketInGrams;
	}

	public void setWeightPerPacketInGrams(double weightPerPacketInGrams) {
		this.weightPerPacketInGrams = weightPerPacketInGrams;
	}
	public String toString() {
        return "Seeds {" +
                "name: " + getName() +
                ", quantity = " + getQuantity() +
                ", weight of a packet with seeds = " + weightPerPacketInGrams +
                ", category: " + getCategory() +
                '}';
    }

}
