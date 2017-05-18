/*
 * @author Loryn Davison
 * 
 * The class SetBookCurrentEvent implements ActionListener. It contains a procedure
 * that runs when an action occurs. It adds the url of the current page displayed to 
 * the bookmarks and refreshes the bookmarks menu.
 * 
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class SetBookCurrentEvent implements ActionListener {

	
	public void actionPerformed(ActionEvent e) {
		
		String url = BrowserPane.getPage();
		try{
			URL test = new URL(url);
			Bookmarks.addBookmark(url);
			MenuBar.refreshBookmarks();
		}
		catch(Exception InvalidURLException){
			try {
				throw new InvalidURLException();
			} catch (InvalidURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}
	}
}

