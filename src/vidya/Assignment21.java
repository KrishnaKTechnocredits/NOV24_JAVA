package vidya;

public class Assignment21 {

	int lengthOfString(String str)
	{
		int count = 0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ') {
				count++;
			}
			
		}
		return count;
	}
	
	int numberofspaces(String str) {
		int count =0;
		for(int i = 0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				count++;
			}
		}return count;
	}
	
public static void main(String[] args) {
	String input = "Prem lata Gupta";
	Assignment21 assg21 = new Assignment21();
	//assg21.lengthOfString("Prem lata Gupta");
	int length = assg21.lengthOfString(input);
	int length2 = assg21.numberofspaces(input);
	System.out.println("The length of the string excluding spaces is: " + length);
	System.out.println("Number of spaces characters are: "+length2);
}
}