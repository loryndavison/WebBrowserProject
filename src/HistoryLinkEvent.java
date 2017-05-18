/*
 * @author Loryn Davison
 * 
 * The HistoryLinkEvent class implements ActionListener.
 * It contains a procedure that runs when an event occurs. It follows the link
 * pressed in the history menu.
 * It also contains a constructor which sets the value of the url. 
 * 
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class HistoryLinkEvent implements ActionListener {

	String url = new String();
	
	public HistoryLinkEvent(String url){
		this.url = url;
	}
	
	public void actionPerformed(ActionEvent e) {
		try{
			try{
				URL test = new URL(url);
				BrowserPane.addGoURL(url);
				BrowserPane.setPage(url);
				History.addHistory(url);
				MenuBar.refreshHistory();
			}
			catch (Exception InvalidURLException) {
				//throws exception is URL is found to be invalid
				throw new InvalidURLException();
			}
		}
		catch(Exception e1){
			
		}
			
	}
}
