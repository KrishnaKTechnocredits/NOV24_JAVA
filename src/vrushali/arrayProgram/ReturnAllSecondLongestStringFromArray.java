package vrushali.arrayProgram;
//Assignment - 59 : 21th Dec'2024 [25 mins]
//print all the second maximum length string from given array.
//
//input : {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"}
//ouput : GlobantPune
//        PuneGlobant
//		PuGlobantne

public class ReturnAllSecondLongestStringFromArray {
	String printAllSecondLongestStringFromArray(String[] strArray)
	{
		String secondLongest= strArray[0];
		String longest = strArray[1];
		if(strArray[0].length()>strArray[1].length())
		{
			 secondLongest= strArray[1];
			 longest = strArray[0];
		}
		
		for (int i = 2; i < strArray.length; i++) {
			if (longest.length() < strArray[i].length()) {
				secondLongest=longest;
				longest = strArray[i];
			}else if(secondLongest.length()<=strArray[i].length())
			{
				secondLongest=strArray[i];
			}
		}
		
		printAllWordOfSecondLongest(strArray,secondLongest.length());
		return secondLongest;
	}
	
	void printAllWordOfSecondLongest(String[] strArray,int seconndLongestLength)
	{
		System.out.println("Second Longest Strings In Array:-");
		for(int i=0;i<strArray.length;i++)
		{
			if(strArray[i].length()==seconndLongestLength)
			{
				System.out.println(strArray[i]);
			}
		}
	}
	public static void main(String[] args) {
		ReturnAllSecondLongestStringFromArray returnAllSecondLongestStringFromArray = new ReturnAllSecondLongestStringFromArray();
		String[] strArray = { "Tech", "Tecg", "Technocredits", "aashvi", "GlobantPune", "Ashvik", "PuneGlobant", "Pune",
				"PuGlabantne" };
		String str = returnAllSecondLongestStringFromArray.printAllSecondLongestStringFromArray(strArray);
	}
}
