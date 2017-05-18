/*
 * @author Loryn Davison
 * 
 * The MessageBox class contains a constructor whcih displays a dialog box to the user that
 * contains a message and title.
 * 
 */
import javax.swing.JOptionPane;

public class MessageBox
{
	public MessageBox(String message, String title){
		JOptionPane.showMessageDialog(null, message,  title, JOptionPane.INFORMATION_MESSAGE);
	}
   
}