package imran.string_programs;

public class Assignment23_PrintUppLowDigSpaSpecInString {

	int lCount, uCount, dCount, spaceCount, spCount;
	void getData(String data)
	{
		for(int i=0; i<data.length();i++)
		{
			char ch= data.charAt(i);
			if(Character.isLetter(ch))
			{
				if(Character.isUpperCase(ch))
				{
					lCount++;
				}
				else
				{
					uCount++;
				}
			}
			else if(Character.isDigit(ch))
			{
				dCount++;
			}
			else if(ch == ' ')
			{
				spaceCount++;
			}
			else
			{
				spCount++;
			}
		}
		System.out.println("The Number of upper case Character present in String:" + data +" is : " + uCount);
		System.out.println("The Number of lower case Character present in String:" + data +" is " + lCount);
		System.out.println("The Number of digit Character present in String:" + data +" is  " + dCount);
		System.out.println("The Number of Spaces present in String:" + data +" is " + spaceCount);
		System.out.println("The Number of Special Character present in String:" + data + " is "+ spCount);
	}
	
	public static void main(String[] args) {
		Assignment23_PrintUppLowDigSpaSpecInString assignment23_PrintUppLowDigSpaSpecInString_1= new Assignment23_PrintUppLowDigSpaSpecInString();
		assignment23_PrintUppLowDigSpaSpecInString_1.getData("Imran 17 Ahmed 06 Ansari@1996");
	}
}
