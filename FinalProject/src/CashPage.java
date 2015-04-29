import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;


public class CashPage extends JFrame {

	private JPanel contentPane;
	private static JTextField textField;
	private static String input = "";
	public int cash;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CashPage frame = new CashPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CashPage() {
		setBounds(500, 150, 386, 498);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(50, 205, 50));
		panel.setBounds(0, 0, 374, 451);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(52, 82, 184, 26);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblEnterCashAmount = new JLabel("Enter Cash Amount");
		lblEnterCashAmount.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterCashAmount.setBounds(92, 16, 200, 50);
		panel.add(lblEnterCashAmount);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.setBackground(new Color(222, 184, 135));
		btnNewButton.addActionListener(new ActionListener()
		{				
			public void actionPerformed(ActionEvent e) 
			{
				input+=e.getActionCommand();
				textField.setText(input);
				
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
				textField.setText(input);
				cash=2;
				//FastFoodPage.cashber=(input);
				//FastFoodPage.cashPaid=(cash);
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
				textField.setText(input);
				cash=3;
				//FastFoodPage.cashber=(input);
				//FastFoodPage.variable=(cash);
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
				textField.setText(input);
				cash=4;
				//FastFoodPage.cashber=(input);
				//FastFoodPage.variable=(cash);
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
				textField.setText(input);
				cash=5;
				//FastFoodPage.cashber=(input);
				//FastFoodPage.variable=(cash);
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
				textField.setText(input);
				cash=6;
				//FastFoodPage.cashber=(input);
				//FastFoodPage.variable=(cash);
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
				textField.setText(input);
				cash=7;
				//FastFoodPage.cashber=(input);
				//FastFoodPage.variable=(cash);
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
				textField.setText(input);
				cash=8;
				//FastFoodPage.cashber=(input);
				//FastFoodPage.variable=(cash);
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
				textField.setText(input);
				cash=9;
				//FastFoodPage.cashber=(input);
				//FastFoodPage.variable=(cash);
				System.out.println(input);
			}

		});
		button_7.setBounds(232, 267, 90, 69);
		panel.add(button_7);
		
		JButton button_8 = new JButton("0");
		button_8.addActionListener(new ActionListener()
		{				
			public void actionPerformed(ActionEvent e) 
			{
				input+=e.getActionCommand();
				textField.setText(input);
				System.out.println(input);
			}

		});
		button_8.setBounds(142, 336, 90, 69);
		panel.add(button_8);
	
		JButton btnClear = new JButton("Clear");
		btnClear.setBackground(new Color(222, 184, 135));
		btnClear.addActionListener(new ActionListener()
		{

			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				input = "";
			}
		});
		btnClear.setBounds(251, 77, 69, 37);
		panel.add(btnClear);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.setBackground(new Color(222, 184, 135));
		btnEnter.addActionListener((ActionListener) btnEnter);
		{
			class btnEnter implements ActionListener {

			    private String c;

			    public btnEnter(JButton a) {
			        this.c = a.getText();
			    }

			    public void actionPerformed(ActionEvent e) {
			        if (!textField.getText().equals("0.0")) {
			            textField.setText(textField.getText() + c);
			        } else {
			            textField.setText("");
			            actionPerformed(e);
			        }
			    }				
			    //input = "";
				//close();
			}
		}
		btnEnter.setBounds(232, 336, 90, 69);
		panel.add(btnEnter);
		
		JButton btnNewButton_1 = new JButton(".");
		btnNewButton_1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e){
				input+=e.getActionCommand();
				textField.setText(input);
				System.out.println(input);
			}
		});
		btnNewButton_1.setBounds(52, 336, 90, 69);
		panel.add(btnNewButton_1);
		
	}
	public void close()
	{
		WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);

	}
}
