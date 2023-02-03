package objectOriented;
import java.util.Scanner;
public class MainClass {
	// MainClass class contains the main method and handles user input and output
	public static void main(String[] args) {
		System.out.println("Hello welcome to Lina's bakery");
        Bakery bakery = new Bakery(); // create a new Bakery object
        
        Scanner read = new Scanner(System.in);
        int num = 0;
        // loop to handle user input and output
        while (num != -1) {
            System.out.println("Please choose a category based on the number or press -1 to exit");
            System.out.println("1. Bread \n2. Pastries");
            num = read.nextInt();
            switch (num) {
                case 1:
                    bread(bakery);// call method to handle bread orders
                    break;
                case 2:
                    pastries(bakery); // call method to handle pastry orders
                    break;
                case -1:
                    if (bakery.getTotalPrice() == 0) {
                    	 System.out.println("You have not ordered, but thank you for visiting our bakery");
                         return;
                     } else {
                    	 System.out.println("");
                         System.out.println("Your receipt is: ");
                         bakery.printReceipt();
                         System.out.println("Thank you for shopping at Lina's Bakery");
                     }
                     break;
                 default:
                     System.out.println("Invalid choice");
             }
         }
     }

     public static void bread(Bakery bakery) {
         int ch = 0;
         while (ch != -1) {
        	 Bread bread = new Bread();
             System.out.println("Enter the number of your choice and quantity"); 
             bread.printMenu();
             Scanner r = new Scanner(System.in);
             System.out.println("Choice:");
             ch = r.nextInt();
             switch (ch) {
                 case 1:
                     bread = new Bread("Hammam", 0.75);
                     System.out.println("Enter the quantity:");
                     int quantity = r.nextInt();
                     bakery.addOrder(new Order(bread, quantity));
                     break;
                 case 2:
                     bread = new Bread("Toast", 1.5);
                     System.out.println("Enter the quantity:");
                     quantity = r.nextInt();
                     bakery.addOrder(new Order(bread, quantity));
                     break;
                 case 3:
                     bread = new Bread("Arabic bread", 0.4);
                     System.out.println("Enter the quantity:");
                     quantity = r.nextInt();
                     bakery.addOrder(new Order(bread, quantity));
                     break;
                 case -1:
                     return;
                 default:
                     System.out.println("Invalid choice, try again.");
                     break;
             }
         }
     }
     public static void pastries(Bakery bakery) {
         int ch = 0;
         while (ch != -1) {
        	 Pastry pastry=new Pastry();
             System.out.println("Enter the number of your choice and quantity");
             pastry.printMenu();
             Scanner r = new Scanner(System.in);
             System.out.println("Choice:");
             ch = r.nextInt();

             switch (ch) {
                 case 1:
                     pastry = new Pastry("Turkey with cheese", 1.5);
                     System.out.println("Enter the quantity:");
                     int quantity = r.nextInt();
                     bakery.addOrder(new Order(pastry, quantity));
                     break;
                 case 2:
                     pastry = new Pastry("Salami with cheese", 1.5);
                     System.out.println("Enter the quantity:");
                     quantity = r.nextInt();
                     bakery.addOrder(new Order(pastry, quantity));
                     break;
                 case 3:
                     pastry = new Pastry("mixed cheese", 1.2);
                     System.out.println("Enter the quantity:");
                     quantity = r.nextInt();
                     bakery.addOrder(new Order(pastry, quantity));
                     break;
                 case 4:
                     pastry = new Pastry("zataar", 1);
                     System.out.println("Enter the quantity:");
                     quantity = r.nextInt();
                     bakery.addOrder(new Order(pastry, quantity));
                     break;
                 case 5:
                     pastry = new Pastry("hotdogs", 0.35);
                     System.out.println("Enter the quantity:");
                     quantity = r.nextInt();
                     bakery.addOrder(new Order(pastry, quantity));
                     break;
                 case 6:
                     pastry = new Pastry("potato", 0.4);
                     System.out.println("Enter the quantity:");
                     quantity = r.nextInt();
                     bakery.addOrder(new Order(pastry, quantity));
                     break;
                 case -1:
                     return;
                 default:
                     System.out.println("Invalid choice, try again.");
                     break;
             }
         }
     }
}
