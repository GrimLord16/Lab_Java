package ua.lviv.iot.term2.model;

import lombok.Getter;

@Getter
public class Seeds extends Good{

	private double weightPerPacketInGrams;

	public Seeds(String name, int quantity, String category, double weightPerPacketInGrams) {
		super(name, quantity, category);
		this.setWeightPerPacketInGrams(weightPerPacketInGrams);
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