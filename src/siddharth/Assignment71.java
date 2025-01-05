package siddharth;
/*
Assignment - 71 : 5th Jan'2025 [IMP]
return the word having highest digits in the given String .
String str = "H2i22 H1ello Techno C2red3i3t4s5";

output : C2red3i3t4s5
*/
public class Assignment71 {
	
	String getHighestDigitsWord(String str) {
		String[] words = str.split(" ");
		int maxCount=0;
		String maxDigit="";
			for(int i=0;i<words.length;i++) {
				String word = words[i];
				int count=0;
					for(int j=0;j<word.length();j++) {
						char ch = word.charAt(j);
							if(Character.isDigit(ch)) {
								count++;
							}
					}
					if (count>maxCount) {
						maxCount=count;
						maxDigit=word;
					}
			}
		return maxDigit;
	}
	public static void main(String[] args) {
		Assignment71 assignment71 = new Assignment71();
		String input = "H2i22 H1ello Techno C2red3i3t4s5";
		String ans = assignment71.getHighestDigitsWord(input);
		System.out.println("output : "+ans);
	}

}
