import java.awt.BorderLayout;

import javax.swing.*;

public class BorderLayoutButtons extends JFrame 
{

	JButton button1 = new JButton("button1"); //set variables
	JButton button2 = new JButton("button2");
	JButton button3 = new JButton("button3");
	JButton button4 = new JButton("button4");
	JButton button5 = new JButton("button5");
	JButton button6 = new JButton("button6");
	JPanel panel1 = new JPanel(); //set panels
	JPanel panel2 = new JPanel();
	JPanel controlPanel = new JPanel();
	
	public BorderLayoutButtons() 
	{
		super("Testing BorderLayoutButtons");
		
		controlPanel.setLayout(new BorderLayout()); //set layout
		
		controlPanel.add(panel1, BorderLayout.SOUTH); //applies layout
		controlPanel.add(panel2, BorderLayout.NORTH);
		
		panel1.add(button1); //set buttons
		panel1.add(button2);
		panel1.add(button3);
		
		panel2.add(button4);
		panel2.add(button5);
		panel2.add(button6);
		
		add(controlPanel); // adds control panel
		setVisible(true);
		pack();
	}
	public static void main(String[] args) 
	{
		BorderLayoutButtons buttons = new BorderLayoutButtons();
		buttons.setVisible(true);
	}
}