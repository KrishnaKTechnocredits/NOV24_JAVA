package kavita;

import java.util.Arrays;

/*reverse each string in array and place at in reverse order, 
 * each word first letter capital and rest in lowercase.
input : {"Tech", "Aashvi", "Credits", "Ansh"}
output : [Hsna,Stiderc, Ivhsaa, Hcet]
Time:9m*/
public class Assignment64 {
	String getReverserString(String input) {
		String str= "";
		for(int i=input.length()-1;i>=0;i--) {
			char ch=input.charAt(i);
			str=str+ch;
		}
		return str;
	}
	
	String getFirstLetterCap(String str) {
		String output=str.substring(0, 1).toUpperCase()+str.substring(1).toLowerCase();
		return output;
	}
	
	String[] getReverseStrReveOrder(String[] arr) {
		String[] obj=new String[arr.length];
		for(int i=0,j=obj.length-1;i<arr.length;i++,j--) {
			String output=getReverserString(arr[i]);
			output=getFirstLetterCap(output);
			obj[j]=output;
		}
		return obj;
	}
	
	public static void main(String[] args) {
		Assignment64 assignment64=new Assignment64();
		String[] input={"Tech", "Aashvi", "Credits", "Ansh"};
		String[] ans=assignment64.getReverseStrReveOrder(input);
		System.out.println(Arrays.toString(ans));
	}
}
