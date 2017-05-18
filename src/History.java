/*
 * @author Loryn Davison
 * 
 * The History class contains a static ArrayList of type String which contains the 
 * history that have been read from the history text file.
 * It contains a procedure called addHistory which adds new history to the text file 
 * and a function called getHistory() which returns the ArrayList as well clearHistory()
 * which clears the history. 
 * 
 */
import java.io.File;
import java.io.FileNotFoundException;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;

import java.util.Scanner;



public class History {
	private static ArrayList<String> history = new ArrayList<String>();
	static File historyFile = new File("src/History.txt");
	
	public History() throws IOException{
		
	}
	
	public static void addHistory(String url) throws IOException{
		FileWriter write = new FileWriter( historyFile , true);
		BufferedWriter bWrite = new BufferedWriter( write );
		bWrite.newLine();
		bWrite.write(url);
		bWrite.close();
	}
	
	public static ArrayList<String> getHistory() throws FileNotFoundException{
		history.clear();
		Scanner scanner = new Scanner(historyFile);
		while (scanner.hasNext()){
			String url = scanner.next();
			history.add(url);
			
		}
		scanner.close();

		return history;
	}
	
	public static void clearHistory() throws IOException{
		
		BrowserPane.clearWebPages();
		FileWriter writer = new FileWriter(historyFile,false);
		writer.write("");
		writer.close();
	}
	
}
