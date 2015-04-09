import java.awt.FlowLayout;

import javax.swing.*;

public class FlowLayoutButtons extends JFrame 
{

	JButton button1 = new JButton("button1"); //set variables
	JButton button2 = new JButton("button2");
	JButton button3 = new JButton("button3");
	JButton button4 = new JButton("button4");
	JButton button5 = new JButton("button5");
	JButton button6 = new JButton("button6");
	JPanel buttonPanel1 = new JPanel();
	JPanel buttonPanel2 = new JPanel();
	JPanel controlPanel = new JPanel();

	public FlowLayoutButtons() {
		super("FlowLayoutButtons"); // add title to panel

		buttonPanel1.add(button1); //adding buttons
		buttonPanel1.add(button2);
		buttonPanel1.add(button3);
		buttonPanel2.add(button4);
		buttonPanel2.add(button5);
		buttonPanel2.add(button6);

		controlPanel.setLayout(new FlowLayout()); //set layout
		setLayout(new FlowLayout());

		controlPanel.add(buttonPanel1); //adds panels
		controlPanel.add(buttonPanel2);

		add(controlPanel);
		setVisible(true);
		pack();
	}
	public static void main(String[] args)
	{
		FlowLayoutButtons buttons = new FlowLayoutButtons();
		buttons.setVisible(true);
	}
}
