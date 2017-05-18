/*
 * @author Loryn Davison
 * 
 * The BackException class extends the Exceptions class. 
 * It displays a pop-up message to the user to say that there is no previous website data available.
 * 
 */

import javax.swing.JOptionPane;

public class BackException extends Exception {
	public BackException(){
		JOptionPane.showMessageDialog(null, "There is no previous website data to show.", "InfoBox: " + "Back Error", JOptionPane.INFORMATION_MESSAGE);
	}
}

