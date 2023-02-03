package objectOriented;
import java.util.ArrayList;
//Bakery class represents the bakery store
//It contains an ArrayList of Order objects representing all orders placed by customers
public class Bakery {
	//Composition
	private ArrayList<Order> orders;// ArrayList of Order objects representing all orders
	 // constructor for the Bakery class
  public Bakery() {
      orders = new ArrayList<>();
  }
// method to add an Order object to the ArrayList of orders
  //it implements polymorphism by accepting arguments from type order which includes subclasses Bread,and Pastry
  public void addOrder(Order order) {
      orders.add(order);
  }
// method to calculate the total price of all orders
  public double getTotalPrice() {
      double total = 0;
      for (Order order : orders) {
          total += order.getTotalPrice();
      }
      return total;
  }
  // method to print the receipt of all orders
  public void printReceipt() {
      for (int i = 0; i < orders.size(); i++) {
          Order order = orders.get(i);
          Item item = order.getItem();
          System.out.println("Item no: " + (i + 1) + " " + item.getName() + "*" + order.getQuantity() + " price: " + order.getTotalPrice() + "jd");
      }
      System.out.println("Your total is: " + getTotalPrice() + "JD");
  }
}
