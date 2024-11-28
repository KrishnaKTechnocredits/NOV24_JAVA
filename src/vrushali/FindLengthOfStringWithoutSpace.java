package vrushali;

//Assignment - 21 : 24th Nov'2024 [20 mins]
//
//Find the length of the given string excluding space. 
//
//input : prem lata gupta
//output : length without space is 13 and space characters are 2. 


public class FindLengthOfStringWithoutSpace {
	
	int getLenthOfStringWithoutSpace(String str)
	{
		int spaceCount=0;
		char ch;
		int length;
		for(int num=0;num<str.length();num++)
		{
			ch=str.charAt(num);
			
			if(ch==' ')
			{
				spaceCount++;
			}
			
		}
		length=str.length()-spaceCount;
		return length;
	}
	
	public static void main(String[] args) {
		FindLengthOfStringWithoutSpace findLengthOfStringWithoutSpace=new FindLengthOfStringWithoutSpace();
		int len=findLengthOfStringWithoutSpace.getLenthOfStringWithoutSpace("prem lata gupta");
		System.out.println("Length of string without space is "+len);
	}

}
