package ua.lviv.iot.gardeningshop.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
public abstract class Good {

    public Good(String name, int quantity, String category) {
        super();
        this.name = name;
        this.quantity = quantity;
        this.category = category;
    }
    private String name;

    private int quantity;

    private String category;

    public String getHeader() {
        return String.format("%s, %s, %s\n", "name", "category", "quantity");
    }

    public String toCSV() {
        return String.format("%s, %s, %s\n", getName(), getCategory(), getQuantity());
    }
}
