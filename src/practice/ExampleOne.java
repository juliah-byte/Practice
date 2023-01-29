package practice;

public class ExampleOne {

	
	public static void main(String[] args) {
		
		int[] i = {2,7,9,11};
		
	
		
		//int[] j = i;
		
		
		for(int k = 0; k < i.length; k++) {
			
			for(int l = 0; l < i.length; l++ ) {
				
				if(i[k] + i[l] == 9) {
					
					System.out.println(i[k] + " " + i[l]);
					
				}
			}
		}
		
	}
	
}
