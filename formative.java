package testing;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
public class formative {
	static double  first;
	static String operation;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	JFrame frame =new JFrame("Calculator");
		
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		JTextField txt =new JTextField();
		txt.setBounds(50, 20, 350, 40);
		frame.add(txt);
		JButton bt1 =new JButton("+");
		bt1.setBounds(50, 70, 45, 45);
		frame.add(bt1);
		bt1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				 first=Double.parseDouble(txt.getText());
				 operation="+";
				txt.setText("");
				
			}
		});
		JButton bt2 =new JButton("-");
		bt2.setBounds(115, 70, 45, 45);
		frame.add(bt2);
		bt2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				 first=Double.parseDouble(txt.getText());
				 operation="-";
					txt.setText("");
					
				
			}
		});
		JButton bt3 =new JButton("*");
		bt3.setBounds(180, 70, 45, 45);
		frame.add(bt3);
		bt3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				 first=Double.parseDouble(txt.getText());
				 operation="*";
				 txt.setText("");
					
			}
		});
		JButton bt4 =new JButton("/");
		bt4.setBounds(245, 70, 45, 45);
		frame.add(bt4);
		bt4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				 first=Double.parseDouble(txt.getText());
				 operation="/";
					txt.setText("");
			}
		});
		JButton bt5 =new JButton("=");
		bt5.setBounds(310, 70, 45, 45);
		frame.add(bt5);
		bt5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double second = Double.parseDouble(txt.getText());
				double result;
				if(operation=="+")
				{
					result=first+second;
					String res=Double.toString(result);
					txt.setText(res);
				}
				if(operation=="-")
				{
					result=first-second;
					String res=Double.toString(result);
					txt.setText(res);
				}
				if(operation=="*")
				{
					result=first*second;
					String res=Double.toString(result);
					txt.setText(res);
				}
				if(operation=="/")
				{
					result=first/second;
					String res=Double.toString(result);
					txt.setText(res);
				}				
			}
		});
		JButton bt6 =new JButton("0");
		bt6.setBounds(50, 135, 45, 45);
		frame.add(bt6);
		bt6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String p=txt.getText()+ bt6.getText();
				txt.setText(p);
			}
		});
		JButton bt7 =new JButton("1");
		bt7.setBounds(115, 135, 45, 45);
		frame.add(bt7);
		bt7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String p=txt.getText()+ bt7.getText();
				txt.setText(p);
				
			}
		});
		JButton bt8 =new JButton("2");
		bt8.setBounds(180,135, 45, 45);
		frame.add(bt8);
		bt8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String p=txt.getText()+ bt8.getText();
				txt.setText(p);
			}
		});
		JButton bt9 =new JButton("3");
		bt9.setBounds(245, 135, 45, 45);
		frame.add(bt9);
		bt9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String p=txt.getText()+ bt9.getText();
				txt.setText(p);
				
			}
		});
		JButton bt10 =new JButton("4");
		bt10.setBounds(310, 135, 45, 45);
		frame.add(bt10);
		bt10.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String p=txt.getText()+ bt10.getText();
				txt.setText(p);
				
			}
		});
		JButton bt11 =new JButton("5");
		bt11.setBounds(50, 200, 45, 45);
		frame.add(bt11);
		bt11.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String p=txt.getText()+ bt11.getText();
				txt.setText(p);
				
			}
		});
		JButton bt12 =new JButton("6");
		bt12.setBounds(115, 200, 45, 45);
		frame.add(bt12);
		bt12.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String p=txt.getText()+ bt12.getText();
				txt.setText(p);
			}
		});
		JButton bt13 =new JButton("7");
		bt13.setBounds(180, 200, 45, 45);
		frame.add(bt13);
		bt13.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String p=txt.getText()+ bt13.getText();
				txt.setText(p);
				
			}
		});
		JButton bt14 =new JButton("8");
		bt14.setBounds(245, 200, 45, 45);
		frame.add(bt14);
		bt14.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String p=txt.getText()+ bt14.getText();
				txt.setText(p);
			}
		});
		JButton bt15 =new JButton("9");
		bt15.setBounds(310, 200, 45, 45);
		frame.add(bt15);
		bt15.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String p=txt.getText()+ bt15.getText();
				txt.setText(p);
			}
		});
		JButton clrbt =new JButton("AC");
		clrbt.setBounds(375, 70, 50, 50);
		frame.add(clrbt);
		clrbt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//String clear=txt.getText();
				txt.setText("");
			}
		});
		frame.setVisible(true);

	}

}
