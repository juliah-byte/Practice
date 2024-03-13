package practice;

public class interview {
	
	public static void main (String[] args){
		
		Boolean emptyBoolean;
		
		//int myloop = 10;
		System.out.println("Testing");
		
		/**for(int i = 0; i < myloop; i++) {
			
			System.out.println("Test Passed");
		}**/
		
		//System.out.println(sleepIn(true, true));
		
		emptyBoolean = sleepIn(true, false);
		
		System.out.println(emptyBoolean);
	}
	
	
	public static boolean sleepIn(boolean weekday, boolean vacation) {
		
		
		if (weekday == true && vacation == false) {
			
			return false;
		}
		
		else if (weekday == false && vacation == false) {
			
			return true;
		}
		
		else if (weekday == false && vacation == true) {
			
			return true;
		}
		
		return true;
	}
	
	
	public String makeOutWord() {
		
		return "string";
	}
	
}
