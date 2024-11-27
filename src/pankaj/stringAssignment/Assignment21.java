/*Find the length of the given string excluding space. 

input : prem lata gupta
output : length without space is 13 and space characters are 2. */

package pankaj.stringAssignment;

public class Assignment21 {

	static int count;
	static int charLength;
	
	int getlength(String str)
	{
		int length=str.length();
		for(int i=0; i<=str.length()-1;i++)
		{
			if(str.charAt(i)==' ')
			{
			     count++;	
			}
			//System.out.println(str.charAt(i));
			
		}
		int charLength=length-count;
		return charLength;
		
	}
	public static void main(String[] args) {
		
		Assignment21 A21=new Assignment21();
		//A21.getlength("Pankaj Patil");
		int ans=A21.getlength("Prem Lata Gupta");
		System.out.println("Length without space is " +ans + " and space characters are " +count);

	}

}
