/*
 * @author Loryn Davison
 * 
 * The BrowserPane class sets up the whole browser. It contains a 
 * JEditorPane, a JScrollPane, a MenuBar object and a buttonPanel object.
 * It contains the configure text file which sets what page the browser opens at. 
 * It also contains a set of procedures and functions which deal with the forward and 
 * backwards navigation between webpages visited.
 * 
 */

import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.event.HyperlinkListener;
import java.net.URL;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;

 
public class BrowserPane {
	
	static JEditorPane mainPane = new JEditorPane();
	static JScrollPane scrollPane = new JScrollPane(mainPane);
	static  MenuBar menuBar = new MenuBar();
	static ButtonPanel buttonPanel = new ButtonPanel();
	
	
	File file = new File("src/configure.txt");
	FileReader reader = new FileReader(file);
	BufferedReader bReader = new BufferedReader(reader);
	String url = bReader.readLine();
	
	
	//CONSTRUCTOR - sets up browser window and sets first webpage
	public  BrowserPane() throws Exception{
		
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		mainPane.setEditable(false);
		//sets url for the page
		try{
			URL test = new URL(url);
			addGoURL(url);
			setPage(url);
		}
		catch (Exception InvalidURLException) {
			throw new InvalidURLException();
		}

		//Hyperlink Listener which detects when a hyperlink is pressed and loads the URL
		HyperlinkListener listener = new ActivatedHyperlinkListener(mainPane);
		mainPane.addHyperlinkListener(listener);
		
		
		frame.setLayout(new BorderLayout());
        frame.add(buttonPanel, BorderLayout.NORTH);
        frame.setJMenuBar(menuBar);
        frame.add(scrollPane, BorderLayout.CENTER);	
		
		frame.setSize(1200,800);
		frame.setVisible(true);
	}
	
	
	//PROCEDURES AND FUNCTIONS*****************************************************
	//sets webpage to url passed
	public static void setPage(String url) throws Exception{
		
			mainPane.setPage(url);
			ButtonPanel.setURLText(url);
		
	}
	//returns url of webpage currently loaded
	public static String getPage(){
		 return mainPane.getPage().toString();
	}

	//FOLLOWING DEALS WITH FORWARD AND BACKWARDS NAVIGATION
	private static  ArrayList<String> webPages =new ArrayList<String>();
	static int listPosition = 0;
	
	//clears webpages array
	public static void clearWebPages(){
		webPages.clear();
		
	}
	
	//returns the previous url visited
	public static String getPreviousURL(){
		if(listPosition-1 < 0){
			return "error";
		}
		else{
			listPosition--;
			return webPages.get(listPosition);
		}
	}
	
	//returns the future url visited
	public static String getNextURL(){
		if(listPosition +1 >= webPages.size()){
			return "error";
		}
		else{
			listPosition++;
			return webPages.get(listPosition);
		}
	}
	
	// adds url to list in correct place when loaded through GO button
	public static void addGoURL(String url){
		if(webPages.size()>1){
			for(int i=webPages.size()-1; i>listPosition; i--){
			webPages.remove(i);
			}
				webPages.add(url);
				listPosition ++;
		}
		else{
			
				webPages.add(url);
				listPosition ++;
		}
		
	}

	

	//MAIN ********************************************************************
	 public static void main(String[] args) throws Exception {
		 BrowserPane browser = new BrowserPane();
		 
	 }

	
}
