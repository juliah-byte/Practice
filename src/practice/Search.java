package practice;

public class Search {
	
	
	public static void Main(String[] args) {
		
		
		
	}
	
	
	
	public int search(Integer n, Integer[] list) {
		
		int index = -1;
		for(int i = 0; i < list.length; i++) {
			if (list[i].equals(n)) {
				index = i;
				break;
			}
		}
		return index;
	}

}
