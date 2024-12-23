/*
 * Assignment - 60 : 21st Dec'2024 [20 min]
return second maximum number from given array.

input = {33,33,19,55,53,11};
output : 53 
 */


package mayur;

public class Assignment60 {
	
	int getSecondMaxNum(int[] num) {	
		int max =num[0];
		int secMax=num[0];
		for (int i=0; i <num.length-1 ; i++) {
			if (num[i] > num[i+1] && num[i] >= max) {
				max=num[i];
			}
			if(num[i+1] > num[i] && num[i+1] >= max){
				max=num[i+1];
			}
		}
		for (int i=0; i <num.length-1 ; i++) {
			if(num[i] < max && num[i] >= secMax) {
				secMax = num[i];
			}
			if(num[i+1] < max && num[i+1] >= secMax){
				secMax=num[i+1];
			}
		}
		return secMax;
	}

	public static void main(String[] args) {
		Assignment60 obj = new Assignment60();
		int[] num={33,33,19,55,53,11};
		System.out.println(obj.getSecondMaxNum(num));
	}
}
