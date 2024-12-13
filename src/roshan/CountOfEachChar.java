package roshan;


//Note:- By separating these functionalities, your code remains modular, reusable, and easier to manage. If you have any more questions or need further clarification

public class CountOfEachChar {
	int getCharCount(String str, char ch) {                  //Handles counting occurrences of a specific character
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char currentch = str.charAt(i);                 //hold each character of the string str as we iterate through it.
			if (currentch == ch) {
				count++;

			}

		}
		return count;
	}
	void printFrequencyOfAllCharacter(String input) {     //Manages printing the frequencies of all characters in the input string.
		input= input.toLowerCase();                       //give new string give character in lower case
		for(int j=0 ;j< input.length();j++) {
			char c = input.charAt(j);                     //hold each character of the string str as we iterate through it
			int indexCount = getCharCount(input, c);      //to get the frequency of each character in the string by calling getCharCount.
			if(j==input.indexOf(c)) {                     //checks if the current index j is equal to the index of the first occurrence of the character c in the string input
				System.out.println("index for "+ c+" in "+input+" is "+ indexCount);
			}
			
		}
		
	}
	public static void main(String[] args) {
		CountOfEachChar countofeachchar= new CountOfEachChar();
		countofeachchar.printFrequencyOfAllCharacter("AAkansha");
	}

}


































/*
 * V.imp Assignment 32: Find count of each character in the given string :input
 * -Technocredits //logic of the program: //we need to count of selected
 * character in the string //we need to run loop so that it will perform same
 * task for all characters in the string using string class index of method.
 */