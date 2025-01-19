package kishor;

import java.util.Arrays;

//reverse each string in array and place at in reverse order, each word first letter capital and rest in lowercase.
//input : {"Tech", "Aashvi", "Credits", "Ansh"}
//output : [Hsna,Stiderc, Ivhsaa, Hcet]

public class Assignment64_RevStringRevOrderFirstCap {
	
	String getRevString(String input) {
		String str ="";
		for(int i=input.length()-1;i>=0;i--) {
			char ch = input.charAt(i);
			str = str+ch;
		}
		return str;
	}
	
	String getFirstLetterCaps(String str) {
		String output = str.substring(0, 1).toUpperCase()+str.substring(1).toLowerCase();
		return output;
	}
	
	String[] getRevStringRevOrder(String[] arr) {
		String[] obj = new String[arr.length];
		for(int i=0,j=obj.length-1;i<arr.length;i++,j--) {
			String output=getRevString(arr[i]);
			output=getFirstLetterCaps(output);
			obj[j]=output;
		}
		return obj;
	}
	
	
	
	public static void main(String[] args) {
		String[] input = {"Tech", "Aashvi", "Credits", "Ansh"};
		Assignment64_RevStringRevOrderFirstCap assignment64 = new Assignment64_RevStringRevOrderFirstCap();
		String[] ans=assignment64.getRevStringRevOrder(input);
		System.out.println(Arrays.toString(ans));
	}
}
