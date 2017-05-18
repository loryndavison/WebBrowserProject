/*
 * @author Loryn Davison
 * 
 * The MenuBar class sets up the whole browser. It contains four main menus which 
 * each have submenus.
 * It adds listeners onto the items so that when the user presses a option an event
 * occurs. 
 * 
 */

import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.JSeparator;

public class MenuBar extends JMenuBar{
	
	static JMenu bookmarks = new JMenu("Bookmarks");
	static JMenu history = new JMenu("History");
	public MenuBar(){
		
		//SETTING UP FILE AND CLOSE MENU OPTIONS
		JMenu file = new JMenu("File");
		JMenuItem close = new JMenuItem("Close");
		add(file);
		file.add(close);
		ExitBrowserEvent exitListener = new ExitBrowserEvent();
		close.addActionListener(exitListener);
		
			//SETTING UP HOMEPAGE MENU
		JMenu homePage = new JMenu("HomePage Options");
		add(homePage);
		JMenuItem currentHP = new JMenuItem("Set current page as home page");
		homePage.add(currentHP);
		
		SetHomeCurrentEvent currentListenerHP = new SetHomeCurrentEvent();
		currentHP.addActionListener(currentListenerHP);
		
		JMenuItem specificHP = new JMenuItem("Specify a URL as the homepage");
		homePage.add(specificHP);
		
		SetHomeSpecificEvent specificListenerHP = new SetHomeSpecificEvent();
		specificHP.addActionListener(specificListenerHP);
		
		//SETTING UP BOOKMARKS MENU
		add(bookmarks);
		setBookmarks();
		
		//SETTING UP HISTORY MENU
		add(history);
		setHistory();
	}
	
	public static void refreshHistory(){
		history.removeAll();
		history.revalidate();
		setHistory();
		
	}
	
	public static void setHistory(){
		try {

			ArrayList<String> historyArray = new ArrayList<String>(); 
			historyArray.clear();
			historyArray = History.getHistory();
	
		try{
			for (String url: historyArray){
				history.add(new JMenuItem(url)).addActionListener(new HistoryLinkEvent(url));;
			
			}
			
		}
		catch(Exception FileNotFound){
		}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		history.add(new JSeparator());
		
		JMenuItem deleteHistory = new JMenuItem("Delete History");
		history.add(deleteHistory);
		DeleteHistoryEvent deleteEvent = new DeleteHistoryEvent();
		deleteHistory.addActionListener(deleteEvent);
	}
	
	public static void refreshBookmarks(){
		bookmarks.removeAll();
		bookmarks.revalidate();
		
		setBookmarks();
	}
	
	public static void setBookmarks(){
		

		try {

			ArrayList<String> bookmarksArray = new ArrayList<String>(); 
			bookmarksArray.clear();
			bookmarksArray = Bookmarks.getBookmarks();
		
		try{
			
			for (String url: bookmarksArray){
				
				bookmarks.add(new JMenuItem(url)).addActionListener(new BookmarkLinkEvent(url));;
			
			}
			
		}
		catch(Exception FileNotFound){
		}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		bookmarks.add(new JSeparator());
		
		JMenuItem currentBM = new JMenuItem("Set current page as a bookmark");
		bookmarks.add(currentBM);
		SetBookCurrentEvent currentListenerBM = new SetBookCurrentEvent();
		currentBM.addActionListener(currentListenerBM);
		
		JMenuItem specificBM = new JMenuItem("Specify a URL to add to bookmarks");
		bookmarks.add(specificBM);
		SetBookSpecificEvent specificListenerBM = new SetBookSpecificEvent();
		specificBM.addActionListener(specificListenerBM);
		
		
	}
	
    
}