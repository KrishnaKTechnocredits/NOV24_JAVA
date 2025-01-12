package siddharth;
/*
Assignment - 70 : 5th Jan'2025 [IMP]
Print count of digit in each word.
String str = "H2i22 H1ello Techno C2red3i3t4s5";

output : 
H2i22 -> 3
H1ello -> 1
Techno -> 0
C2red3i3t4s5 -> 5
 */
public class Assignment70 {
	
	void getCountOfDigit(String str) {
		String[] words = str.split(" ");
			for(int i=0;i<words.length;i++) {
				String word = words[i];
				int count=0;
					for(int j=0;j<word.length();j++) {
						char ch = word.charAt(j);
							if(Character.isDigit(ch)) {
								count++;
							}
					}
					System.out.println(word+ " -> " +count);
			}
	}
	
	public static void main(String[] args) {
		Assignment70 assignment70 = new Assignment70();
		String input="H2i22 H1ello Techno C2red3i3t4s5";
		assignment70.getCountOfDigit(input);
	}
}
