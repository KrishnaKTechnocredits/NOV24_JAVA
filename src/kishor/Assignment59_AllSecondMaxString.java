package kishor;
//print all the second maximum length string from given array.
//input : {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"}

public class Assignment59_AllSecondMaxString {
	
	void displaySeondMax(String[] input) {
		String maxString = input[0];
		String secondMax = input[1];
		if(input[1].length()>input[0].length()) {
			maxString=input[1];
			secondMax=input[0];
		}
		for(int i=2;i<input.length;i++) {
			if(input[i].length()>maxString.length()) {
				secondMax=maxString;
				maxString=input[i];
			}
			else if(input[i].length()>secondMax.length()) {
				secondMax=input[i];
			}
		}
		displayAllSecondMax(input,secondMax.length());
	}
	void displayAllSecondMax(String[] input,int tarLength ) {
		for(int i=0;i<input.length;i++) {
			if(input[i].length()==tarLength) {
				System.out.println(input[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		String[] input={"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"};
		Assignment59_AllSecondMaxString assignment59 = new Assignment59_AllSecondMaxString();
		assignment59.displaySeondMax(input);
	}
	
}
