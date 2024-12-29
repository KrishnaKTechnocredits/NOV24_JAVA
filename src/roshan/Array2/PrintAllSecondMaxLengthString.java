package roshan.Array2;

public class PrintAllSecondMaxLengthString {
void getAllSecondMaxString (String [] input) {
	String maxStr = input [0];
	String SecondMAxStr =input[1];
	for(int i = 2 ; i < input.length; i++) {
		if(maxStr.length()<input[i].length()) {
			SecondMAxStr=maxStr;
			maxStr= input[i];
		}
		else if (SecondMAxStr.length() < input[i].length()) {
			     SecondMAxStr = input [i];
	
			
		}
	}
	findAllSecondMaxStr(input ,SecondMAxStr.length ());

}
  void findAllSecondMaxStr(String [] input ,int Smaxlen)	{
	  for(int i=0;i< input.length;i++) {
		  if (Smaxlen==input[i].length())
			  System.out.println(input[i]);
		  }
	  }
	  
	  public static void main(String[] args) {
		String [] input = {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune",
				                                                          "Ashvik","PuneGlobant","Pune", "PuGlobantne"};
		PrintAllSecondMaxLengthString printallsecondMaxlengthstring = new PrintAllSecondMaxLengthString ();
		printallsecondMaxlengthstring.getAllSecondMaxString (input);
		
	}
	  
  
}



/*
 * Assignment - 59 : 21th Dec'2024 [25 mins] print all the second maximum length
 * string from given array.
 * 
 * input : {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik",
 * "PuneGlobant","Pune", "PuGlobantne"} ouput : GlobantPune PuneGlobant
 * PuGlobantne
 */