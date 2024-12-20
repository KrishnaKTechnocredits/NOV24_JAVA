package anuja.array1;
/*
return the maximum number / min number from given array. 

input : {44,45,22,25,47,29,46}
output : 47

input : {-44,-45,22,-25,-47,-29,-46}
output : -22*/
public class Assignment49 {
	
	public void getMaxNum(int[] nums) {
		int maxNum = nums[0];
		int minNum = nums[0];
		
		for(int i = 1 ; i< nums.length ; i++) {
			if(maxNum < nums[i] ) {
				maxNum = nums[i];
			}
			if(minNum > nums[i]) {
				minNum = nums[i];
			}
		}
		System.out.println("Max num is " +maxNum);
		System.out.println("Min num is " +minNum);
	}
	
	public static void main(String[] args) {
		Assignment49 assignment49 = new Assignment49();
		int[] num1 = {44,45,22,25,47,29,46};
		int[] num2 = {-44,-45,-22,-25,-47,-29,-46};
		
		assignment49.getMaxNum(num1);
		
		System.out.println("----------------------------");
		
		assignment49.getMaxNum(num2);

	}
	

}
