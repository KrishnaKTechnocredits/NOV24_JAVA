package sindhu.Array;

public class Assignment52 {
	int[] getMaxMinNum(int[] num) {
		int[] output = new int[2];
		int maxNum=num[0]; int minNum=num[0];
		for(int i=1; i<num.length; i++) {
			if(maxNum<num[i]) {
				maxNum=num[i];
			}
			if(minNum>num[i]) {
				minNum=num[i];
			}
		}
		output[0]= maxNum;
		output[1]= minNum;
		
		return output;
	}
	
	public static void main(String[] args) {
		Assignment52 assi52 = new Assignment52();
		int[] number = {-44,-45,-22,-25,-47,-29,-46};
		int[] MaxMinArr = assi52.getMaxMinNum(number);	
		System.out.println("Max number in given array is "+MaxMinArr[0]);
		System.out.println("Min number in given array is "+MaxMinArr[1]);
	}
}
