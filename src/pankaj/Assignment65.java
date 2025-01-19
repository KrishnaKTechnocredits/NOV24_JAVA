/*Assignment - 65 : 22nd Dec'2024 [20 min]
reverse each string in array and place at in reverse order.
input : {"Te1Ch", "A2as3Hvi", "CrE45di555ts", "ANSH"}
output : [HSNa,StidErc, IvHsaa, HCet]
Hint : First letter in Uppercase + last Letter in lowercase + all other characters in same case + exclude digits*/



package pankaj;

import java.util.Arrays;

public class Assignment65 {
	
		String revWord(String str)
		{
			String output="";
			for(int i=str.length()-1;i>=0;i--)
			{
				output=output+str.charAt(i);
			}
			return output;
		}
		String digitIdentification(String str)
		{
			String output="";
			for(int i=0;i<=str.length()-1;i++)
			{
				char ch=str.charAt(i);
				if(!Character.isDigit(ch))
				{
					output=output+ch;
				}
			}
			
			return output;
		}
		String[] revArray(String[] str)
		{
			String[] output=new String[str.length];
			for(int i=0,j=str.length-1;i<str.length;i++,j--)
			{
				output[j]=revWord(str[i]);
			}
			return output;
		}
		String firstLetterUpoercaseLastLowercase(String str)
		{
			
			return str.substring(0,1).toUpperCase()+str.substring(1,str.length()-1)+str.substring(str.length()-1).toLowerCase();
		}
		String[] processArray(String[] str)
		{
			String[] output=new String[str.length];
			for(int i=0,j=str.length-1;i<str.length;i++,j--)
			{
				String word=str[i];
				word=revWord(word);
				word=digitIdentification(word);
				word=firstLetterUpoercaseLastLowercase(word);
				output[j]=word;
			}
			return output;
		}
		public static void main(String[] args)
		{
			Assignment65 A=new Assignment65();
			String[] arr={"Te1Ch", "A2as3Hvi", "CrE45di555ts", "ANSH"};
			String[] M=A.processArray(arr);
			System.out.println(Arrays.toString(arr));
			System.out.println(Arrays.toString(M));
		
		}

		
}
