import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ATM extends JFrame 
{
	private JPasswordField passwordBox;
	private String input = "";
	public ATM()
	{
		JPanel displayPanel = new JPanel();
		displayPanel.setBackground(Color.CYAN);
		displayPanel.setLayout(new BorderLayout());

		JPanel pinpadPanel = new JPanel();
		pinpadPanel.setBackground(Color.GRAY);
		pinpadPanel.setLayout(new GridLayout(4,3));

		for(int i=0; i<9; i++)
		{
			JButton [] numberB = new JButton[10];
			numberB[i] = new JButton(String.valueOf(i+1));
			numberB[i].addActionListener(new ActionListener()
			{				
				public void actionPerformed(ActionEvent e) 
				{
					input+=e.getActionCommand();
					passwordBox.setText(input);
					System.out.println(input);
				}

			});
			pinpadPanel.add(numberB[i]);
		}

		JButton enterButton, clearButton, zero;
		clearButton = new JButton("Clear");
		clearButton.addActionListener(new ClearListener());
		pinpadPanel.add(clearButton);

		zero = new JButton("0");
		zero.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				input+=e.getActionCommand();
				passwordBox.setText(input);
				System.out.println(input);
			}

		});
		pinpadPanel.add(zero);

		enterButton = new JButton("Enter");
		enterButton.addActionListener(new EnterListener());
		pinpadPanel.add(enterButton);


		passwordBox = new JPasswordField();
		passwordBox.setFont(new Font("Times New Roman", Font.BOLD, 14));
		displayPanel.add(passwordBox, BorderLayout.NORTH);
		displayPanel.add(pinpadPanel, BorderLayout.CENTER);
		add(displayPanel);
		setVisible(true);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	class ClearListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			passwordBox.setText("");
			input = "";
		}

	}
	class EnterListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(Authentication.pinAuthentication(input))
			{
				JOptionPane.showMessageDialog(null, "Welcome Back!");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Wrong PIN!");
			}
		}

	}
}