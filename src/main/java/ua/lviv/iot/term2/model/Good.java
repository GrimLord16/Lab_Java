package ua.lviv.iot.term2.model;

import lombok.Getter;

@Getter
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

	public void setName(String name) {
		this.name = name;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
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

	public String getName() {
		return name;
	}

	public int getQuantity() {
		return quantity;
	}

	public String getCategory() {
		return category;
	}
}
