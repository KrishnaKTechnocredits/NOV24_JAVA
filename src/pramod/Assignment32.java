/*
Assignment 32 -> Print the frequency of each character given in the string.


0 1 2 3 4 5 6 7 8 9 For loop index values 
p r a m o d m a n e
0 1 2 3 4 5 3 2 8 9 indexOf() values 

*/
package pramod;
class Assignment32 {

	int getFrequencyOfChar(String str, char ch) {
		int count=0;
		for(int i=0; i<str.length(); i++){
			char eachChar = str.charAt(i); 
			if(eachChar==ch) {
				count++;
			}	
		}
		return count;
	}
	
	void printFrequency(String str) {
		System.out.println("Given string is: "+ str);
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			int index = str.indexOf(ch);
			int answer = getFrequencyOfChar(str,ch);
			if(i==index) {
				System.out.println("Frequency of "+ch+ "-> "+answer);
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment32 freqOfChar = new Assignment32();
		String input = "Pramodmane";
		freqOfChar.printFrequency(input);	
	}
}
