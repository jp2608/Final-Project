import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;


public class OthersPage extends JFrame {

	private JPanel contentPane;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OthersPage frame = new OthersPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public OthersPage() {
		setBounds(500, 150, 313, 285);
		setTitle("Others");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 128));
		panel.setBounds(0, 0, 291, 238);
		contentPane.add(panel);
		panel.setLayout(null);


		JButton btnMainMenu = new JButton("Main Menu");
		btnMainMenu.setBackground(new Color(238, 232, 170));
		btnMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenu mPage = new MainMenu();
				mPage.setVisible(true);
				close();
			}
		});
		btnMainMenu.setBounds(85, 36, 130, 52);
		panel.add(btnMainMenu);

		JButton btnPrint = new JButton("Print Receipt");
		btnPrint.setBackground(new Color(238, 232, 170));
		btnPrint.addActionListener(new ActionListener(){

		public void actionPerformed(ActionEvent e)
		{
			JOptionPane.showMessageDialog(null, "Receipt Printed!");
			
		}
	});
	


	btnPrint.setBounds(85, 100, 130, 52);
	panel.add(btnPrint);

	JButton exitButton = new JButton("Exit");
	exitButton.setBackground(new Color(238, 232, 170));
	exitButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			close();
		}
	});
	exitButton.setBounds(85, 165, 130, 52);
	panel.add(exitButton);
}
public void close()
{
	WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
	Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);

}
}
