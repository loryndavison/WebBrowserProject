/*
 * @author Loryn Davison
 * 
 * The DeleteHistoryEvent class ActionListener implements ActionListener.
 * It contains a procedure that runs when an event occurs. It clears the history and 
 * refreshes the history menu.
 * 
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class DeleteHistoryEvent implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		try{
			
			History.clearHistory();
			MenuBar.refreshHistory();
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
