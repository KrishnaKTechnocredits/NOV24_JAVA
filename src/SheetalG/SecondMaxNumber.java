/*Assignment - 60 : 21st Dec'2024 [20 min]
return second maximum number from given array.

input = {33,33,19,55,53,11};
output : 53 */

package SheetalG;

import java.util.Arrays;

public class SecondMaxNumber {
	public static void main(String[] args) {
		int[] input = {33,33,19,55,53,11};
		SecondMaxNumber secondMaxNumber= new SecondMaxNumber();
		System.out.println("Input : " +Arrays.toString(input));
		int MaxNum = input[0];//MaxNum=33
		int SecondNum = input[1];//SecondNum=33
		
		for(int index=2;index<input.length;index++) {
			if(MaxNum>input.length) {
				SecondNum=MaxNum;
				MaxNum=input[index];
			}else {
				
				SecondNum=input[index];
			}
		}
		System.out.println(SecondNum);
	}

}
