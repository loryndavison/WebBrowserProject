/*
 * @author Loryn Davison
 * 
 * The class ForwardEvent implements ActionListener. It contains a procedure
 * that runs when an action occurs. It retrieves the future url visited,
 * updates the url, history and refreshes the history menu.
 * 
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class ForwardEvent implements ActionListener {
	
	public void actionPerformed(ActionEvent e) {
		try {
			String newURL = new String(BrowserPane.getNextURL());
			if(!newURL.equals("error")){
				try{
					URL test = new URL(newURL);
					BrowserPane.setPage(newURL);
					History.addHistory(newURL);
					MenuBar.refreshHistory();
				}
				catch (Exception InvalidURLException) {
					throw new InvalidURLException();
				}	
			}
			else{
				throw new ForwardException();
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			
		}
	}
}
