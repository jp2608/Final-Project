import javax.swing.*;

import java.awt.*;

public class GridLayoutButtons extends JFrame 
{
	JButton button1 = new JButton("button1"); //set variables
	JButton button2 = new JButton("button2");
	JButton button3 = new JButton("button3");
	JButton button4 = new JButton("button4");
	JButton button5 = new JButton("button5");
	JButton button6 = new JButton("button6");
	JPanel controlPanel = new JPanel();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();

	public GridLayoutButtons() 
	{

		panel1.setLayout(new GridLayout(2,2)); //set layout
		panel2.setLayout(new GridLayout(2,2));

		panel1.add(button1);// adds buttons to panels
		panel1.add(button2);
		panel1.add(button3);

		panel2.add(button4);
		panel2.add(button5);
		panel2.add(button6);

		add(panel1, BorderLayout.SOUTH); //add panels and sets layout
		add(panel2, BorderLayout.CENTER);
		setVisible(true);
		pack();
	}
	public static void main(String[] args) 
	{
		GridLayoutButtons button = new GridLayoutButtons();
		button.setVisible(true);
	}
}
