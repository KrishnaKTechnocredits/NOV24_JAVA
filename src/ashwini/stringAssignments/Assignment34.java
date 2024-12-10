package ashwini.stringAssignments;

public class Assignment34 {
	int getCharFreq(String input,char ch) {
		int count=0;
		for(int index=0;index<input.length();index++) {
			char currentch=input.charAt(index);
			if(currentch==ch) {
				count++;
			}
		}
		return count;
	}
	void printFreqOfAllDigit(String input) {
		for(int index=0;index<input.length();index++) {
			char ch= input.charAt(index);
			int charIndex =input.indexOf(ch);
			if (Character.isDigit(ch)&& (charIndex==index)) {
				int count=getCharFreq(input,ch);
				System.out.println("Frequency of digit "+ch+" is " +count);
			}
		}
		
	}

	public static void main(String[] args) {
		Assignment34 a34= new Assignment34();
		a34.printFreqOfAllDigit("AAB2cBB2BAd2ed3dd");

	}

}
