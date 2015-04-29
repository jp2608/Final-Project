import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JSplitPane;

import java.awt.SystemColor;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import java.awt.Button;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Toolkit;

import javax.swing.JSlider;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JTextPane;


public class NumberPad extends JFrame { 

	private JPanel contentPane;
	private static String input = "";
	private JPanel panel;
	public int itemNum;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NumberPad numberPad = new NumberPad();
					numberPad.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	//THE NUMBER PAD FOR THE AMOUNT OF FOOD TO BE ADDED TO THE RECEIPT TEXT AREA
	public NumberPad() {
		setTitle("Number Page");
		setBounds(500, 150, 436, 599);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(UIManager.getColor("Button.darkShadow"));
		panel.setForeground(new Color(0, 0, 0));
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(15, 16, 384, 499);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("Enter Number of Items");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setBounds(0, 37, 379, 20);
		panel.add(label);

		JTextField jField = new JTextField();
		jField.setBounds(95, 86, 187, 34);
		panel.add(jField);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.setBackground(new Color(222, 184, 135));
		btnNewButton.addActionListener(new ActionListener()
		{				
			public void actionPerformed(ActionEvent e) 
			{
				input+=e.getActionCommand();
				jField.setText(input);
				itemNum=1;
				FastFoodPage.itemNumber=(input);
				FastFoodPage.variable=(itemNum);
				System.out.println(input);
			}

		});
		btnNewButton.setBounds(52, 136, 90, 69);
		panel.add(btnNewButton);
		
		JButton button = new JButton("2");
		button.setBackground(new Color(222, 184, 135));
		button.addActionListener(new ActionListener()
		{				
			public void actionPerformed(ActionEvent e) 
			{
				input+=e.getActionCommand();
				jField.setText(input);
				itemNum=2;
				FastFoodPage.itemNumber=(input);
				FastFoodPage.variable=(itemNum);
				System.out.println(input);
			}

		});
		button.setBounds(142, 136, 90, 69);
		panel.add(button);
		
		JButton button_1 = new JButton("3");
		button_1.setBackground(new Color(222, 184, 135));
		button_1.addActionListener(new ActionListener()
		{				
			public void actionPerformed(ActionEvent e) 
			{
				input+=e.getActionCommand();
				jField.setText(input);
				itemNum=3;
				FastFoodPage.itemNumber=(input);
				FastFoodPage.variable=(itemNum);
				System.out.println(input);
			}

		});
		button_1.setBounds(232, 136, 90, 69);
		panel.add(button_1);
		
		JButton button_2 = new JButton("4");
		button_2.setBackground(new Color(222, 184, 135));
		button_2.addActionListener(new ActionListener()
		{				
			public void actionPerformed(ActionEvent e) 
			{
				input+=e.getActionCommand();
				jField.setText(input);
				itemNum=4;
				FastFoodPage.itemNumber=(input);
				FastFoodPage.variable=(itemNum);
				System.out.println(input);
			}

		});
		button_2.setBounds(52, 198, 90, 69);
		panel.add(button_2);
		
		JButton button_3 = new JButton("5");
		button_3.setBackground(new Color(222, 184, 135));
		button_3.addActionListener(new ActionListener()
		{				
			public void actionPerformed(ActionEvent e) 
			{
				input+=e.getActionCommand();
				jField.setText(input);
				itemNum=5;
				FastFoodPage.itemNumber=(input);
				FastFoodPage.variable=(itemNum);
				System.out.println(input);
			}

		});
		button_3.setBounds(142, 198, 90, 69);
		panel.add(button_3);
		
		JButton button_4 = new JButton("6");
		button_4.setBackground(new Color(222, 184, 135));
		button_4.addActionListener(new ActionListener()
		{				
			public void actionPerformed(ActionEvent e) 
			{
				input+=e.getActionCommand();
				jField.setText(input);
				itemNum=6;
				FastFoodPage.itemNumber=(input);
				FastFoodPage.variable=(itemNum);
				System.out.println(input);
			}

		});
		button_4.setBounds(232, 198, 90, 69);
		panel.add(button_4);
		
		JButton button_5 = new JButton("7");
		button_5.setBackground(new Color(222, 184, 135));
		button_5.addActionListener(new ActionListener()
		{				
			public void actionPerformed(ActionEvent e) 
			{
				input+=e.getActionCommand();
				jField.setText(input);
				itemNum=7;
				FastFoodPage.itemNumber=(input);
				FastFoodPage.variable=(itemNum);
				System.out.println(input);
			}

		});
		button_5.setBounds(52, 267, 90, 69);
		panel.add(button_5);
		
		JButton button_6 = new JButton("8");
		button_6.setBackground(new Color(222, 184, 135));
		button_6.addActionListener(new ActionListener()
		{				
			public void actionPerformed(ActionEvent e) 
			{
				input+=e.getActionCommand();
				jField.setText(input);
				itemNum=8;
				FastFoodPage.itemNumber=(input);
				FastFoodPage.variable=(itemNum);
				System.out.println(input);
			}

		});
		button_6.setBounds(142, 267, 90, 69);
		panel.add(button_6);
		
		JButton button_7 = new JButton("9");
		button_7.setBackground(new Color(222, 184, 135));
		button_7.addActionListener(new ActionListener()
		{				
			public void actionPerformed(ActionEvent e) 
			{
				input+=e.getActionCommand();
				jField.setText(input);
				itemNum=9;
				FastFoodPage.itemNumber=(input);
				FastFoodPage.variable=(itemNum);
				System.out.println(input);
			}

		});
		button_7.setBounds(232, 267, 90, 69);
		panel.add(button_7);
	
		JButton btnClear = new JButton("Clear");
		btnClear.setBackground(new Color(222, 184, 135));
		btnClear.addActionListener(new ActionListener()
		{

			public void actionPerformed(ActionEvent e) {
				jField.setText("");
				input = "";
			}
		});
		btnClear.setBounds(52, 336, 90, 69);
		panel.add(btnClear);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.setBackground(new Color(222, 184, 135));
		btnEnter.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e){
				jField.setText("");
				input = "";
				close();
			}
		});
		btnEnter.setBounds(232, 336, 90, 69);
		panel.add(btnEnter);
	}
	public void close()
	{
		WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);

	}
}
