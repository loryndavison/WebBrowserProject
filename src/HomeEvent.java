/*
 * @author Loryn Davison
 * 
 * The HomeEvent class implements ActionListener. 
 * It contains a procedure called actionPerformed which runs when an action occurs.
 * This checks for the homepage and then updates the main browser pane
 * to display this.
 * 
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class HomeEvent implements ActionListener {
	
	public void actionPerformed(ActionEvent e) {
		try {
			String url = new String(ButtonPanel.getHomePage());
			try{
				URL test = new URL(url);
				BrowserPane.addGoURL(url);
				BrowserPane.setPage(url);
				History.addHistory(url);
				MenuBar.refreshHistory();
			}
			catch (Exception InvalidURLException) {
				throw new InvalidURLException();
			}
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
}
