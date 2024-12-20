/*
Assignment - 49 : 16th Dec'2024 [15 mins] [imp] [8 mins]

return the maximum number from given array. 

input : {44,45,22,25,47,29,46}
output : 47

input : {-44,-45,-22,-25,-47,-29,-46}
output : -22
*/
package pramod.arraydemo;

class Assignment49 {

	int getMaxNumber(int[] input1) {
		int maxNum = input1[0];
		for (int i=1; i<input1.length; i++) {
			if(maxNum<input1[i]) {
				maxNum = input1[i];
			}
		}
		return maxNum;
	}

	public static void main(String[] args) {
		Assignment49 A49= new Assignment49();
		int[] input1 = {44,45,22,25,47,29,46};
		int[] input2 = {-44,-45,-22,-25,-47,-29,-46};
		int answer1 = 0,answer2 = 0;
		answer1 = A49.getMaxNumber(input1);
		System.out.println("Maximum Number from given arrey is : " + answer1);
		answer2 = A49.getMaxNumber(input2);
		System.out.println("Maximum Number from given arrey is : " + answer2);
	}
}