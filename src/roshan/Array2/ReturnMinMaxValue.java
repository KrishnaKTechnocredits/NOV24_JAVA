package roshan.Array2;

public class ReturnMinMaxValue {

	static int[] rMinMAxValue (int []number) {
		 int minNum= number[0];
		 int maxNum= number[0];
		 int [] output= new int[2];
		for (int i=1;i<number.length;i++) {
			if(minNum>number[i]) {
				minNum=number[i];
			}
			if (maxNum<number[i]) {
				maxNum=number[i];

			}
			
		}
output[0]=minNum;
output[1]=maxNum;
return output;
	}
	public static void main(String[] args) {
		int [] number= {10,20,30,40,50};
		int[] num = ReturnMinMaxValue.rMinMAxValue(number);
		System.out.println("min no is : " + num[0]);
		System.out.println("max no is : " + num[1]);
	}
}

/*
 * Assignment - 52 : 16th Dec'2024 [15 mins]
 * 
 * return maximum and minimum number from given array.
 * 
 * int getMaxMinNum(int[] arr){
 * 
 * }
 */