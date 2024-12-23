package Assignment_Array;

public class Assignment59 {
	
	void printAllSecondMaximumLengthString(String[] str) {
		String maxLength = str[0] , secondMaxLength = str[1];
		if(maxLength.length()<secondMaxLength.length()) {
			maxLength = str[1];
			secondMaxLength = str[0];
		}
		
		for(int i = 2;i<str.length;i++) {
			if(maxLength.length() <str[i].length()) {
				secondMaxLength = maxLength;
				maxLength = str[i];
			}else if(secondMaxLength.length()<str[i].length()) {
				secondMaxLength = str[i];
			}
		}
		
		for(int i = 0;i<str.length;i++) {
			if(secondMaxLength.length() == str[i].length()) {
				System.out.println(str[i]);
			}
		}
	}

	public static void main(String[] args) {
		String[] input =  {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"};
		new Assignment59().printAllSecondMaximumLengthString(input);
	}
}
