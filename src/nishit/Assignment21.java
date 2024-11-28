package nishit;

public class Assignment21
{
	int count = 0;
	
	int getStringLength(String str)
	{
		int result = 0;

	    for (int i = 0; i < str.length(); i++)
	    {   
	    	result++;
			if(str.charAt(i) == ' ')
			{ 
				result--;
				count++;
			}
	    }
	    System.out.println("length without space is: "+ result + " and space characters are: "+ count);
	    return result;
	}
	
	public static void main(String[] args)
	{
		Assignment21 assignment21 = new Assignment21();
		assignment21.getStringLength("prem lata gupta");
	}
}
