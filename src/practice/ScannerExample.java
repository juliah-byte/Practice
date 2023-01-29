package practice;


import java.util.Scanner;


public class ScannerExample {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please type in a line and hit Enter.");
		
		//Scanner scan = new Scanner();
		String line = scan.nextLine();
		int count = 0;
		
		/*System.out.println("You typed in the following: " + line);
		
		String numbers = "1 2 3 5 7 9";
		
		scan = new Scanner(numbers);
		
		while(scan.hasNext()) {
			System.out.println(scan.nextInt());
			
		}*/
		
		
		for(int i = 0; i < line.length(); i++) {
			char letter = line.charAt(i);
			if(totalVowels(letter)) {
				count ++;
			}
		}
		
		
		System.out.println("The total numbers of vowels in you input is " + count);
		//scan.close();
		
		
		System.out.print("Enter a number betwen 1 and 4, enter q to quilt ");
		
		String num = scan.nextLine();
		boolean exit = false;
		
		switch(num){
			case "1":
				System.out.println("Moving Right");
				break;
			case "2":
				System.out.println("Moving Left");
				break;
			case "3":
				System.out.println("Moving up");
				break;
			case "4":
				System.out.println("Moving down");
				break;
			case "q":
				System.out.println("Exit program");
				exit = true;
				break;
			default:
				System.out.println("You entered an option that was not included");
		}
		
		
		if(exit) {
			System.out.println("Exiting Program");
		}
				
	}
	
	
	public static boolean totalVowels(char letter) {
			
			if(letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U' || letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
				return true;
			}
			
			return false;
	}
	
	
}