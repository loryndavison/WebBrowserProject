/*
 * @author Loryn Davison
 * 
 * The ForwardButton class extends JButton. It contains a ForwardEvent that listens
 * for the button being pressed. 
 * The constructor adds the actionListener and sets the text for the button.
 * 
 */
import javax.swing.JButton;


public class ForwardButton extends JButton{

	
	ForwardEvent listener = new ForwardEvent();
	
	public ForwardButton(String text){
		this.setText(text);
		addActionListener(listener);
	}
	
}