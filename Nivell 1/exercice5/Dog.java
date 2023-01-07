package exercice5;

import java.io.Serializable;

public class Dog implements Serializable{
	private String color;
	private int age;
	
	public Dog(String color, int age) {
		super();
		this.color = color;
		this.age = age;
	}
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Dog Color=" + color + ", Age=" + age;
	}
	
	
	
	
	

}
