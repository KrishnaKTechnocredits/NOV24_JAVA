/*
 * Assignment - 55 : 18th Dec'2024 [15-20 mins]

return union of given two array.

input : 
{10,19,18}
{99,8}

output :  {10,19,18,99,8}
*/
package rohan;

public class Assignment_55 {

	public static void main(String[] args) {
		Assignment_55 assignment = new Assignment_55();
		assignment.main();
	}
	void main(){
		int[] num1 = {10,19,18};
		int[] num2 = {99,8};
		int[] output = new int[num1.length+num2.length];
		int count =0;
		for(int i=count;i<num1.length;i++){
			output[count]=num1[i];
			System.out.println(output[count]);
			count++;
			
		}
		for(int i=0;i<num2.length;i++){
			output[count]=num2[i];
			System.out.println(output[count]);
			count++;
			
		}
		
	}

}
