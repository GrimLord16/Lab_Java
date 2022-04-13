package ua.lviv.iot.JavaLab.models;

public class Hose extends Good{

	private double lengthInMeters;

	public Hose(String name, int quantity, String category,double lengthInMeters) {
		super(name, quantity, category);
		this.setLengthInMeters(lengthInMeters);
	}

	public double getLengthInMeters() {
		return lengthInMeters;
	}

	public void setLengthInMeters(double lengthInMeters) {
		this.lengthInMeters = lengthInMeters;
	}
	@Override
    public String toString() {
        return "Hose {" +
                "name: " + getName() +
                ", quantity = " + getQuantity() +
                ", lenght of the hose = " + lengthInMeters +
                ",category: " + getCategory() +
                '}';
    }
}
