package siddharth;

/*Assignment - 55 : 18th Dec'2024 [15-20 mins]
return union of given two array.
input : 
{10,19,18}
{99,8}

output :  {10,19,18,99,8} */

public class Assignment55 {
	void getUnionOfArray(int[] num1, int[] num2) {
		int[] output = new int[num1.length+num2.length];
		int count=0;
			for(int i=0;i<=2;i++) {
				output[count]=num1[i];
				System.out.println(output[count]);
				count++;
			}
			for(int j=0;j<=1;j++) {
				output[count]=num2[j];
				System.out.println(output[count]);
				count++;
			}
	}
	
	public static void main(String[] args) {
		Assignment55 assignment55 = new Assignment55();
		int [] input1 = {10,19,18};
		int [] input2 = {99,8};
		assignment55.getUnionOfArray(input1, input2);
	}
}
