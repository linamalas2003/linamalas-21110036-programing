package objectOriented;
//Item class represents an item that can be ordered from the bakery
//It contains the name and price of the item
public class Item {
	private String name;// name of the item
	private double price;// price of the item
	// constructor for the Item class
	public Item(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	 public Item() {
	}

	// getter method for the name of the item
	public String getName() {
		return name;
	}
	 // setter method for the price of the item
	public void setName(String name) {
		this.name = name;
	}
	 // getter method for the price of the item
	public double getPrice() {
		return price;
	}
	 // setter method for the price of the item
	public void setPrice(double price) {
		this.price = price;
	}

}
