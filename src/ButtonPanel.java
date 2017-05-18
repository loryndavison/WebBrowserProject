/*
 * @author Loryn Davison
 * 
 * The ButtonPanel class contains five buttons: back, forward, go, home and refresh.
 * It also contains the procedures for adding each of these buttons as well.
 * It also has a function for retrieving the homepgae and a procedure for setting the homepage
 *  and the same for setting and getting the url.
 * 
 * 
 * 
 */
import javax.swing.*;
import java.util.Stack;



public class ButtonPanel extends JPanel{

	
	private static BackButton backButton = new BackButton("<BACK");
	private static  ForwardButton forwardButton = new ForwardButton(">FORWARD");
	private  static GoButton goButton = new GoButton("GO");
	private static TextField urlField = new TextField();;
	private static HomeButton homeButton = new HomeButton("HOME");
	private static  String homePage;
	private static ReloadButton reloadButton = new ReloadButton("RELOAD");
	
	
	public ButtonPanel(){
		addBackButton();
		addForwardButton();
		addURLField();
		addGoButton();
		addHomeButton();
		addReloadButton();
	}
	
	
	public void addBackButton(){
		backButton.setEnabled(true);
		add(backButton);
	}
	
	public void addForwardButton(){
		forwardButton.setEnabled(true);
		add(forwardButton);
	}
	
	public void addURLField(){
		urlField.setEnabled(true);
		add(urlField);
	}
	
	public void addGoButton(){
		goButton.setEnabled(true);
		add(goButton);
	}
	
	public static  String getURL(){
		return urlField.getText();
	}
	
	/**
	 * @param text
	 */
	public static void setURLText(String text){
		urlField.setText(text);
	}
	
	public void addHomeButton(){
		homeButton.setEnabled(true);
		add(homeButton);
	}
	
	public void addReloadButton(){
		reloadButton.setEnabled(true);
		add(reloadButton);
	}
	public static  void setHomePage(String URL){
		homePage = URL;
	}
	
	public static  String getHomePage(){
		return homePage;
	}
	
	
	
}
