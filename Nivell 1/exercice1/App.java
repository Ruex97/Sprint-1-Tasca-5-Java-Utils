package exercice1;

import java.io.File;
import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("Usage: java NameOfTheFile ARGUMENT(path)");
		} else {
			OrderAlphabetically(args[0]);
		}
		

	}
	
	static void OrderAlphabetically(String path) {
		File file = new File(path);
		String [] files = file.list();
		Arrays.sort(files);
		
		if (files == null || files.length == 0) {
			System.out.println("Directory is empty");
		} else {
			for (String data: files) {
				System.out.println(data);
			}
		}
	
	}

}
