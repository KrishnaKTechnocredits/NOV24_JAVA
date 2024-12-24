package siddharth;

/*Assignment - 60 : 21st Dec'2024 [20 min]
return second maximum number from given array.

input = {33,33,19,55,53,11};
output : 53 
 */

public class Assignment60 {
	
	int getSecondMaxNum(int[] input) {
		int max=input[0];
		int SecondMax=input[1];
		for(int i=1;i<input.length;i++) {
			if(max<input[i]) {
				SecondMax=max;
				max=input[i];
			}else if(SecondMax<input[i]) {
				SecondMax=input[i];
			}
		}
		return SecondMax;
	}
	
	public static void main(String[] args) {
		Assignment60 assignment60 = new Assignment60();
		int[] input = {33,33,19,55,53,11};
		int ans=assignment60.getSecondMaxNum(input);
		System.out.println("Output : "+ans);
	}
}
