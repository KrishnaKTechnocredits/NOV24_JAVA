package narendra;
/*
Assignment - 20 : 24th Nov'2024 [20 mins] [IMP]
Find the given character count from given string. 

input : aakanskha, a
output : Count of a in aakanskha is 4.  		 

hint : 
int getCharFreq(String str, char ch){
     return count;
}
*/

public class Assignment_20_ToPrintCharCount {
	
	void printCharInReverse(String strInput, char chrInput) {
		int charCount =0;
		System.out.print("Output1:");
		int strLength = strInput.length();
		for(int index=0; index<strLength; index++) {
			char chr = strInput.charAt(index);
			System.out.print(chr);
			if(chr == chrInput) {
				charCount++;				
			}
		}
		
		System.out.println("\n" + "Count of char " + chrInput + " in " + strInput + " is: " + charCount);	
	
	}

	public static void main(String[] args) {
		Assignment_20_ToPrintCharCount printcharinreverse = new Assignment_20_ToPrintCharCount();
		printcharinreverse.printCharInReverse("aakanskha", 'a');

	}

}