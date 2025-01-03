package kavita;

import java.util.Arrays;

/*reverse each string in array and place at in reverse order.

input : {"Te1Ch", "A2as3Hvi", "CrE45di555ts", "ANSH"}
output : [HSNa,StidErc, IvHsaa, HCet]

Hint : First letter in Uppercase + last Letter in lowercase + all other characters in same case + exclude digits
Time: 10m*/
public class Assignment65 {
	String getReverseString(String input) {
		String str= "";
		for(int i=input.length()-1;i>=0;i--) {
			char ch= input.charAt(i);
			if(!Character.isDigit(ch))
			str=str+ch;
		}
		return str;
	}
	
	String getUpperLowerComb(String str) {
		String output=str.substring(0, 1).toUpperCase()+str.substring(1,str.length()-1)+ str.substring(str.length() - 1).toLowerCase();
		return output;
	}
	
	String[] getRevStringRevOrder(String[] input) {
		String[] obj = new String[input.length];
		for (int i = 0, j = obj.length - 1; i < input.length; i++, j--) {
			String output = getReverseString(input[i]);
			output = getUpperLowerComb(output);
			obj[j] = output;
		}
		return obj;
	}
	
	public static void main(String[] args) {
		String[] input = { "Te1Ch", "A2as3Hvi", "CrE45di555ts", "ANSH" };
		Assignment65 assignment65 = new Assignment65();
		String[] ans = assignment65.getRevStringRevOrder(input);
		System.out.println(Arrays.toString(ans));
	}
}
