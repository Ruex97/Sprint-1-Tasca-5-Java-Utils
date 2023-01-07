package exercice5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class App {

	public static void main(String[] args) {
		Dog dog1 = new Dog("Brown", 5);
		
		if (args.length < 1) {
			System.out.println("Usage: java NameOfTheFile ARGUMENT(path)");
		} else {
			serializeObject(args[0], dog1);
			
			deserializeObject(args[0]);
		}

		

	}
	
	
	static void serializeObject(String path, Dog dog1) {
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(path);
			ObjectOutputStream serializer = new ObjectOutputStream(fileOutputStream);
			
			serializer.writeObject(dog1);
			serializer.close();
			 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}
	
	static void deserializeObject(String path) {
		
		try {
			FileInputStream fileInputStream = new FileInputStream(path);
			ObjectInputStream deserializer = new ObjectInputStream(fileInputStream);
			
			Dog dog1 = (Dog) deserializer.readObject();
			System.out.println(dog1.toString());
			
			
			deserializer.close();
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
}


