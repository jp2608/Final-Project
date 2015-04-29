import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class MainMenu extends JFrame 
{
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MainMenu() 
	{
		setBounds(500, 150, 491, 706);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(100, 149, 237));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(176, 224, 230));
		panel.setBounds(294, 13, 167, 147);
		contentPane.add(panel);
		
		//DATE
		String date = new SimpleDateFormat("MM/dd/yyyy").format(new Date());
		panel.setLayout(null);
		JLabel lblClock = new JLabel(date);
		lblClock.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblClock.setBounds(12, 22, 136, 36);
		panel.add(lblClock);
		
		//TIME
		String time = new SimpleDateFormat("hh:mm a").format(new Date());
		JLabel lblTime = new JLabel(time);
		lblTime.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblTime.setBounds(12, 83, 136, 48);
		panel.add(lblTime);
		
		
		//FAST FOOD TAKES YOU STRAIGHT TO FOOD MENU
		JButton button = new JButton("FAST FOOD");
		button.setBackground(new Color(224, 255, 255));
		button.addActionListener(new ActionListener()
		{				
			public void actionPerformed(ActionEvent e) 
			{
				FastFoodPage fPage = new FastFoodPage();
				fPage.setVisible(true);
				close();
			}

		});
		button.setBounds(19, 254, 209, 48);
		contentPane.add(button);
		
		JButton button_1 = new JButton("TAKE OUT");
		button_1.setBackground(new Color(224, 255, 255));
		button_1.addActionListener(new ActionListener()
		{				
			public void actionPerformed(ActionEvent e) 
			{
				FastFoodPage fPage = new FastFoodPage();
				fPage.setVisible(true);
				close();
			}

		});
		button_1.setBounds(240, 254, 209, 48);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("DINE IN");
		button_2.setBackground(new Color(224, 255, 255));
		button_2.addActionListener(new ActionListener()
		{				
			public void actionPerformed(ActionEvent e) 
			{
				FastFoodPage fPage = new FastFoodPage();
				fPage.setVisible(true);
				close();
			}

		});
		button_2.setBounds(19, 315, 209, 48);
		contentPane.add(button_2);
		
		//CLOSES ENTIRE PROGRAM
		JButton button_6 = new JButton("TURN OFF PROGRAM");
		button_6.setBackground(new Color(224, 255, 255));
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				System.exit(0);
			}
		});
		
		button_6.setBounds(130, 400, 209, 48);
		contentPane.add(button_6);
		
		//GOES BACK TO LOGIN PAGE
		JButton button_7 = new JButton("LOG OUT");
		button_7.setBackground(new Color(224, 255, 255));
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				LoginPage logPage = new LoginPage();
				logPage.setVisible(true);
				close();
			}
		});
		button_7.setBounds(240, 315, 209, 48);
		contentPane.add(button_7);
	
	}
	public void close()
	{
		WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);

	}
}