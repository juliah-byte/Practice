package practice;

public class BubbleSort {
	
	
	public static void main(String[] args) {
		int[] unsorted = {5, 3, 3, 7, 7, 8 ,10, 2};
		
		
		//unsorted = sort(unsorted);
		
		unsorted = moveZeros(unsorted);
		
		for(int i = 0; i < unsorted.length; i++) {
			
			System.out.println(unsorted[i]);
		}

	}	




	public static int[] sort(int[] arr) {
		
		
		
		for(int i = 1; i < arr.length; i++) {
			
			int temp;
			
			if(arr[i-1] < arr[i]) {
				
				temp = arr[i-1];
				
				arr[i] = temp;
				
			}
		}
	return arr;
	
	}
	
	
	public static int[] moveZeros(int[] unsorted) {
		
		
		for(int i = 1; i < unsorted.length; i++) {
			
			int temp;
			
			if(unsorted[i-1] > unsorted[i]) {
				
				temp = unsorted[i-1];
				
				unsorted[i] = temp;
				
			}
			
		}
		
		return unsorted;
	}
	
}