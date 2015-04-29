import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class Cash extends JFrame{

	private double finalNum = 0;
	private JTextField jText;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				new Cash();         
			}
		});
	}
	//ATTEMPTS TO CHARGE THE PERSON WITH ANY AMOUNT THEY WISH TO PAY

	public Cash() {

		JButton[] numberButtons = new JButton[10];

		for ( int i = 9; i >= 0; i--) {
			numberButtons[i] = new JButton(Integer.toString(i));
		}

		
		jText = new JTextField();
		jText.setPreferredSize(new Dimension(160, 35));
		jText.setBackground(Color.WHITE);
		jText.setEnabled(false);
		jText.setHorizontalAlignment(4);
		jText.setDisabledTextColor(Color.BLACK);


		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(new Color(144, 238, 144));
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

		JPanel textPanel = new JPanel();
		textPanel.setBackground(new Color(144, 238, 144));
		textPanel.setPreferredSize(new Dimension(160, 50));
		textPanel.add(jText);

		JPanel numPanel = new JPanel();
		numPanel.setBackground(new Color(144, 238, 144));
		numPanel.setPreferredSize(new Dimension(160, 100));

		for(int i = 9; i>=0; i--) {
			numPanel.add(numberButtons[i]);
		}
		
		JButton enterButton = new JButton("Enter");
		JButton clearButton = new JButton("Clear");
		

		JPanel controlPanel = new JPanel();
		controlPanel.setBackground(new Color(144, 238, 144));
		controlPanel.setPreferredSize(new Dimension(160, 35));
		controlPanel.add(enterButton);
		controlPanel.add(clearButton);
		
		JButton dot = new JButton(".");
		dot.addActionListener(new ActionListener()
		{				
			private String num=".";
			
			public void actionPerformed(ActionEvent e){ 
			if (!jText.getText().equals("0.0")) 
			{
				jText.setText(jText.getText() + num);

			} 
			else {
				jText.setText("");
				actionPerformed(e);
			}
		
			}
		});
		controlPanel.add(dot);


		numberButtonsAction[] numButtons = new numberButtonsAction[10];
		for ( int i = 0; i < 10; i++ ) {
			numButtons[i] = new numberButtonsAction(numberButtons[i]);
			numberButtons[i].addActionListener(numButtons[i]);
		}

		EnterButton enter = new EnterButton();
		enterButton.addActionListener(enter);

		clearButton clear = new clearButton();
		clearButton.addActionListener(clear);

		mainPanel.add(textPanel);
		mainPanel.add(numPanel);
		mainPanel.add(controlPanel);
		add(mainPanel);

		setSize(180, 290);
		setLocationByPlatform(true);
		setVisible(true);

	}
	
	
	//http://codereview.stackexchange.com/questions/45864/basic-calculator-in-java-with-swing
	//got this code from
	private class numberButtonsAction implements ActionListener {
		private String num;

		public numberButtonsAction(JButton a) {
			this.num = a.getText();
		}
		public void actionPerformed(ActionEvent e) {
			if (!jText.getText().equals("0.0")) 
			{
				jText.setText(jText.getText() + num);

			} 
			else {
				jText.setText("");
				actionPerformed(e);
			}
		}
	}
	private class EnterButton implements ActionListener {
		public void actionPerformed(ActionEvent e) {        
			finalNum = Double.parseDouble(jText.getText());
			FastFoodPage.cashPaid=(finalNum);
			close();
		}
	}
	private class clearButton implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			jText.setText("");
			finalNum = 0;
		}
	}
	public void close()
	{
		WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);

	}
}
