/*
 * @author Loryn Davison
 * 
 * The class SetHomeSpecificEvent implements ActionListener. It contains a procedure
 * that runs when an action occurs. It adds the url of the current page displayed to 
 * the Homepage and refreshes the homepage menu.
 * 
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.net.URL;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.sun.glass.events.WindowEvent;

public class SetHomeSpecificEvent extends JDialog implements ActionListener {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void actionPerformed(ActionEvent e) {
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		try {
			
			JFrame frame = new JFrame("Set HomePage");
			String url = JOptionPane.showInputDialog(frame, "Enter a URL to set a homepage.");
			try{
				URL test = new URL(url);
				ButtonPanel.setHomePage(url);
		}
		catch(Exception InvalidURLException){
			throw new InvalidURLException();

		}
			
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
