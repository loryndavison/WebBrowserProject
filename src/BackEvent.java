/*
 * @author Loryn Davison
 * 
 * The BackEvent class implements ActionListener. 
 * It contains a procedure called actionPerformed which runs when an action occurs.
 * This checks for the previous URL visited and then updates the main browser pane
 * to display this.
 * 
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class BackEvent implements ActionListener{

	public void actionPerformed(ActionEvent e) {
		try {
		
			String newURL = new String(BrowserPane.getPreviousURL());
			if(!newURL.equals("error")){
				try{
					URL test = new URL(newURL);
					BrowserPane.setPage(newURL);
					History.addHistory(newURL);
					MenuBar.refreshHistory();
				}
				//throws exception is URL is found to be invalid
				catch (Exception InvalidURLException) {
					throw new InvalidURLException();
				}
			}
			else{
				//throws exception if there is no previous website data available
				throw new BackException();
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			
		}
	}
}
