/*
 * @author Loryn Davison
 * 
 * The BackButton class contains a constructor which sets the text on the button 
 * and also an event called BackEvent which implements ActionListener.
 * 
 */

import javax.swing.*;
import java.util.Stack;

public class BackButton extends JButton{

	
	
	BackEvent listener = new BackEvent();
	
	public BackButton(String text){
		this.setText(text);
		addActionListener(listener);
		
	}

	
	
	
}
