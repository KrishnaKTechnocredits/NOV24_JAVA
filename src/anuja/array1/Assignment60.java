package anuja.array1;

import java.util.Arrays;

/*return second maximum number from given array.

input = {33,33,19,55,53,11};
output : 53 */
public class Assignment60 {
	
	public int getSecondMaxNumFromArray(int[] nums) {
		int secondMaxNum = nums[0];
		int maxNum = nums[1];
		if(maxNum < secondMaxNum) {
			secondMaxNum = maxNum ;
			
		}
		for(int i = 2 ; i<nums.length ; i++) {
			if(maxNum < nums[i]) {
				secondMaxNum = maxNum;
				maxNum =  nums[i];
			}
			
			else if(secondMaxNum < nums[i]) {
				secondMaxNum = nums[i];
			}
		}
		return secondMaxNum ;
	}
	
	public static void main(String[] args) {
		int[] nums = {33,33,19,55,53,11};
		System.out.println("Given array is: \n");
		System.out.println(Arrays.toString(nums) +"\n");
		Assignment60 assignment60 = new Assignment60();
		int secondMax = assignment60.getSecondMaxNumFromArray(nums);
		System.out.println("Second max num from an given array is: " +secondMax);
	}
}
