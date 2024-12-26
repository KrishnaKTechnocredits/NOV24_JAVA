package anuja.array1;

import java.util.Arrays;

/*reverse each string in array and place at in reverse order convert all in small.

input : {"TeCh", "Aashvi", "Credits", "AnsH"}
output : [hsna,stiderC, ivhsaa, hcet]*/
public class Assignment63 {

	public String getReverseString(String name) {
		String word = "";
		for(int i = name.length()-1 ; i>= 0; i--) {
			word += Character.toLowerCase(name.charAt(i));
		}
		return word;
	}
	
	public String[] getReverseArrayOfString(String names[]) {
		String [] reverseNames = new String[names.length] ;
		for(int i= names.length-1 ; i>= 0; i--) {
			
			reverseNames[i] = getReverseString(names[names.length-1-i]);
		}
		return reverseNames;
		
	}
	
	public static void main(String[] args) {
		Assignment63 assignment63 = new Assignment63();
		String[] input = {"TeCh", "Aashvi", "Credits", "AnsH"};
		System.out.println("--------------- \n"+ Arrays.toString(input));
		String [] result = assignment63.getReverseArrayOfString(input);
		System.out.println("--------------- \n"+ Arrays.toString(result));
	}
}
