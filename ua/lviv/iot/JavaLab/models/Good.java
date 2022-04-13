package ua.lviv.iot.JavaLab.models;

public abstract class Good {
	
	public Good(String name, int quantity, String category) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.category = category;
	}

	public Good(String name, int quantity) {
		this.name = name;
		this.quantity = quantity;
	}

	private String name;
	
	private int quantity;
	
	private String category;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	@Override
    public String toString() {
        return "Good {" +
                "name: " + name +
                ", quantity = " + quantity +
                ", category: " + category +
                '}';
    }
}
	
