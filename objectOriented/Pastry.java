package objectOriented;
//Pastry class represents a type of item that can be ordered from the bakery
//It inherits from the Item class
public class Pastry extends Item{
	// constructor for the Pastry class
		public Pastry(String name, double price) {
			super(name, price);	
		}
		public Pastry()
		{
			super();
		}
		//polymorphisim overridding 
		public void printMenu()
		{
			System.out.println("1.Turkey with cheese-1.5jd\n2. 2.salami with cheese-1.5jd\n3.mixed cheese-1.2j\no4.zataar-1jd\n5.hotdogs-0.35\n6.potato-0.4jd\nor presss -1 to exit");
		}
}
