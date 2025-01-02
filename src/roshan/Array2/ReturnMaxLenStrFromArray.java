package roshan.Array2;

public class ReturnMaxLenStrFromArray {
	static String GetMaxLenStr (String [] input) {
		String maxLenStr = input[0];
		for(int i=1 ;i<input.length;i++) {
			if(maxLenStr.length() < input[i].length()) {
				maxLenStr =  input[i];
			}
				
			}
			return maxLenStr;
			
		}
	public static void main(String[] args) {
		
		String [] input = {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik","PuneGlobant","Pune", "PuGlobantne"};
	//ReturnMaxLenStrFromArray returnmaxlenstrfromarray = new ReturnMaxLenStrFromArray ();
	//String maxlenthArray = returnmaxlenstrfromarray.GetMaxLenStr(input);
	//System.out.println(maxlenthArray);
	System.out.println(ReturnMaxLenStrFromArray.GetMaxLenStr(input));
	}
		
	}







/*
 * @all Assignment - 57 : 21th Dec'2024 [15 mins] Return the maximum length
 * string from given array.
 * 
 * input : {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik",
 * "PuneGlobant","Pune", "PuGlobantne"} ouput : Technocredits
 */