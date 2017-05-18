/*
 * @author Loryn Davison
 * 
 * The ForwardException class extends Exception.
 * The constructor displays a message to user letting them know there are no future 
 * pages to display.
 * 
 */
import javax.swing.JOptionPane;

public class ForwardException extends Exception {
	public ForwardException(){
		JOptionPane.showMessageDialog(null, "There are no future pages to show.", "InfoBox: " + "Forward Error", JOptionPane.INFORMATION_MESSAGE);
	}
}
