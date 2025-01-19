package kavita;

import java.util.Arrays;

/*reverse each string in array at the same place.
input : {"tech", "aashvi", "credits"}
output : [hcet, ivhsaa, stiderc]
Time: 12m*/
public class Assignment61 {
	String getReversString(String input){
		String str= "";
		for(int i=input.length()-1;i>=0;i--){
			char ch=input.charAt(i);
			str=str+ch;
		}
		//System.out.println("The reverse of the string is: "+str);
		return str;
	}
	
	String[] reverseStringinArray(String[] input){
		String[] output=new String[input.length];
		for(int i=0;i<input.length;i++){
			output[i]=getReversString(input[i]);
		}
		return output;
	}
	
	public static void main(String[] args){
		Assignment61 assignment61=new Assignment61();
		//assignment61.getReversString("kavita");
		String[] input={"tech", "aashvi", "credits"};
		System.out.println("The given string in the array is : "+Arrays.toString(input));
		
		String[] ans=assignment61.reverseStringinArray(input);
		System.out.println("The reverse string in the array is : "+Arrays.toString(ans));
		
	}
}
