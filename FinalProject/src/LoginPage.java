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
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;



public class LoginPage extends JFrame { 

	private JPanel contentPane;
	private String input = "";
	private JPanel panel;
	private JPasswordField passwordField;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public LoginPage() {
		setTitle("Login Page");
		setBounds(500, 150, 950, 750);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(new Color(240, 128, 128));
		panel.setForeground(new Color(0, 0, 0));
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(491, 221, 379, 421);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblEnterPassword = new JLabel("Enter Password");
		lblEnterPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEnterPassword.setBounds(109, 37, 159, 20);
		panel.add(lblEnterPassword);
		
		JLabel labelTitle = new JLabel("STATION 1");
		labelTitle.setForeground(Color.WHITE);
		labelTitle.setFont(new Font("Tahoma", Font.BOLD, 40));
		labelTitle.setHorizontalAlignment(SwingConstants.CENTER);
		labelTitle.setBounds(0, 112, 270, 93);
		contentPane.add(labelTitle);
		
		//DATE
		String date = new SimpleDateFormat("MM/dd/yyyy").format(new Date());
		JLabel labelTitle_1 = new JLabel(date);
		labelTitle_1.setForeground(Color.WHITE);
		labelTitle_1.setFont(new Font("Tahoma", Font.BOLD, 35));
		labelTitle_1.setHorizontalAlignment(SwingConstants.CENTER);
		labelTitle_1.setBounds(15, 0, 230, 93);
		contentPane.add(labelTitle_1);
		
		//TIME
		String time = new SimpleDateFormat("h:mm a").format(new Date());
		JLabel lblTime = new JLabel(time);
		lblTime.setForeground(Color.WHITE);
		lblTime.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblTime.setBounds(25,70,210,61);
		contentPane.add(lblTime);
		
		//ANNOUNCEMENT BOX
		JTextPane announcements = new JTextPane();
		announcements.setFont(new Font("Tahoma", Font.BOLD, 25));
		announcements.setBackground(new Color(240, 248, 255));
		announcements.setText("Announcements\r\n\r\nSPECIALS --- Spaghetti\r\nNEW --- Steak and Cheese sandwich\r\nNEW --- Steak\r\n");
		announcements.setBounds(15, 221, 472, 421);
		contentPane.add(announcements);
		
		
		//PASSWORD BOX
		passwordField = new JPasswordField();
		passwordField.setBounds(95, 86, 187, 34);
		panel.add(passwordField);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.setBackground(new Color(250, 250, 210));
		btnNewButton.addActionListener(new ActionListener()
		{				
			public void actionPerformed(ActionEvent e) 
			{
				input+=e.getActionCommand();
				passwordField.setText(input);
				System.out.println(input);
			}

		});
		btnNewButton.setBounds(52, 136, 90, 69);
		panel.add(btnNewButton);
		
		JButton button = new JButton("2");
		button.setBackground(new Color(250, 250, 210));
		button.addActionListener(new ActionListener()
		{				
			public void actionPerformed(ActionEvent e) 
			{
				input+=e.getActionCommand();
				passwordField.setText(input);
				System.out.println(input);
			}

		});
		button.setBounds(142, 136, 90, 69);
		panel.add(button);
		
		JButton button_1 = new JButton("3");
		button_1.setBackground(new Color(250, 250, 210));
		button_1.addActionListener(new ActionListener()
		{				
			public void actionPerformed(ActionEvent e) 
			{
				input+=e.getActionCommand();
				passwordField.setText(input);
				System.out.println(input);
			}

		});
		button_1.setBounds(232, 136, 90, 69);
		panel.add(button_1);
		
		JButton button_2 = new JButton("4");
		button_2.setBackground(new Color(250, 250, 210));
		button_2.addActionListener(new ActionListener()
		{				
			public void actionPerformed(ActionEvent e) 
			{
				input+=e.getActionCommand();
				passwordField.setText(input);
				System.out.println(input);
			}

		});
		button_2.setBounds(52, 198, 90, 69);
		panel.add(button_2);
		
		JButton button_3 = new JButton("5");
		button_3.setBackground(new Color(250, 250, 210));
		button_3.addActionListener(new ActionListener()
		{				
			public void actionPerformed(ActionEvent e) 
			{
				input+=e.getActionCommand();
				passwordField.setText(input);
				System.out.println(input);
			}

		});
		button_3.setBounds(142, 198, 90, 69);
		panel.add(button_3);
		
		JButton button_4 = new JButton("6");
		button_4.setBackground(new Color(250, 250, 210));
		button_4.addActionListener(new ActionListener()
		{				
			public void actionPerformed(ActionEvent e) 
			{
				input+=e.getActionCommand();
				passwordField.setText(input);
				System.out.println(input);
			}

		});
		button_4.setBounds(232, 198, 90, 69);
		panel.add(button_4);
		
		JButton button_5 = new JButton("7");
		button_5.setBackground(new Color(250, 250, 210));
		button_5.addActionListener(new ActionListener()
		{				
			public void actionPerformed(ActionEvent e) 
			{
				input+=e.getActionCommand();
				passwordField.setText(input);
				System.out.println(input);
			}

		});
		button_5.setBounds(52, 267, 90, 69);
		panel.add(button_5);
		
		JButton button_6 = new JButton("8");
		button_6.setBackground(new Color(250, 250, 210));
		button_6.addActionListener(new ActionListener()
		{				
			public void actionPerformed(ActionEvent e) 
			{
				input+=e.getActionCommand();
				passwordField.setText(input);
				System.out.println(input);
			}

		});
		button_6.setBounds(142, 267, 90, 69);
		panel.add(button_6);
		
		JButton button_7 = new JButton("9");
		button_7.setBackground(new Color(250, 250, 210));
		button_7.addActionListener(new ActionListener()
		{				
			public void actionPerformed(ActionEvent e) 
			{
				input+=e.getActionCommand();
				passwordField.setText(input);
				System.out.println(input);
			}

		});
		button_7.setBounds(232, 267, 90, 69);
		panel.add(button_7);
		
		JButton button_8 = new JButton("0");
		button_8.setBackground(new Color(250, 250, 210));
		button_8.addActionListener(new ActionListener()
		{				
			public void actionPerformed(ActionEvent e) 
			{
				input+=e.getActionCommand();
				passwordField.setText(input);
				System.out.println(input);
			}

		});
		button_8.setBounds(142, 336, 90, 69);
		panel.add(button_8);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBackground(new Color(250, 250, 210));
		btnClear.addActionListener(new ActionListener()
		{

			public void actionPerformed(ActionEvent e) {
				passwordField.setText("");
				input = "";
			}
		});
		btnClear.setBounds(52, 336, 90, 69);
		panel.add(btnClear);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.setBackground(new Color(250, 250, 210));
		btnEnter.addActionListener(new EnterListener());
		btnEnter.setBounds(232, 336, 90, 69);
		panel.add(btnEnter);
		
		//LOGO
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\BigBurger_Situational_960x394_Home_Page-Cactus.jpg"));
		lblNewLabel.setBounds(15, 16, 855, 189);
		contentPane.add(lblNewLabel);
	}
	class EnterListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(Authentication.pinAuthentication(input))
			{
				JOptionPane.showMessageDialog(null, "Welcome Back Calvin!");
				MainMenu mainPage =  new MainMenu();
				mainPage.setVisible(true);
				close();
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Wrong PASSWORD!");
			}
		}
}
	public void close()
	{
		WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);

	}
}
