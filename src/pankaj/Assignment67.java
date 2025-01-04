/*Assignment - 67 : 23rd Dec (IMP) [15 mins]
Rearrange the given String, uppercase followed by digits followed by lowercase.

input : Te1ch6NOCre3dits
output : TNOC163echredits	*/

package pankaj;

public class Assignment67 {
	
	String processStringOne(String word)
	{
		String str="";
		for(int i=0;i<word.length();i++)
		{
			char ch=word.charAt(i);
			//boolean flag=false;
			if(Character.isUpperCase(ch))
			{
				str=str+word.charAt(i);
			}
		}
		
		return str;
	}
	String processLowerCase(String word)
	{
		String str="";
		for(int i=0;i<word.length();i++)
		{
			char ch=word.charAt(i);
			if(Character.isLowerCase(ch))
			{
				str=str+word.charAt(i);
			}
		}
		return str;
		
	}
	String processDigit(String word)
	{
		String str="";
		for(int i=0;i<word.length();i++)
		{
			char ch=word.charAt(i);
			if(Character.isDigit(ch))
			{
				str=str+word.charAt(i);
			}
		}
		return str;
	}
	String processString(String word)
	{
		String upperCase=processStringOne(word);
		String digit=processDigit(word);
		String lowerCase=processLowerCase(word);
		return upperCase+digit+lowerCase;
	}

	public static void main(String[] args) {
		
		Assignment67 A=new Assignment67();
		String word="Te1ch6NOCre3dits";
		String M=A.processString(word);
	    System.out.println("The Updated String is==>>"+M);
	}

}
