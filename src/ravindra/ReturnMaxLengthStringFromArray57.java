package ravindra;

public class ReturnMaxLengthStringFromArray57 {
	String maxlengthString(String[] input) {
		int maxlength = input[0].length();
		String maxString = input[0];
		for (int i = 0; i < input.length - 1; i++) {
			if (maxlength < input[i].length()) {
				maxlength = input[i].length();
				maxString = input[i];
			}
		}
		return maxString;
	}
	public static void main(String[] args) {
		String[]input={"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"};
		ReturnMaxLengthStringFromArray57 Assignment57=new ReturnMaxLengthStringFromArray57();
		String str=Assignment57.maxlengthString(input);
		System.out.println(str);
	}
}