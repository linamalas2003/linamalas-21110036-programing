package lab14;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame=new JFrame("word and characters counter");
		frame.setSize(400, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		JLabel word = new JLabel("words:");
		word.setBounds(50, 20, 100, 100);
		frame.add(word);
		JLabel character =new JLabel("characters:");
		word.setBounds(200, 20, 100, 100);
		frame.add(character);
		JTextField txt =new JTextField();
		frame.add(txt);
		txt.setBounds(35, 90, 300, 250);
		frame.add(txt);
		JButton bt = new JButton("count words and characters");
		bt.setBounds(80, 355, 210, 40);
		frame.add(bt);
		
		bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String wrd = txt.getText();
				String []wrds= wrd.split(" ");
				word.setText("words: " + wrds.length);
				String ch=wrd.replace(" ", "");
				character.setText("characters: "+ch.length());
				
								
			}
		});
		frame.setLayout(null);
		frame.setVisible(true);

		frame.setLocationRelativeTo(null);
	}

}
