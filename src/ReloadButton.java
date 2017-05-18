/*
 * @author Loryn Davison
 * 
 * The ReloadButton class extends JButton. It contains a ReloadEvent that listens
 * for the button being pressed. 
 * The constructor adds the actionListener and sets the text for the button.
 * 
 */
import javax.swing.*;

public class ReloadButton extends JButton{

	ReloadEvent listener = new ReloadEvent();
	
	public ReloadButton(String text){
		this.setText(text);
		addActionListener(listener);
	}
}
