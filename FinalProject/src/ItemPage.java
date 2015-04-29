import javax.swing.JFrame;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JPanel;

import java.awt.SystemColor;

import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;

import javax.swing.SwingConstants;

import java.awt.Color;

import javax.swing.JTextArea;

import java.awt.Font;


public class ItemPage extends JFrame{
	String input;
	public static String itemNumber;
	public double price;
	double buffaloWings = 5.25;
	double spicyWings = 6.25;
	double frenchFries = 3.75;
	double chickenWrap = 7.55;
	double steakAndCheese = 10.25;
	double veggieMelt = 7.75;
	public static int variable;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ItemPage frame = new ItemPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ItemPage() {
		setBounds(500, 150, 884, 741);
		setTitle("Appetizers");
		getContentPane().setLayout(null);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.activeCaptionBorder);
		panel_2.setBounds(15, 16, 297, 655);
		getContentPane().add(panel_2);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(312, 16, 535, 655);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JTextArea txtrHelloWorld = new JTextArea();
		txtrHelloWorld.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtrHelloWorld.setBounds(15, 70, 267, 333);
		panel_2.add(txtrHelloWorld);

		JButton btnNewButton = new JButton("Buffalo Wings");
		btnNewButton.setBackground(new Color(233, 150, 122));

		btnNewButton.addActionListener(new ActionListener()
		{
			private int clicked;
			public void actionPerformed(ActionEvent e) {
				if(clicked==0)
				{
				NumberPad numberPad = new NumberPad();
				numberPad.setVisible(true);
				}
				if(clicked>0){
					buffaloWings = buffaloWings * variable;
					input = itemNumber+"  Buffalo Wings    $" + buffaloWings+"\n";
					txtrHelloWorld.append(input);
					//FastFoodPage.foodTextArea.append(input);
					System.out.println("Input Value: "+ input + "Price:$"+price);
					price = buffaloWings;
									
				}
				
				clicked++;
			}
		});
		btnNewButton.setBounds(0, 16, 118, 201);
		panel_1.add(btnNewButton);

		JButton button_7 = new JButton("Spicy Wings");
		button_7.setBackground(new Color(255, 99, 71));
		button_7.addActionListener(new ActionListener()
		{
			private int clicked;
			public void actionPerformed(ActionEvent e) {
				if(clicked==0)
				{
				NumberPad numberPad = new NumberPad();
				numberPad.setVisible(true);
				}
				if(clicked>0){
					spicyWings = spicyWings * variable;
					input = itemNumber+"  Spicy Wings    $" + spicyWings+"\n";
					txtrHelloWorld.append(input);
					System.out.println("Input Value: "+ input + "Price:$"+price);
					price = spicyWings;
									
				}
				
				clicked++;
			}
		});
		button_7.setBounds(128, 16, 129, 201);
		panel_1.add(button_7);

		JButton btnFrenchFries = new JButton("French Fries");
		btnFrenchFries.setBackground(new Color(250, 235, 215));
		btnFrenchFries.addActionListener(new ActionListener()
		{
			private int clicked;
			public void actionPerformed(ActionEvent e) {
				if(clicked==0)
				{
				NumberPad numberPad = new NumberPad();
				numberPad.setVisible(true);
				}
				if(clicked>0){
					frenchFries = frenchFries * variable;
					input = itemNumber+"  French Fries    $" + frenchFries+"\n";
					txtrHelloWorld.append(input);
					System.out.println("Input Value: "+ input + "Price:$"+price);
					price = frenchFries;
									
				}
				
				clicked++;
			}
		});
		btnFrenchFries.setBounds(267, 16, 129, 201);
		panel_1.add(btnFrenchFries);

		JButton btnSalad = new JButton("Chips");
		btnSalad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSalad.setBounds(128, 211, 129, 230);
		panel_1.add(btnSalad);

		JButton btnChickenNuggets = new JButton("Nuggets");
		btnChickenNuggets.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnChickenNuggets.setBounds(0, 211, 118, 230);
		panel_1.add(btnChickenNuggets);

		JButton btnMozzerellaSticks = new JButton("Egg Rolls");
		btnMozzerellaSticks.setBounds(267, 211, 129, 230);
		panel_1.add(btnMozzerellaSticks);
		
		//Will go back to the fast food page
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
			close();
			}
		});
		btnNewButton_2.setBounds(25, 558, 168, 81);
		panel_1.add(btnNewButton_2);

		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(167, 9, 115, 29);
		btnClear.setBackground(new Color(240, 255, 240));
		btnClear.addActionListener(new ActionListener()
		{

			public void actionPerformed(ActionEvent e) {
				txtrHelloWorld.setText("");
				buffaloWings = 5.25;
				variable = 1;
				itemNumber="1";
				price = 0;
			}
		});
		panel_2.setLayout(null);
		panel_2.add(btnClear);

		//CREDIT CARD BUTTON
		JButton btnNewButton_1 = new JButton("Credit");
		btnNewButton_1.setBounds(15, 560, 115, 29);
		btnNewButton_1.setBackground(new Color(240, 255, 240));
		btnNewButton_1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				CreditCardPage cPage = new CreditCardPage();
				cPage.setVisible(true);
			}
		});
		panel_2.add(btnNewButton_1);

		//CASH BUTTON
		JButton btnCash = new JButton("Cash");
		btnCash.setBounds(167, 560, 115, 29);
		btnCash.setBackground(new Color(240, 255, 240));
		btnCash.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				CashPage cash = new CashPage();
				cash.setVisible(true);
			}
		});
		panel_2.add(btnCash);

		//OTHERS BUTTON
		JButton btnOptionws = new JButton("Others");
		btnOptionws.setBounds(167, 605, 115, 29);
		btnOptionws.setBackground(new Color(240, 255, 240));
		btnOptionws.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				OthersPage others = new OthersPage();
				others.setVisible(true);
			}
		});
		panel_2.add(btnOptionws);
		
		
	}
	
	public void close()
	{
		WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
	}
}

