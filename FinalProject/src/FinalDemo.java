import javax.swing.SwingUtilities;

public class FinalDemo
{
	//main method for the whole final program
	public static void main(String[] args) 
	{
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				final LoginPage GUI = new LoginPage();
				GUI.setVisible(true);
			}

		});
	} 
}