import javax.swing.JFrame;

import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JPanel;

import java.awt.SystemColor;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.awt.Color;
import java.text.DecimalFormat;

import javax.swing.JTextArea;
import javax.swing.SwingConstants;


public class FastFoodPage extends JFrame{
	String input;
	public static String itemNumber;
	public double price;
	double buffaloWings = 5.25;
	double spicyWings = 6.25;
	double frenchFries = 3.75;
	double chickenWrap = 7.55;
	double steakCheese = 9.25;
	double burger = 8.75;
	double steak = 11.90;
	double spaghetti = 10.35;
	double chickenBreast = 9.70;
	double water = 1.50;
	double coke = 2.00;
	public static int variable;
	public static double cashPaid=0;
	public static JTextArea foodTextArea;
	public double totalPrice=0;
	public int clicked;
	public int clicked_1;
	public int clicked_2;
	public int clicked_3;
	public int clicked_4;
	public int clicked_5;
	public int clicked_6;
	public int clicked_7;
	public int clicked_8;
	public int clicked_9;
	public int clicked_10;
	public int clicked_11;
	public int creditClicked;



	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FastFoodPage frame = new FastFoodPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public FastFoodPage() {
		setBounds(500, 150, 884, 741);
		setTitle("Category");
		getContentPane().setLayout(null);
		
		JPanel recieptPanel = new JPanel();
		recieptPanel.setBackground(new Color(100, 149, 237));
		recieptPanel.setBounds(15, 16, 297, 655);
		getContentPane().add(recieptPanel);
		recieptPanel.setLayout(null);
		
		//RECEIPT TEXT AREA
		JTextArea foodTextArea = new JTextArea();
		foodTextArea.setBounds(15, 75, 267, 365);
		recieptPanel.add(foodTextArea);

		//MENU FOR APPETIZERS
		JPanel appPanel = new JPanel();
		appPanel.setBackground(new Color(102, 255, 102));
		appPanel.setBounds(337, 16, 497, 653);
		getContentPane().add(appPanel);
		appPanel.setVisible(false);
		appPanel.setLayout(null);
		
		//MENU FOR DRINKS
		JPanel drinksPanel = new JPanel();
		drinksPanel.setBackground(new Color(255, 127, 80));
		drinksPanel.setBounds(356, 16, 478, 653);
		getContentPane().add(drinksPanel);
		drinksPanel.setVisible(false);
		drinksPanel.setLayout(null);

		//MAIN FOOD MENU
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(new Color(255, 255, 51));
		mainPanel.setBounds(327, 16, 520, 655);
		getContentPane().add(mainPanel);
		mainPanel.setLayout(null);

		//MENU FOR LUNCH
		JPanel lunchPanel = new JPanel();
		lunchPanel.setBackground(new Color(244, 164, 96));
		lunchPanel.setBounds(348, 16, 486, 653);
		getContentPane().add(lunchPanel);
		lunchPanel.setVisible(false);
		lunchPanel.setLayout(null);
		
		//TEXT AREA FOR SUBTOTAL
		JTextArea subTotalArea = new JTextArea();
		subTotalArea.setBounds(15, 438, 267, 35);
		recieptPanel.add(subTotalArea);

		//MENU FOR DINNER
		JPanel dinnerPanel = new JPanel();
		dinnerPanel.setBounds(360, 16, 474, 653);
		getContentPane().add(dinnerPanel);
		dinnerPanel.setBackground(new Color(106, 90, 205));
		dinnerPanel.setVisible(false);
		dinnerPanel.setLayout(null);


		JButton btnNewButton_2 = new JButton("Buffalo Wings");
		btnNewButton_2.setBackground(new Color(255, 204, 51));
		btnNewButton_2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				if(clicked==0)
				{
					NumberPad numberPad = new NumberPad();
					numberPad.setVisible(true);
				}
				if(clicked>0){
					buffaloWings = buffaloWings * variable;
					input = itemNumber+"  Buffalo Wings    $" + buffaloWings+"\n";
					foodTextArea.append(input);
					price = buffaloWings;
					System.out.println("Input Value: "+ input + "Price:$"+price);
					totalPrice = totalPrice+price;
					System.out.println("Total Price: $"+totalPrice);
					String subSentence= "Subtotal:    $"+totalPrice;
					subTotalArea.setText(subSentence);

				}

				clicked++;


			}
		});
		btnNewButton_2.setBounds(34, 54, 129, 172);
		appPanel.add(btnNewButton_2);

		JButton btnSpicyWings = new JButton("Spicy Wings");
		btnSpicyWings.setBackground(new Color(255, 204, 51));
		btnSpicyWings.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				if(clicked_1==0)
				{
					NumberPad numberPad = new NumberPad();
					numberPad.setVisible(true);
				}
				if(clicked_1>0){
					spicyWings = spicyWings * variable;
					input = itemNumber+"  Spicy Wings    $" + spicyWings+"\n";
					foodTextArea.append(input);
					price = spicyWings;
					System.out.println("Input Value: "+ input + "Price:$"+price);
					totalPrice = totalPrice+price;
					System.out.println("Total Price: $"+totalPrice);	
					String subSentence= "Subtotal:    $"+totalPrice;
					subTotalArea.setText(subSentence);
				}

				clicked_1++;



			}
		});
		btnSpicyWings.setBounds(178, 54, 129, 172);
		appPanel.add(btnSpicyWings);

		JButton btnFrenchFries = new JButton("French Fries");
		btnFrenchFries.setBackground(new Color(255, 204, 51));
		btnFrenchFries.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				if(clicked_2==0)
				{
					NumberPad numberPad = new NumberPad();
					numberPad.setVisible(true);
				}
				if(clicked_2>0){
					frenchFries = frenchFries * variable;
					input = itemNumber+"  French Fries    $" + frenchFries+"\n";
					foodTextArea.append(input);
					price = frenchFries;
					System.out.println("Input Value: "+ input + "Price:$"+price);
					totalPrice = totalPrice+price;
					System.out.println("Total Price: $"+totalPrice);
					String subSentence= "Subtotal:    $"+totalPrice;
					subTotalArea.setText(subSentence);

				}

				clicked_2++;

			}
		});
		btnFrenchFries.setBounds(322, 54, 129, 172);
		appPanel.add(btnFrenchFries);

		JButton appBackButton = new JButton("Back");
		appBackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				appPanel.setVisible(false);
				mainPanel.setVisible(true);
			}
		});
		appBackButton.setBounds(48, 608, 115, 29);
		appPanel.add(appBackButton);

		

		JButton btnLunch = new JButton("Lunch");
		btnLunch.setBackground(new Color(255, 51, 51));
		btnLunch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				lunchPanel.setVisible(true);
				mainPanel.setVisible(false);

			}
		});
		btnLunch.setBounds(167, 46, 135, 198);
		mainPanel.add(btnLunch);

		JButton btnDinner = new JButton("Dinner");
		btnDinner.setBackground(new Color(255, 51, 51));
		btnDinner.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				dinnerPanel.setVisible(true);
				mainPanel.setVisible(false);
			}
		});
		btnDinner.setBounds(319, 46, 135, 198);
		mainPanel.add(btnDinner);

		JButton btnAppetizers = new JButton("Appetizers");
		btnAppetizers.setBackground(new Color(255, 51, 51));
		btnAppetizers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				appPanel.setVisible(true);
				mainPanel.setVisible(false);
			}
		});
		btnAppetizers.setBounds(15, 46, 135, 198);
		mainPanel.add(btnAppetizers);

		JButton btnDrinks = new JButton("Drinks");
		btnDrinks.setBackground(new Color(255, 51, 51));
		btnDrinks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				drinksPanel.setVisible(true);
				mainPanel.setVisible(false);
			}
		});
		btnDrinks.setBounds(15, 266, 135, 198);
		mainPanel.add(btnDrinks);

		





		JButton btnWater = new JButton("Water");
		btnWater.setBackground(new Color(30, 144, 255));
		btnWater.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				if(clicked_10==0)
				{
					NumberPad numberPad = new NumberPad();
					numberPad.setVisible(true);
				}
				if(clicked_10>0){
					water = water * variable;
					input = itemNumber+"  Water    $" + water+"\n";
					foodTextArea.append(input);
					price = water;
					System.out.println("Input Value: "+ input + "Price:$"+price);
					totalPrice = totalPrice+price;
					System.out.println("Total Price: $"+totalPrice);	
					String subSentence= "Subtotal:    $"+totalPrice;
					subTotalArea.setText(subSentence);
				}

				clicked_10++;



			}
		});
		btnWater.setBounds(15, 46, 154, 195);
		drinksPanel.add(btnWater);

		JButton btnCocaCola = new JButton("Coca-Cola");
		btnCocaCola.setBackground(new Color(30, 144, 255));
		btnCocaCola.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				if(clicked_11==0)
				{
					NumberPad numberPad = new NumberPad();
					numberPad.setVisible(true);
				}
				if(clicked_11>0){
					coke = coke * variable;
					input = itemNumber+"  Coca-Cola    $" + coke+"\n";
					foodTextArea.append(input);
					price = coke;
					System.out.println("Input Value: "+ input + "Price:$"+price);
					totalPrice = totalPrice+price;
					System.out.println("Total Price: $"+totalPrice);	
					String subSentence= "Subtotal:    $"+totalPrice;
					subTotalArea.setText(subSentence);
				}

				clicked_11++;



			}
		});
		btnCocaCola.setBounds(184, 46, 154, 195);
		drinksPanel.add(btnCocaCola);



		JButton btnSteak = new JButton("Steak");
		btnSteak.setBackground(new Color(255, 255, 224));
		btnSteak.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				if(clicked_7==0)
				{
					NumberPad numberPad = new NumberPad();
					numberPad.setVisible(true);
				}
				if(clicked_7>0){
					steak = steak * variable;
					input = itemNumber+"  Steak    $" + steak+"\n";
					foodTextArea.append(input);
					price = steak;
					System.out.println("Input Value: "+ input + "Price:$"+price);
					totalPrice = totalPrice+price;
					System.out.println("Total Price: $"+totalPrice);
					String subSentence= "Subtotal:    $"+totalPrice;
					subTotalArea.setText(subSentence);

				}

				clicked_7++;


			}
		});
		btnSteak.setBounds(15, 67, 135, 183);
		dinnerPanel.add(btnSteak);

		JButton btnSpaghetti = new JButton("Spaghetti");
		btnSpaghetti.setBackground(new Color(255, 255, 224));
		btnSpaghetti.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				if(clicked_8==0)
				{
					NumberPad numberPad = new NumberPad();
					numberPad.setVisible(true);
				}
				if(clicked_8>0){
					spaghetti = spaghetti * variable;
					input = itemNumber+"  Spaghetti    $" + spaghetti+"\n";
					foodTextArea.append(input);
					price = spaghetti;
					System.out.println("Input Value: "+ input + "Price:$"+price);
					totalPrice = totalPrice+price;
					System.out.println("Total Price: $"+totalPrice);
					String subSentence= "Subtotal:    $"+totalPrice;
					subTotalArea.setText(subSentence);

				}

				clicked_8++;


			}
		});
		btnSpaghetti.setBounds(169, 67, 140, 183);
		dinnerPanel.add(btnSpaghetti);

		JButton btnChickenBreast = new JButton("Chicken Breast");
		btnChickenBreast.setBackground(new Color(255, 255, 224));
		btnChickenBreast.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				if(clicked_9==0)
				{
					NumberPad numberPad = new NumberPad();
					numberPad.setVisible(true);
				}
				if(clicked_9>0){
					chickenBreast = chickenBreast * variable;
					input = itemNumber+"  Chicken Breast    $" + chickenBreast+"\n";
					foodTextArea.append(input);
					price = chickenBreast;
					System.out.println("Input Value: "+ input + "Price:$"+price);
					totalPrice = totalPrice+price;
					System.out.println("Total Price: $"+totalPrice);
					String subSentence= "Subtotal:    $"+totalPrice;
					subTotalArea.setText(subSentence);

				}

				clicked_9++;


			}
		});
		btnChickenBreast.setBounds(324, 67, 135, 183);
		dinnerPanel.add(btnChickenBreast);

		JButton btnChickenWrap = new JButton("Chicken Wrap");
		btnChickenWrap.setBackground(new Color(152, 251, 152));
		btnChickenWrap.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				if(clicked_4==0)
				{
					NumberPad numberPad = new NumberPad();
					numberPad.setVisible(true);
				}
				if(clicked_4>0){
					chickenWrap = chickenWrap * variable;
					input = itemNumber+"  Chicken Wrap    $" + chickenWrap+"\n";
					foodTextArea.append(input);
					price = chickenWrap;
					System.out.println("Input Value: "+ input + "Price:$"+price);
					totalPrice = totalPrice+price;
					System.out.println("Total Price: $"+totalPrice);
					String subSentence= "Subtotal:    $"+totalPrice;
					subTotalArea.setText(subSentence);

				}

				clicked_4++;


			}
		});
		btnChickenWrap.setBounds(15, 49, 129, 191);
		lunchPanel.add(btnChickenWrap);

		JButton btnSteakCheese = new JButton("Steak & Cheese");
		btnSteakCheese.setBackground(new Color(152, 251, 152));
		btnSteakCheese.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				if(clicked_5==0)
				{
					NumberPad numberPad = new NumberPad();
					numberPad.setVisible(true);
				}
				if(clicked_5>0){
					steakCheese = steakCheese * variable;
					input = itemNumber+"  Steak & Cheese    $" + steakCheese+"\n";
					foodTextArea.append(input);
					price = steakCheese;
					System.out.println("Input Value: "+ input + "Price:$"+price);
					totalPrice = totalPrice+price;
					System.out.println("Total Price: $"+totalPrice);
					String subSentence= "Subtotal:    $"+totalPrice;
					subTotalArea.setText(subSentence);

				}

				clicked_5++;


			}
		});
		btnSteakCheese.setBounds(159, 49, 143, 191);
		lunchPanel.add(btnSteakCheese);

		JButton btnBurger = new JButton("Burger");
		btnBurger.setBackground(new Color(152, 251, 152));
		btnBurger.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				if(clicked_6==0)
				{
					NumberPad numberPad = new NumberPad();
					numberPad.setVisible(true);
				}
				if(clicked_6>0){
					burger = burger * variable;
					input = itemNumber+"  Burger    $" + burger+"\n";
					foodTextArea.append(input);
					price = burger;
					System.out.println("Input Value: "+ input + "Price:$"+price);
					totalPrice = totalPrice+price;
					System.out.println("Total Price: $"+totalPrice);
					String subSentence= "Subtotal:    $"+totalPrice;
					subTotalArea.setText(subSentence);

				}

				clicked_6++;


			}
		});
		btnBurger.setBounds(317, 49, 139, 191);
		lunchPanel.add(btnBurger);

		JButton lunchBackButton = new JButton("Back");
		lunchBackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				lunchPanel.setVisible(false);
				mainPanel.setVisible(true);
			}
		});
		lunchBackButton.setBounds(48, 608, 115, 29);
		lunchPanel.add(lunchBackButton);

		JButton dinnerBackButton = new JButton("Back");
		dinnerBackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				dinnerPanel.setVisible(false);
				mainPanel.setVisible(true);
			}
		});
		dinnerBackButton.setBounds(48, 608, 115, 29);
		dinnerPanel.add(dinnerBackButton);

		JButton drinksBackButton = new JButton("Back");
		drinksBackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				drinksPanel.setVisible(false);
				mainPanel.setVisible(true);
			}
		});
		drinksBackButton.setBounds(48, 608, 115, 29);
		drinksPanel.add(drinksBackButton);

		//CLEARS UP ALL CLICKS AND FOODTEXT AREA AND PRICES
		JButton btnClear = new JButton("Clear");
		btnClear.setBackground(new Color(152, 251, 152));
		btnClear.addActionListener(new ActionListener()
		{

			public void actionPerformed(ActionEvent e) {
				foodTextArea.setText("");
				subTotalArea.setText("");
				buffaloWings = 5.25;
				spicyWings = 6.25;
				frenchFries = 3.75;
				chickenWrap = 7.55;
				steakCheese = 9.25;
				burger = 8.75;
				steak = 11.90;
				spaghetti = 10.35;
				chickenBreast = 9.70;
				water = 1.50;
				coke = 2.00;
				variable = 1;
				itemNumber="1";
				price = 0;
				totalPrice=0;
				creditClicked=0;
				clicked=0;
				clicked_1=0;
				clicked_2=0;
				clicked_3=0;
				clicked=4;
				clicked_5=0;
				clicked_6=0;
				clicked_7=0;
				clicked_8=0;
				clicked_9=0;

			}
		});
		btnClear.setBounds(167, 9, 115, 29);
		recieptPanel.add(btnClear);

		//GOES TO CREDIT PAGE
		JButton btnNewButton_1 = new JButton("Credit");
		btnNewButton_1.setBackground(new Color(240, 255, 240));
		btnNewButton_1.addActionListener(new ActionListener()
		{

			public void actionPerformed(ActionEvent e) {
				if(creditClicked==0)
				{
					CreditCardPage cPage = new CreditCardPage();
					cPage.setVisible(true);
				}
				if(creditClicked>0)
				{
					totalPrice = totalPrice-cashPaid;
					String subSentence= "Total:    $"+totalPrice;
					subTotalArea.setText(subSentence);
				}
				creditClicked++;
			}
		});
		btnNewButton_1.setBounds(15, 560, 115, 29);
		recieptPanel.add(btnNewButton_1);

		//GOES TO CASH PAGE
		JButton btnCash = new JButton("Cash");
		btnCash.setBackground(new Color(240, 255, 240));
		btnCash.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e){
				if(clicked_3==0)
				{
					Cash cash = new Cash();
					cash.setVisible(true);
				}
				if(clicked_3>0)
				{
					totalPrice = totalPrice-cashPaid;
					String subSentence= "Total:    $"+totalPrice;
					subTotalArea.setText(subSentence);
				}
				clicked_3++;
			}
		});
		btnCash.setBounds(167, 560, 115, 29);
		recieptPanel.add(btnCash);

		//GOES TO OTHERS PAGE
		JButton btnOptionws = new JButton("Others");
		btnOptionws.setBackground(new Color(152, 251, 152));
		btnOptionws.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OthersPage others = new OthersPage();
				others.setVisible(true);
			}
		});
		btnOptionws.setBounds(167, 605, 115, 29);
		recieptPanel.add(btnOptionws);


		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(15, 472, 267, 35);
		recieptPanel.add(textArea_1);

		//DISCOUNTS 10%
		JButton btnDiscount = new JButton("Discount 10%");
		btnDiscount.setBackground(new Color(152, 251, 152));
		btnDiscount.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e){
				DecimalFormat df = new DecimalFormat("###.##");
				totalPrice = totalPrice-(totalPrice*.1);
				String subSentence= "Total:    $"+ df.format(totalPrice);
				subTotalArea.setText(subSentence);
			}
		});
		btnDiscount.setBounds(15, 605, 115, 29);
		recieptPanel.add(btnDiscount);


	}
	public void close()
	{
		WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);

	}

}

