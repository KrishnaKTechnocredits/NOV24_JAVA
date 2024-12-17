/*
Assignment - 50 : 16th Dec'2024 [10 mins] [imp] [6 mins]

return the minimum number from given array. 

input : {44,45,22,25,47,29,46}
output : 22


input : {-44,-45,-22,-25,-47,29,46}
output : -47
*/
package pramod.arraydemo;

class Assignment50 {

	int getMinNumber(int[] input1) {
		int minNum = input1[0];
		for (int i=1; i<input1.length; i++) {
			if (minNum>input1[i]) {
				minNum = input1[i];
			}	
		}
		return minNum;
	}
	
	public static void main(String[] args) {
		Assignment50 A50 = new Assignment50();
		int[] input1 = {44,45,22,25,47,29,46};
		int[] input2 = {-44,-45,-22,-25,-47,29,46};
		int answer1 = 0, answer2=0;
		answer1 = A50.getMinNumber(input1);
		System.out.println("Minimum number form giver array is : " + answer1);
		answer2 = A50.getMinNumber(input2);
		System.out.println("Minimum number form giver array is : " + answer2);	
	}
}