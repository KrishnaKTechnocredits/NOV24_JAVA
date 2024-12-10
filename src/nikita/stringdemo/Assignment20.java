/* Assignment - 20 : 24th Nov'2024 [20 mins] [IMP]
Find the given character count from given string. 

input : aakanskha, a
output : Count of a in aakanskha is 4.  		 

hint : 
int getCharFreq(String str, char ch){
     return count;
}
*/

package nikita.stringdemo;

public class Assignment20 {
	int getCharFreq(String str, char ch) {
		int count=0;
		for (int i = 0; i<str.length(); i++)
		{
			if(str.charAt(i) == ch) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Assignment20 a20 = new Assignment20();
		int charCount = a20.getCharFreq("techno credits november", 'e');
		System.out.println("Count of character in given string is: " + charCount);

	}

}
