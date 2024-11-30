package vrushali;

//Assignment - 20 : 24th Nov'2024 [20 mins] [IMP]
//Find the given character count from given string. 
//
//input : aakanskha, a
//output : Count of a in aakanskha is 4.  		 
//
//hint : 
//int getCharFreq(String str, char 
//     return count;
//}

public class FindCharCountInString {

	int getCharFrequencyInString(String str, char ch) {
		int count = 0;

		for (int num = 0; num < str.length(); num++) {
			if (ch == str.charAt(num)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		FindCharCountInString findCharCountInString = new FindCharCountInString();
		
		String str="aakanskha";
		char ch='a';
		int num = findCharCountInString.getCharFrequencyInString(str, ch);

		System.out.println(ch+" occures in string "+str+" "+num +" times");
	}
}
