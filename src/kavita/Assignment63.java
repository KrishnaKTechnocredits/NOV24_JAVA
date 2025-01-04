package kavita;

import java.util.Arrays;

/*reverse each string in array and place at in reverse order and lower the case.

input : {"TeCh", "Aashvi", "Credits", "AnsH"}
output : [hsna,stiderC, ivhsaa, hcet]
Time:8m*/
public class Assignment63 {
	String getRevereseString(String input){
		String str= "";
		for(int i=input.length()-1;i>=0;i--){
		char ch= input.charAt(i);
		str=str+ch;
		}
		return str;
	}
	
	String[] getReverseStringArrayLower(String[] input){
		String[] output=new String[input.length];
		for(int i=0,j=output.length-1;i<input.length;i++,j--){
			String lower=getRevereseString(input[i]).toLowerCase();
			output[j]=lower;
		}
		return output;
	}
	
	public static void main(String[] args){
		Assignment63 assignment63=new Assignment63();
		String[] arr={ "TeCh", "Aashvi", "Credits", "AnsH" };
		String[] ans=assignment63.getReverseStringArrayLower(arr);
		System.out.println("The revrser order of resver string with lower case is : "+Arrays.toString(ans));
	}
}
