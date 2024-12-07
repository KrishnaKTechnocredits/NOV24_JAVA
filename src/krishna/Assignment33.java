package krishna;

import AssignmentDemoCode.Demo_Assignment33;

public class Assignment33 {

	int getCharFreq(String str , char ch) {
		int charCount= 0;
		for(int i = 0; i<str.length();i++) {
			if(str.charAt(i)== ch) {
				charCount++;
			}
		}
		return charCount;
	}
	
	void printEachCharFreq(String str) {
		for(int i = 0;i<str.length();i++) {
			if(str.indexOf(str.charAt(i)) == i) {
				if(Character.isUpperCase(str.charAt(i))) {
					System.out.println("freq of char "+ str.charAt(i) + " in the given string is : " + getCharFreq(str, str.charAt(i)));
				}
			}
		}
	}

	void processData(String str) {
		int charCount = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.indexOf(str.charAt(i)) == i) {
				for (int j = 0; j < str.length(); j++) {
					if (str.charAt(i) == str.charAt(j)) {
						if (Character.isUpperCase(str.charAt(i))) {
							charCount++;
						}
					}
				}
				System.out.println(
						"freq of upper case character : " + str.charAt(i) + " in a given string is -> " + charCount);
				charCount = 0;
			}
		}
	}

	public static void main(String[] args) {
		Assignment33 demo = new Assignment33();
		demo.printEachCharFreq("AABcBBBAdeddd");
		System.out.println();
		demo.processData("AABcBBBAdeddd");
	}
}
