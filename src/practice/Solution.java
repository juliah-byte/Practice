package practice;

public class Solution {
	
	public static void main(String args[]) {
		
		int[] myArray = new int[] {1,1,1,1,1};
		Solution myObject = new Solution();
		
		myObject.runningSum(myArray);
	}
	
	
	
    public int[] runningSum(int[] nums) {
        
       
    	//int run = 0;

        //for(int i = 0; i < nums.length; i++ ){
        //    run = i;
        //    while(run >= 1){
        //        nums[i] += run;
        //        run--;     
        //    }

            //return System.out.println(nums[i]);
        //}
    	for(int i=1; i < nums.length; i++) {
    		nums[i] = nums[i] + nums[i-1];
    	}
    	//System.out.println(nums[i]);
        return nums;
    }


}
