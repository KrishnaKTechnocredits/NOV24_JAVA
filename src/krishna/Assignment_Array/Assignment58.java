package Assignment_Array;

public class Assignment58 {

	String getSecondMaximumLengthStringLastApperence(String[] str) {
		String maxLength = str[0] , secondMaxLength = str[1];
		if(secondMaxLength.length()>maxLength.length()) {
			maxLength = str[1];
			secondMaxLength = str[0];
		}
		for(int i = 2;i<str.length;i++) {
			if(str[i].length()>maxLength.length()) {
				secondMaxLength = maxLength;
				maxLength = str[i];
			} else if(secondMaxLength.length()<=str[i].length()) {
				secondMaxLength = str[i];
			}
		}
		return secondMaxLength;
	}
	
	public static void main(String[] args) {
		String[] input =  {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"};
		System.out.println(new Assignment58().getSecondMaximumLengthStringLastApperence(input));
	}
}
