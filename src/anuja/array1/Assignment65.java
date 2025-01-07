package anuja.array1;

import java.util.Arrays;

/*reverse each string in array and place at in reverse order.

input : {"Te1Ch", "A2as3Hvi", "CrE45di555ts", "ANSH"} 

rule - 1st output, reverse , 1st char in caps, and last car opposite
output : [HSNa,StidErc, IvHsaa, HCet]

Hint : First letter in Uppercase + last Letter in lowercase + all other characters in same case + exclude digits*/
public class Assignment65 {

	public static void main(String[] args) {
		Assignment65 assignment65 = new Assignment65();
		String[] names = {"Te1Ch", "A2as3Hvi", "CrE45di555ts", "ANSH"};
		System.out.println("Input array is: \n " +Arrays.toString(names));
		System.out.println("--------------------------------------------------");
		String[] expectedOp = {"HSNa" ,"StidErc", "IvHsaa", "HCet"};
		System.out.println("Expected Output array is: \n " +Arrays.toString(expectedOp));
		System.out.println("--------------------------------------------------");
		String[] result = assignment65.getReverseArray(names);
		System.out.println("Output array is: \n " +Arrays.toString(result));

	}
	//method to revrse the array
	public String[] getReverseArray(String[] names) {
		String[] newArr = new String[names.length] ;
		for(int i = 0 ; i<names.length ; i++) {
			newArr [i] = getOutputStringFromArray(names[names.length -1 -i]);
		}
		return newArr;
	}
	
	//method to create a required string
	public String getOutputStringFromArray(String name) {
		
		String changesStr = "";
		for(int i = name.length()-1 ; i>= 0 ; i--) {
			if(Character.isLetter(name.charAt(i))) {
				changesStr +=name.charAt(i);}
		}
		
		return changesStr.substring(0,1).toUpperCase() + changesStr.substring(1,changesStr.length()-1) + changesStr.substring(changesStr.length()-1);
	}
}
