package anuja.array1;
/*From given int array, return count of positive numbers.

input : {10,30,-45,66,-10};
output : 3 */
public class Assignment48 {

	public int getCountOfPositiveNums(int[] nums) {
		int count = 0;
		for(int i  = 0; i<nums.length ; i++) {
			if(nums[i] > 0) {
				count++;
			}
		}
		
		System.out.println("number of positive nums "+count);
		return  count;
	}
	
	public static void main(String[] args) {
		Assignment48 assignment48= new Assignment48();
		int [] nums = {10,30,-45,66,-10} ;
		assignment48.getCountOfPositiveNums(nums);
	}
}	