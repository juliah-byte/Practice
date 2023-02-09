package practice;

public class OverloadedMethods {
	
	public static void main(String[] args) {
		
		print();
		print(6);
		print("Motto");
	}
	
	
	public static void print() {
		System.out.println("Original print method");
		
	}
	
	public static void print(int num) {
		
		System.out.println("Here is your number: " + num);
	}
	
	public static void print(String name) {
		
		System.out.println("Hello " + name);
	}

}
