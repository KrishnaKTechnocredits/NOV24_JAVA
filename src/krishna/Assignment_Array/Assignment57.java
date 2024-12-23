package Assignment_Array;

public class Assignment57 {
	
	String getMaxLengthString(String[] str) {
		String maxLengthString = str[0];
		for(int i = 1;i<str.length;i++) {
			if(str[i].length()>maxLengthString.length()) {
				maxLengthString = str[i];
			}
		}
		return maxLengthString;
	}

	public static void main(String[] args) {
		String[] input = {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"};
		System.out.println(new Assignment57().getMaxLengthString(input));
	}
}
