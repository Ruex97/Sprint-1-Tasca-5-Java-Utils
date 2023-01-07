package exercice3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class App {

	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("Usage: java NameOfTheFile ARGUMENT(path)");
		} else {
			TxtCreator(SortDirectoryAlphabetically(args[0]));
		}

	}
	
	
	static ArrayList<String> SortDirectoryAlphabetically(String path) {
		// Initialization of ArrayList
		ArrayList<String> sortedContent = new ArrayList<String>();
		
		// List and sort the Files
		
		File file = new File(path);
		File [] files = file.listFiles();
		Arrays.sort(files);
		
		// Second I create a variable date with last modification time.
		
		long modificationTime = file.lastModified();
		Date date = new Date(modificationTime); 
		

		if (files == null || files.length == 0) {
			System.out.println("Directory is empty");   // Check if directory is empty
		} else {
			for (int i=0; i<files.length; i++) {    // Finally loop through list of Files
				
				if (!files[i].isDirectory()) {
					sortedContent.add(files[i].getName() + "  IT'S A FILE --> F" 
														  +	" Last modified: " + date);
				
				} else if(files[i].isDirectory()) {
					sortedContent.add(files[i].getName() + "  IT'S A DIRECTORY --> D" 
														  +	" Last modified: " + date);
					
				}
			}
		}
		
		return sortedContent;
	
	}
	
	static void TxtCreator(ArrayList<String> sortedContent) {
		String destination = "C:\\Users\\xavir\\eclipse-workspace\\S1.05 Nivell 1\\src\\exercice3";
		
		File file = new File(destination + "\\sortedContent.txt");
		
		try {
			BufferedWriter myBuffer = new BufferedWriter(new FileWriter(file));
			for (String data: sortedContent) {
				myBuffer.write(data + "\n");
			}
			myBuffer.close();
			System.out.println("txt file created succesfully!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}