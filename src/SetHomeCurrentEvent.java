/*
 * @author Loryn Davison
 * 
 * The class SetHomeCurrentEvent implements ActionListener. It contains a procedure
 * that runs when an action occurs. It adds the url of the current page displayed to 
 * the homepage and refreshes the homepage menu.
 * 
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SetHomeCurrentEvent implements ActionListener {

	
	public void actionPerformed(ActionEvent e) {
		try {
			String url = new String(BrowserPane.getPage());
			ButtonPanel.setHomePage(url);
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
