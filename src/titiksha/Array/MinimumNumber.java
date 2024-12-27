//return the minimum number from given array. 
//input : {44,45,22,25,47,29,46}
//output : 22
//input : {-44,-45,-22,-25,-47,29,46}
//output : -47


package titiksha.Array;

public class MinimumNumber {
 int getMinimumNumber(int[] arr) {
	 int minimum=arr[0];
	for(int i=1;i<arr.length;i++) {
		if(minimum > arr[i]) {
			minimum = arr[i];
		}
	}
	return minimum;
 }
 public static void main(String[] args) {
	 MinimumNumber minimumNumber =new MinimumNumber();
	 int[] minimumNum={44,45,22,25,47,29,46};
	 int output=minimumNumber.getMinimumNumber(minimumNum);
	 System.out.println("The minimum number from given array is:" + output);
	 int[] minimumNum1={-44,-45,-22,-25,-47,29,46};
	 int output1=minimumNumber.getMinimumNumber(minimumNum1);
	 System.out.println("The minimum number from given array is:" + output1);
	 
 }
}
