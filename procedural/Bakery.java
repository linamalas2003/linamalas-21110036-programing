package procedural;

import java.util.ArrayList;
import java.util.Scanner;

public class Bakery {
		// ArrayLists to store the orders, prices, and quantities
		public static ArrayList<String> orders=new ArrayList<>();
		public static ArrayList<Double> prices=new ArrayList<>();
		public static ArrayList<Integer> quantities=new ArrayList<>();
		 // variables to hold the order, price, and quantity for each item
		static double price=0;
		static String order="";
		static int quantity=0;
		  // variable to hold the total price of all orders
		static double total;
		public static void main(String[] args) {
			// greet the user
			System.out.println("hello welcome to Lina's bakery");
			// variable to store the user's menu choice
			int num = 0;
			 // loop until the user enters -1 to exit
			while(num!=-1) {
				   // present the menu options
					System.out.println("please choose a catogory based on the number or press -1 to exit");
					System.out.println("1.bread \n2.pastries");
					Scanner read=new Scanner(System.in);
					num=read.nextInt();
					// switch based on the user's choice
					switch(num)
					{
						case 1:
							// call the bread method
							bread();
				
							break;
						case 2:
							// call the pastries method
							pastries();
							break;
						case -1:
							// check if the user has made any orders
							if(orders.size()==0)
							{
								// if not, inform the user and exit the program
								System.out.println("you have not ordered, but thank you for visiting our bakery");
								return;
							}
							else
							{
								// if so, print the receipt
								System.out.println("");
								System.out.println("your recipt is: ");
								for(int i=0;i<orders.size();i++)
								{
									// print the item number, name, quantity, and price
									System.out.println("item no: "+(i+1)+" "+orders.get(i)+"*"+quantities.get(i)+" price:"+prices.get(i)+"jd");
									// print the total
								}
								System.out.println("your total is "+ total+"jd");
								// thank the user
								System.out.println("thank you for shopping at Lina's Bakery");
							}
							break;
							default:
								// inform the user of an invalid choice
								System.out.println("invalid choice");
							}
						}
					}
		public static void bread()
		{
			// variable to store the user's choice
			int ch=0;
			 // loop until the user enters -1 to exit
			while(ch!=-1) {
				// present the bread options
				System.out.println("enter the number of your choice and quantity");
				System.out.println("1.hammam(6 pieces 0.75 )\n2.toast(1 packege 1.5 jd)\n3. arabic bread(1 package 0.40)\nor -1 to exit");
				Scanner r=new Scanner(System.in);
				System.out.println("choice:");
				ch=r.nextInt();
			
				switch(ch)
				{
				case 1:
					// assign the order, price, and quantity for hammam
					order="hammam";
					price=0.75;
					System.out.println("enter the quantity");
					quantity=r.nextInt();
					break;
				case 2:
					// assign the order, price, and quantity for toast
					order="toast";
					price=1.5;
					System.out.println("enter the quantity");
					quantity=r.nextInt();
					break;
				case 3:
					// assign the order, price, and quantity for arabic bread
					order="arabic bread";
					price=0.4;
					System.out.println("enter the quantity");
					quantity=r.nextInt();
					break;
				case -1:
					// if the user enters -1, exit the loop
					return;
				default: 
					// inform the user of an invalid choice
					System.out.println("invalid choice try again");
					break;
				
				}
				// calculate the total price for the item
				price=price*quantity;
				// add the order, price, and quantity to the corresponding ArrayLists
				orders.add(order);
				prices.add(price);
				quantities.add(quantity);
				// add the price of the item to the total
				total+=price; 
				}		
			}
		public static void pastries ()
		{
			int ch=0;
			while(ch!=-1) {
				// present the pastries options
				System.out.println("enter the number of your choice and the amount");
				System.out.println("1.turkey with cheese-1.5 jd\n2.salami with cheese-1.5 jd\n3.mixed cheese-1.2 jd\n4.zataar-1jd\n5.hotdog-0.35\n6.potato-0.40");
				Scanner r=new Scanner(System.in);
				System.out.println("choice:");
				ch=r.nextInt();
				// switch statement to assign the order, price, and quantity based on user's choice
				switch(ch)
				{
					case 1:
						// assign the order, price, and quantity for turkey with cheese
						order="turkey with cheese";
						price=1.5;
						System.out.println("enter the quantity");
						quantity=r.nextInt();
						break;
					case 2:
						// assign the order, price, and quantity for salami with cheese
						order="salami with cheese";
						price=1.5;
						System.out.println("enter the quantity");
						quantity=r.nextInt();
						break;
					case 3:
						// assign the order, price, and quantity for mixed cheese
						order="mixed cheese";
						price=1.2;
						System.out.println("enter the quantity");
						quantity=r.nextInt();
						break;
					case 4:
						// assign the order, price, and quantity for zaatar
						order="zaatar";
						price=1;
						System.out.println("enter the quantity");
						quantity=r.nextInt();
						break;
					case 5:
						// assign the order, price, and quantity for hotdogs
						order="hotdog";
						price=0.35;
						System.out.println("enter the quantity");
						quantity=r.nextInt();
						break;
					case 6:
						// assign the order, price, and quantity for potato
						order="potato";
						price=0.4;
						System.out.println("enter the quantity");
						quantity=r.nextInt();
						break;
					case -1:
						// if the user enters -1, exit the loop
						return;
					default: 
						// inform the user of an invalid choice
						System.out.println("invalid choice try again");
						break;
				
				}
				// calculate the total price for the item
				price=price*quantity;
				// add the order, price, and quantity to the corresponding ArrayLists
				orders.add(order);
				prices.add(price);
				quantities.add(quantity);
				// add the price of the item to the total
				total+=price;
			}
			

	}

}
