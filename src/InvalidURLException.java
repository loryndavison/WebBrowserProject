/*
 * @author Loryn Davison
 * 
 * The BackException class extends the Exceptions class. 
 * It displays a pop-up message to the user to say that the URL is invalid.
 * 
 */

import javax.swing.JOptionPane;

public class InvalidURLException extends Exception {

	public InvalidURLException(){
		JOptionPane.showMessageDialog(null, "The URL is invalid.", " Invalid URL Error", JOptionPane.INFORMATION_MESSAGE);

	}
}
