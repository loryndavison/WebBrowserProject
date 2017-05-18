/*
 * @author Loryn Davison
 * 
 * The class ReloadEvent implements ActionListener. It contains a procedure
 * that runs when an action occurs. It refreshes the current page.
 * 
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReloadEvent implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		try {
			String url = new String(ButtonPanel.getURL());
			
			BrowserPane.setPage(url);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
}
