package exercice2;

import java.io.File;
import java.util.Arrays;
import java.util.Date;

public class App {

	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("Usage: java NameOfTheFile ARGUMENT(path)");
		} else {
			PrintAlphabetically(args[0]);
		}

	}
	
	
	static void PrintAlphabetically(String path) {
		// First i list and sort the Files
		
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
					System.out.println(files[i].getName() + "  IT'S A FILE --> F" 
														  +	" Last modified: " + date);
				
				} else if(files[i].isDirectory()) {
					System.out.println(files[i].getName() + "  IT'S A DIRECTORY --> D" 
														  +	" Last modified: " + date);
					
				}
			}
		}
	
	}

}
