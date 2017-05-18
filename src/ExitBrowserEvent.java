/*
 * @author Loryn Davison
 * 
 * The ExitBrowserEvent class implements ActionListener and contains
 * one procedure that runs when an event occurs. It closes the system.
 * 
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExitBrowserEvent implements ActionListener {
	public void actionPerformed(ActionEvent e)
    {
        System.exit(0);
    }
}
