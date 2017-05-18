/*
 * @author Loryn Davison
 * 
 * The GoEvent class implements ActionListener.
 * It contains a procedure that runs when an action occurs. 
 * It updates the page to the url entered and updates the history, 
 * and menu history.
 * 
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class GoEvent implements ActionListener {


	public void actionPerformed(ActionEvent e) {
		try {
			String url = new String(ButtonPanel.getURL());
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
			
		}
	}

}
