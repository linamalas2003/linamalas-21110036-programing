package objectOriented;
public class Bread  extends Item{
	// constructor for the Bread class
		public Bread(String name, double price) {
			super(name, price);
			// TODO Auto-generated constructor stub
		}
		public Bread()
		{
			super();
		}
		//polymorphisim overridding 
		public void printMenu()
		{
			System.out.println("1. Hammam (6 pieces 0.75)\n2. Toast (1 package 1.5 jd)\n3. Arabic bread (1 package 0.40)\nor -1 to exit");
		}

}
