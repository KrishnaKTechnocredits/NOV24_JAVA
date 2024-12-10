package vrushali;

//Assignment - 34 : 7th Dec [15 mins]
//print the frequency of all digit characters.
//
//int getCharFreq(String input, char ch){
//	int count = 0;
//	for(int index=0;index<input.length();index++){
//		char currentCh = input.charAt(index);
//		if(ch == currentCh)
//			count++;
//	}
//	return count;
//}
//
//void printFreqOfAllDigitChar(String input){
//	
//	for(int index=0;index<input.length();index++){
//		char ch = input.charAt(index);
//		int charIndex = input.indexOf(ch);
//		if(Character.isDigit(ch) && (charIndex == index)){
//			int count = getCharFreq(ch);
//			System.out.println(ch + "->" + ch);
//		}
//	}	
//}
//
//input : AAB2cBB2BAd2ed3dd
//output : 
//2 -> 3
//3 -> 1

public class FindFrequencyOfDigitsInString {
	
	int getFrequencyOfDigitInString(String str,char ch)
	{
		int frequency=0;
		char currentChar ;
		for(int i=0;i<str.length();i++){
			
			currentChar=str.charAt(i);
			if(currentChar==ch)
			{
				frequency++;
			}
		}
		
		return frequency;
	}
	void printFrequencyOfDigitsInString(String str)
	{
		char ch;
		int frequency=0;
		
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			int index=str.indexOf(ch); //This method gives the first occurence of character in string 
			if((index==i) && (Character.isDigit(ch)))
			{
				frequency=getFrequencyOfDigitInString(str, ch);
				System.out.println(ch+" -> "+frequency);
			}
			
		}
	}
	public static void main(String[] args) {
		
		FindFrequencyOfDigitsInString findFrequencyOfDigitsInString = new FindFrequencyOfDigitsInString();
		findFrequencyOfDigitsInString.printFrequencyOfDigitsInString("AAB2cBB2BAd2ed3dd");
		
	}
}
