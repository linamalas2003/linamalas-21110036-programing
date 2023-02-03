package eventDriven;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Bakery {
		// TODO Auto-generated method stub
		//variables to store quantity, price, total, flag for validation and text for user input
		static int quantity=0;
		static double price=0;
		static double total=0;
		static boolean flag=true;
		static String text;
		static String order;
		// arrays to store order details
		static ArrayList<String> orders=new ArrayList<>();
		static ArrayList<Double> prices=new ArrayList<>();
		static ArrayList<Integer> quantities=new ArrayList<>();
		public static void main(String[] args) {
			// create a JFrame with the title "Lina's bakery"
			JFrame frame =new JFrame("Lina's bakery");
			// set size and layout
			frame.setSize(600,600);
			frame.setLayout(null);
			// set default close operation
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JLabel welcome=new JLabel("welcome to Lina's Bakery");
			welcome.setBounds(20, 20, 160, 20);
			frame.add(welcome);
			// create a label to instruct the user to choose items
			JLabel cat=new JLabel("please choose your Items from the following catagories:");
			cat.setBounds(20, 50, 350, 20);
			frame.add(cat);
			// create a label to indicate the category of items
			JLabel bread=new JLabel("-Bread");
			bread.setBounds(30, 80, 65, 20);
			frame.add(bread);
			// create a radio button for the first item
			JRadioButton op1=new JRadioButton("Hammam bread-0.75jd");
			op1.setBounds(40, 110,150, 20);
			frame.add(op1);
			// create a label for the quantity input
			JLabel q=new JLabel("");
			// create a text field for the quantity input
			JTextField txt=new JTextField();
			// create a button to add the item to the cart
			JButton add=new JButton("add to cart");
			// add an action listener to the add button
			add.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// get the text from the quantity input text field
					text= txt.getText();
					// loop through the text to check if it's a number
					for(int i=0;i<text.length();i++)
					{
						if(!Character.isDigit(text.charAt(i)))
						{
							flag=false;
							break;
						}
					}
					//check if the input is a valid number
					if(flag)
					{
						// convert the input text to integer and assign it to quantity variable
						quantity=Integer.parseInt(text);
						// show a message dialog to confirm the item was added successfully
						JOptionPane.showMessageDialog(frame, "item was added successfully ");
						// calculate the total price of the item by multiplying the quantity by the price
						price=price*quantity;
						// add the order details to their respective arrays
						orders.add(order);
						prices.add(price);
						quantities.add(quantity);
						// add the item's price to the total
						total+=price;
					}
					else
					{
						// show a message dialog to inform the user that the input is not a number
						JOptionPane.showMessageDialog(frame, "this is not a number");
						// set the flag back to true to allow for future validations
						flag=true;
					}
					
				}
			});
			// add an action listener to the first radio button
			op1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// set the bounds and text for the quantity label
					q.setBounds(190, 110, 105, 20);
					q.setText("enter the quantity:");
					frame.add(q);
					q.repaint();
					// set the bounds for the quantity text field
					txt.setBounds(300, 110, 30, 20);
					frame.add(txt);
					txt.repaint();
					// set the bounds for the add button
					add.setBounds(335, 110,100 ,20);
					frame.add(add);
					add.repaint();
					// set the price and order name for this item
					price=0.75;
					order="hammam bread";
				}
			});
			// create the second radio button
			JRadioButton op2=new JRadioButton("Toast bread-1.5jd");
			op2.setBounds(40, 130,150, 20);
			frame.add(op2);
			// add an action listener to the second radio button
			op2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
				// set the bounds and text for the quantity label	
					q.setBounds(190, 130, 105, 20);
					q.setText("enter the quantity:");
					frame.add(q);
					q.repaint();
					// set the bounds for the quantity text field
					txt.setBounds(300, 130, 30, 20);
					frame.add(txt);
					txt.repaint();
					// set the bounds for the add button
					add.setBounds(335, 130,100 ,20);
					frame.add(add);
					add.repaint();
					// set the price and order details for this item
					price=1.5;
					order="toast bread";
					
				}
			});
			// create the third radio button
			JRadioButton op3=new JRadioButton("Arabic bread-0.4jd");
			op3.setBounds(40,150,150, 20);
			frame.add(op3);
			// add an action listener for the third item
			op3.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// set the text and location of the quantity label	
					q.setBounds(190, 150, 105, 20);
					q.setText("enter the quantity:");
					frame.add(q);
					q.repaint();
					// set the location of the quantity text field
					txt.setBounds(300, 150, 30, 20);
					frame.add(txt);
					txt.repaint();
					// set the location of the add button
					add.setBounds(335, 150,100 ,20);
					frame.add(add);
					add.repaint();
					// set the price and order details for this item
					price=0.4;
					order="arabic bread";
				}
			});
			// create a label for the pastry category
			JLabel pastry=new JLabel("-Pastry");
			pastry.setBounds(30, 175, 65, 20);
			frame.add(pastry);
			// create a radio button for the fourth item
			JRadioButton op4=new JRadioButton("Turkey with cheese-1.5jd");
			op4.setBounds(40, 200,180, 20);
			frame.add(op4);
			op4.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// set the text and location of the quantity label	
					q.setBounds(220, 200, 105, 20);
					q.setText("enter the quantity:");
					frame.add(q);
					q.repaint();
					// set the location of the quantity text field
					txt.setBounds(330, 200, 30, 20);
					frame.add(txt);
					txt.repaint();
					// set the location of the add button
					add.setBounds(365, 200,100 ,20);
					frame.add(add);
					add.repaint();
					// set the price and order details for this item
					price=1.5;
					order="Turkey with cheese";
					
				}
			});
			// create the fifth radio button
			JRadioButton op5=new JRadioButton("Salami with cheese-1.5jd");
			// add an action listener for the fifth item
			op5.setBounds(40, 220,180, 20);
			frame.add(op5);
			op5.addActionListener(new ActionListener() {
				// set the text and location of the quantity label
				
				@Override
				public void actionPerformed(ActionEvent e) {
					q.setBounds(220, 220, 105, 20);
					q.setText("enter the quantity:");
					frame.add(q);
					q.repaint();
					// set the location of the quantity text field
					txt.setBounds(330, 220, 30, 20);
					frame.add(txt);
					txt.repaint();
					// set the location of the add button
					add.setBounds(365, 220,100 ,20);
					frame.add(add);
					add.repaint();
					// set the price and order details for this item
					price=1.5;
					order="Salami with cheese";
				}
			});
			// create the sixth radio button
			JRadioButton op6=new JRadioButton("mixed cheese-1.2jd");
			op6.setBounds(40,240,180, 20);
			frame.add(op6);
			op6.addActionListener(new ActionListener() {
				// set the text and location of the quantity label
				@Override
				public void actionPerformed(ActionEvent e) {
					q.setBounds(220, 240, 105, 20);
					q.setText("enter the quantity:");
					frame.add(q);
					q.repaint();
					// set the location of the quantity text field
					txt.setBounds(330, 240, 30, 20);
					frame.add(txt);
					txt.repaint();
					// set the location of the add button
					add.setBounds(365, 240,100 ,20);
					frame.add(add);
					add.repaint();
					// set the price and order details for this item
					price=1.2;
					order="mixed cheese";
				}
			});
			// create the seventh radio button
			JRadioButton op7=new JRadioButton("zataar-1jd");
			op7.setBounds(40,260,150,20);
			frame.add(op7);
			op7.addActionListener(new ActionListener() {
				// set the text and location of the quantity label
				@Override
				public void actionPerformed(ActionEvent e) {
					q.setBounds(190, 260, 105, 20);
					q.setText("enter the quantity:");
					frame.add(q);
					q.repaint();
					// set the location of the quantity text field
					txt.setBounds(300, 260, 30, 20);
					frame.add(txt);
					txt.repaint();
					// set the location of the add button
					add.setBounds(335, 260,100 ,20);
					frame.add(add);
					add.repaint();
					// set the price and order details for this item
					price=1;
					order="zataar";
				}
			});
			// create the eighth radio button
			JRadioButton op8=new JRadioButton("hotdogs-0.35jd");
			op8.setBounds(40, 280,150, 20);
			frame.add(op8);
			op8.addActionListener(new ActionListener() {
				// set the text and location of the quantity label
				@Override
				public void actionPerformed(ActionEvent e) {
					q.setBounds(190, 280, 105, 20);
					q.setText("enter the quantity:");
					frame.add(q);
					q.repaint();
					// set the location of the quantity text field
					txt.setBounds(300, 280, 30, 20);
					frame.add(txt);
					txt.repaint();
					// set the location of the add button
					add.setBounds(335, 280,100 ,20);
					frame.add(add);
					add.repaint();
					// set the price and order details for this item
					price=0.35;
					order="hotdogs";
				}
			});
			// create the eighth radio button
			JRadioButton op9=new JRadioButton("potato-0.40jd");
			op9.setBounds(40,300,150, 20);
			frame.add(op9);
			op9.addActionListener(new ActionListener() {
				// set the text and location of the quantity label
				@Override
				public void actionPerformed(ActionEvent e) {
					q.setBounds(190, 300, 105, 20);
					q.setText("enter the quantity:");
					frame.add(q);
					q.repaint();
					// set the location of the quantity text field
					txt.setBounds(300, 300, 30, 20);
					frame.add(txt);
					txt.repaint();
					// set the location of the add button
					add.setBounds(335, 300,100 ,20);
					frame.add(add);
					add.repaint();
					// set the price and order details for this item
					price=0.4;
					order="potato";
				}
			});
			//create a button group to group the radio buttons together
			ButtonGroup Item=new ButtonGroup();
			Item.add(op1);
			Item.add(op2);
			Item.add(op3);
			Item.add(op4);
			Item.add(op5);
			Item.add(op6);
			Item.add(op7);
			Item.add(op8);
			Item.add(op9);
			JButton order=new JButton("Place order");
			order.setBounds(250, 350, 100, 20);
			frame.add(order);	
			frame.setVisible(true);
			order.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(prices.size()==0)
					{
						//shows a message to tell the user that they didn't order
						String message="you have not ordered";
						JOptionPane.showMessageDialog(frame, message);
					}
					else
					{
						//shows a message that includes the receipt and thank you message
						String receipt = "Receipt:\n";
						for (int i = 0; i < orders.size(); i++) {
							receipt += "Item No:"+i+" "+orders.get(i)+ " x " + quantities.get(i)+"....." +prices.get(i)+"JD"+"\n";
						}
						receipt += "Total: " + total + " JD"+"\n";
						receipt+="Thank you for shopping with us";
						JOptionPane.showMessageDialog(frame, receipt);
						//clear these components so that the receipt resets
						orders.clear();
						total=0;
					}
				}
			});

	}

}
