package roshan.Array2;

 public class ReturnSecondMaxString {
	 String getSecondMax(String[] input) {
		String secondMaxoutput = input[0];
		String maxStr = input[1];
		if (maxStr.length() < secondMaxoutput.length()) {
			secondMaxoutput = input[1];
			maxStr = input[0];
		}

		for (int i = 2; i < input.length; i++) {
			if (maxStr.length() < input[i].length()) {
				secondMaxoutput = maxStr;
				maxStr = input[i];
				
			} else if (secondMaxoutput.length() <= input[i].length()) {
				secondMaxoutput = input[i];
				}
			}
	
		return secondMaxoutput;
		
	}
	public static void main(String[] args) {
		
	String [] input =  {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik","PuneGlobant","Pune", "PuGlobantne"};
	ReturnSecondMaxString returnsecondmaxstring =new ReturnSecondMaxString();
	String result = returnsecondmaxstring.getSecondMax(input);
	System.out.println(result);
	}
	}
/*
 * Assignment - 58 : 21th Dec'2024 [15 mins] Return the second maximum length
 * string from given array. If you find multiple string as second maximum,
 * return the last string as second maximum.
 * 
 * input : {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik",
 * "PuneGlobant","Pune", "PuGlobantne"} ouput : PuGlobantne
 */