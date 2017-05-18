/*
 * @author Loryn Davison
 * 
 * The HomeButton class extends JButton. It contains a HomeEvent that listens
 * for the button being pressed. 
 * The constructor adds the actionListener and sets the text for the button.
 * 
 */
import javax.swing.JButton;

public class HomeButton extends JButton{

	HomeEvent listener = new HomeEvent();
	
	public HomeButton(String text){
		setText(text);
		addActionListener(listener);
	}
	
	
}
