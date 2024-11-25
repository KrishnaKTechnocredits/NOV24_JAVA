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

package mayur;

public class Assignment20 {
	
	int getCharRepeatCount(String str, char ch) {
		int count=0;
		for (int i = 0; i < str.length();i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}
		System.out.println("Count of "+ch+" in "+str+" is - ");
		return count;
	}
	
	public static void main(String[] args) {
		Assignment20 assign20 = new Assignment20();
		System.out.println(assign20.getCharRepeatCount("aakanksha", 'a'));
	}
}
