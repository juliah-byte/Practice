package practice;

import java.util.Scanner;

public class exampleTwo {
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
			
		System.out.println("Enter an input: ");
		
		
		while(scan.hasNext()) {
			
			String input = scan.nextLine();
			
			switch(input){
			
			case "1":{
				System.out.println("Moving Right");
				break;
			}
		
			case "2":{
				System.out.println("Moving Left");
				break;}
			
		case "3":{
				System.out.println("Moving Up");
				break;}
		
		case "4":{ 
				System.out.println("Moving Down");
				break;}
			
		case "q":{
				System.out.println("Exit the program.");
				break;}
		
		default:{
			System.out.println("Try again. Acceptable input: [ 1- Movie right,"
					+ " 2 - Move Left, 3 - Move Up, 4 - Move Down, q- exit program");}
				
		}
		
		}
		
		scan.close();
		
	}

}
