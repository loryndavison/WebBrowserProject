/*
 * @author Loryn Davison
 * 
 * The ActivatedHyperlinkListener class implements HyperlinkListener.
 * It contains a constructor which sets the listener to the pane passed as a parameter.
 * It updates the pane to URL that the hyperlink points to.
 *  
 *  I added a comment
 */

import java.io.IOException;
import javax.swing.*;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import javax.swing.text.Document;

public class ActivatedHyperlinkListener implements HyperlinkListener {
		  JEditorPane mainPane;
		  
		  public ActivatedHyperlinkListener(JEditorPane editorPane) {
			    this.mainPane = editorPane;
			    }

		  //UPDATES THE PAGE  WITH THE URL THAT THE LINK POINTS TO
		  public void hyperlinkUpdate(HyperlinkEvent event) {
			
			try {
				BrowserPane.addGoURL(event.getURL().toString());
		        BrowserPane.setPage(event.getURL().toString());
		        
			} catch (IOException ioException) {
		        System.out.println("Error following link, Invalid link");
		        
		     } catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		   
	}

