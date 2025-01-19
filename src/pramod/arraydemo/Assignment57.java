/*
Assignment - 57 : 21th Dec'2024 [15 mins] [15 mins]
Return the maximum length string from given array.

input : {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"}
ouput : Technocredits
*/
package pramod.arraydemo;
import java.util.*;
class Assignment57{

	String getMaxString(String[] input){
		int maxStringLength = input[0].length();
		String maxString = input[0];
		for(int i=0; i<input.length; i++){
			
			if(maxStringLength<input[i].length()){
				maxString=input[i];
				maxStringLength=input[i].length();
			}
		}
		return maxString;
	}
	
	public static void main(String[] args){
		Assignment57 A57= new Assignment57();
		String[] input = {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"};
		System.out.println("Given String is: "+ Arrays.toString(input));
		String output = A57.getMaxString(input);
		System.out.println("Maximum length string form given array is : "+output);
	}
}