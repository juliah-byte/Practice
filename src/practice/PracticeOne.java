package practice;

import java.util.Scanner;

public class PracticeOne {
	
	public static void  main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter a line and hit enter.");
		String line = scanner.nextLine();
		
		int count = 0;
		
		for(int i = 0; i< line.length(); i++) {
			char letter = line.charAt(i);
			if(isVowel(letter)) {
				count++;
			}
		}
		
		System.out.println("The number of vowels: " + count);
		
		scanner.close();
		
	
	}
	
	public static boolean isVowel(char letter) {
		if(letter == 'A' || letter == 'a' || letter=='E' || letter == 'e' 
				|| letter == 'i' || letter == 'I' || letter == 'o' 
				|| letter == 'O' || letter == 'u' || letter == 'U') {
			return true;
		}
		
		return false;
	}
}
		
		
	

		




