/*
 * @author Loryn Davison
 * 
 * The GoButton class extends JButton. It contains a GoEvent that listens
 * for the button being pressed. 
 * The constructor adds the actionListener and sets the text for the button.
 * 
 */
import javax.swing.JButton;



public class GoButton extends JButton{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	GoEvent listener = new GoEvent();
	
	public GoButton(String text){
		setText(text);
		addActionListener(listener);
			

	

	}
	
	
}
