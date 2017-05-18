/*
 * @author Loryn Davison
 * 
 * The Bookmarks class contains a static ArrayList of type String which contains the 
 * bookmarks that have been read from the bookmarks text file.
 * It contains a procedure called addBookmark which adds new bookmarks to the text file 
 * and a function called getBookmarks() which returns the ArrayList. 
 * 
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



public class Bookmarks {
	private static ArrayList<String> bookmarks = new ArrayList<String>();
	static File bookmarksFile = new File("src/Bookmarks.txt");
	
	public Bookmarks() throws IOException{
		
	}
	
	public static void addBookmark(String url) throws IOException{
		FileWriter write = new FileWriter( bookmarksFile , true);
		BufferedWriter bWrite = new BufferedWriter( write );
		bWrite.write(url);
		bWrite.close();
	}
	
	public static ArrayList<String> getBookmarks() throws FileNotFoundException{
		bookmarks.clear();
		Scanner scanner = new Scanner(bookmarksFile);
		while (scanner.hasNext()){
			String url = scanner.next();
			bookmarks.add(url);
			
			
		}
		scanner.close();
		return bookmarks;
	}
}
