package practice;

public class arrays {
	
	public static void main(String[] args) {
		int [] intArray = new int[3];
		intArray[0] = -5123;
		intArray[1] = 32;
		intArray[2] = 5;
		
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int[] newArr = new int[10];
		
		
		
		/**for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
	
			
			/**for ( int j = 9; j > 0; j--) {
			
				System.out.print(newArr[i] + " ");
			}*/
		
		
		int temp = arr[0];
		
		arr[0] = arr[9];
		arr[9] = temp;
	

		//System.out.println(arr[0]);
		
		//System.out.println(newArr[0] );
		
		for ( int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i] + " ");
		}
		
		
		int[][][] my3dArray = new int[3][3][3];
	
		my3dArray[0][0][0] = 100;
		
		System.out.println(my3dArray[0][0][0]);
	}

}
