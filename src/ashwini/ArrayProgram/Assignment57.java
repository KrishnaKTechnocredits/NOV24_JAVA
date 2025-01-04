package ashwini.ArrayProgram;
/*
 *Assignment - 57 : 21th Dec'2024 [15 mins]
Return the maximum length string from given array.

input : {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"}
ouput : Technocredits

 */
public class Assignment57 {
	String maxLenString(String[] input) {
		String maxLen = input[0];
		for(int i=0;i<input.length;i++) {
			if(maxLen.length()< input[i].length()) {
				maxLen=input[i];
			}
		}
		
		return maxLen;
	}

	public static void main(String[] args) {
		String[] arr={"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"};
		Assignment57 a57 = new Assignment57();
		String MaxLengthString=a57.maxLenString(arr);
		System.out.println(MaxLengthString);
	
	}

}
