import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.event.DocumentListener;
import javax.swing.text.JTextComponent;

import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;


public class CreditCardPage extends JFrame{
	public static JTextField textField;
	public String input;
	public int click;


	public static void main(String []args){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreditCardPage frame = new CreditCardPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	//ATTEMPTS TO CHARGE THE PERSON AND THEIR CREDIT CARD WITH THE AMOUNT THEY WANT
	public CreditCardPage() {
		setBounds(500, 150, 611, 400);
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 230, 140));
		panel.setBounds(15, 16, 567, 328);
		getContentPane().add(panel);
		panel.setLayout(null);

		textField = new JTextField("");
		textField.setBounds(68, 114, 435, 62);
		panel.add(textField);
		textField.setColumns(10);

		JLabel swipeLabel = new JLabel("Please Swipe the Card...");
		swipeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		swipeLabel.setBounds(68, 40, 435, 33);
		panel.add(swipeLabel);

		JButton btnClear = new JButton("CLEAR");

		btnClear.addActionListener(new ActionListener()
		{

			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				click=0;
			}
		});
		btnClear.setForeground(new Color(0, 0, 0));
		btnClear.setBackground(new Color(222, 184, 135));
		btnClear.setBounds(68, 181, 435, 55);
		panel.add(btnClear);

		JButton enterButton = new JButton("ENTER");
		enterButton.setBackground(new Color(222, 184, 135));
		enterButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				//price will be paid once a credit card has been swiped
				if(click==0)
				{
					textField.setText("3245-9876-4560-6593");
				}
				if(click>0)
				{
					Cash cash = new Cash();
					cash.setVisible(true);
					close();
				}
				click++;
			}
		});
		enterButton.setBounds(68, 238, 435, 60);
		panel.add(enterButton);
	}
	public void close()
	{
		WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);

	}

}
