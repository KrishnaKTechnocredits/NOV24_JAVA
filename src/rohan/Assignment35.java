package rohan;

public class Assignment35 {

	public static void main(String[] args) {
		Assignment35 assignment = new Assignment35();
		String str =assignment.Frequency("AAB2cBB2BAd2ed3dd");
		System.out.println(str);
	}
	
	int Count(String str,char ch) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==ch) {
				count++;
			}
		}
		return count;
	}
	String Frequency(String str) {
		for(int i=0;i<str.length();i++) {
			int upper=0;
			int lower =0;
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch)) {
				upper++;
			}
			if(Character.isLowerCase(ch)) {
				lower++;
			}
			if(upper>lower) {
				return "upper";
			}else if(lower>upper) {
				return "lower";
			}else {
				return "same";
			}
		}
		return null;
	}

}
