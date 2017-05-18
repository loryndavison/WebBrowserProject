/*
 * @author Loryn Davison
 * 
 * The BookmarkLinkEvent class implements ActionListener.
 * It contains a string to hold a URL, a procedure that sets the URL
 * and also a procedure called actionPerformed that runs on an event occurrence.
 * actionPerformed passes the url to the addGoURL() and setPage() procedures,
 * that are located within the BrowserPane class.
 * 
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class BookmarkLinkEvent implements ActionListener{

	String url = new String();
	
	public BookmarkLinkEvent(String url){
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
