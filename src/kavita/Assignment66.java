package kavita;

import java.util.Arrays;

/*reverse word in array at the same place provided word should not have any digit, if word is having any digit do not reverse the word.
input : {"tech", "aa1shvi", "credits", "H4i", "Hello"}
output : [hcet, aashvi, stiderc, Hi, olleH]
Time: 14m*/
public class Assignment66 {
	String getReverseString(String input){
		String str= "";
		for(int i=input.length()-1;i>=0;i--){
			char ch=input.charAt(i);
			str=str+ch;
		}
		return str;
	}
	
	boolean isStringHavingDigit(String input){
		boolean flag=false;
		for(int i=0;i<input.length();i++){
			char ch=input.charAt(i);
			if(Character.isDigit(ch)){
				flag=true;
				break;
			}
		}
		return flag;
	}
	
	String getStringExcludedDigit(String str){
		String str1= "";
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(!Character.isDigit(ch)){
				str1=str1+ch;
			}
		}
		return str1;
	}
	
	String[] getReverseAllArray(String[] input){
		String[] obj=new String[input.length];
		for(int i=0;i<input.length;i++){
			String str=input[i];
			if(isStringHavingDigit(str)==true){
				obj[i]=getStringExcludedDigit(str);
			}else{
				obj[i]=getReverseString(str);
			}
		}
		return obj;
	}
	
	public static void main(String[] args) {
		String[] input = { "tech", "aa1shvi", "credits", "H4i", "Hello" };
		Assignment66 assignment66 = new Assignment66();
		String[] ans = assignment66.getReverseAllArray(input);
		System.out.println(Arrays.toString(ans));
	
}
}
