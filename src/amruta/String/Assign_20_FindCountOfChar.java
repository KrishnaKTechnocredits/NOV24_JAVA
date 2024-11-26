/*
 * Assignment - 20 : 24th Nov'2024 [20 mins] [IMP]
Find the given character count from given string. 

input : aakanskha, a
output : Count of a in aakanskha is 4.  		 

hint : 
int getCharFreq(String str, char ch){
     return count;
}
 */

package amruta.String;

public class Assign_20_FindCountOfChar {

	static int getCharFrequency(String str, char ch) {
		int count = 0;
		for (int index = 0; index <= str.length() - 1; index++) {
			if (str.charAt(index) == ch)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		int count = getCharFrequency("aakanskha", 'a');
		System.out.println("Count of a in aakanskha is --> " + count);
	}
}
