/*
 * @author Loryn Davison
 * 
 * The class SetBookSpecificEvent implements ActionListener. It contains a procedure
 * that runs when an action occurs. It adds the url entered by the user to 
 * the bookmarks and refreshes the bookmarks menu.
 * 
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SetBookSpecificEvent extends JDialog implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void actionPerformed(ActionEvent e){
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		try {

			JFrame frame = new JFrame("Add bookmark");
			String url = JOptionPane.showInputDialog(frame, "Enter a URL to add to bookmarks.");
			try{
				URL test = new URL(url);
				Bookmarks.addBookmark(url);
				MenuBar.refreshBookmarks();
			}
			catch(Exception InvalidURLException){
				
					throw new InvalidURLException();
				}

		}
			catch(InvalidURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		
	}
	}

}
