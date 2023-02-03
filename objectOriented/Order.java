package objectOriented;
//Order class represents an order placed by the customer
//It contains an Item object and the quantity of the item ordered
public class Order {
	//Order class represents an order placed by the customer
	//It contains an Item object and the quantity of the item ordered
	
		 private Item item;// Item object representing the item ordered
		    private int quantity;// quantity of the item ordered
		 // constructor for the Order class
		    public Order(Item item, int quantity) {
		        this.item = item;
		        this.quantity = quantity;
		    }
		 // getter method for the Item object of the order
		    public Item getItem() {
		        return item;
		    }
		  // setter method for the Item object of the order
		    public void setItem()
		    {
		    	this.item=item;
		    }
		 // getter method for the quantity of the order
		    public int getQuantity() {
		        return quantity;
		    }
		    // setter method for the quantity of the order
		    public void setQuantity()
		    {
		    	this.quantity=quantity;
		    }
		 // method to calculate the total price of the order
		    public double getTotalPrice() {
		        return item.getPrice() * quantity;
		    }


}
