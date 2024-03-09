package practice;

import java.util.Scanner;

public class PracticeOne {
	
	public static void  main(String[] args) {
		
		
		Integer [] myList = new Integer[] {1,2,25,3,4,11};
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
		
		reverse("Brass");
		
		maximum(myList);
		
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
	
	
	public static void reverse(String S) {
		
		String myString = " ";
		
		for(int i = 0; i < S.length(); i++) {
			
			myString += S.charAt(S.length() - i - 1);
			
		}
		
		System.out.println(myString);
		System.out.println("Test this again");
	}
	
	
	public static Integer maximum(Integer[] list) {
		
		Integer max = 0;
		
		for(int i = 0; i < list.length; i++) {
			
			if(list[i] > max) {
				max = list[i];
			}
		}
		
		System.out.println(max);
		return max;
		
	}
	
	
	public static String convertToUppercase(String thing) {
		
		return thing.toUpperCase();
		
	}
}
		
		
	

		




