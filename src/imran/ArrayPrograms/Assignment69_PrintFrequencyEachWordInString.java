/*  Assignment - 69 : 5th Jan'2025 [IMP]
Print frequency of each word from given String.

String str = "Hi Hello Hi Hi Hi Techno Credits Techno";

output : 
Hi -> 4
Hello -> 1
Techno -> 2
Credits -> 1
 */

package imran.ArrayPrograms;

public class Assignment69_PrintFrequencyEachWordInString {

	void getFrequecy(String data)
	{
		String[] str= data.split(" ");
		for(int i=0;i<str.length;i++)
		{
			int frequency =0;
			String word = str[i];
			if(!word.equals(""))
			{
				for(int j=0;j<str.length;j++)
				{
					if(word.equals(str[j]))
					{
						frequency++;
						str[j]= "";						
					}
				}
				System.out.println("The String is "+ word +" and frequency is " + frequency);
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment69_PrintFrequencyEachWordInString assignment69_PrintFrequencyEachWordInString_1 = new Assignment69_PrintFrequencyEachWordInString();
		String arr = "Hi Hello Hi Hi Hi Techno Credits Techno";
		assignment69_PrintFrequencyEachWordInString_1.getFrequecy(arr);
	}
}
