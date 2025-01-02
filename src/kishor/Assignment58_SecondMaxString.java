package kishor;
//Return the second maximum length string from given array.
//If you find multiple string as second maximum, return the last second maximum.
//input : {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"}

public class Assignment58_SecondMaxString {
	
	String getSecondMaxString(String[] input) {
		String maxString = input[0];
		String secondMax = input[1];
		if(input[1].length()>input[0].length()) {
			maxString=input[1];
			secondMax=input[0];
		}
		// input[0] and input[1] is sorted thats why start with 2nd index
		for(int i=2;i<input.length;i++) {
			if(input[i].length()>maxString.length()) {
				secondMax=maxString;
				maxString=input[i];
			}
			else if(input[i].length()>=secondMax.length()) {
				secondMax=input[i];
			}
		}
		return secondMax;
	}
	
	public static void main(String[] args) {
		String[] input ={"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"};
		Assignment58_SecondMaxString assignment58 = new Assignment58_SecondMaxString();
		String ans=assignment58.getSecondMaxString(input);
		System.out.println("The second max length string in given array is:- "+ans);
	}
}
