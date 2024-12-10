package kavita;
/*print the frequency of all digit characters.
 * input : AAB2cBB2BAd2ed3dd
output : 
2 -> 3
3 -> 1
Time: 10m*/
public class Assignment34 {
	int getCharFreq(String str,char ch) {
		int count=0;
		int stringlength=str.length();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==ch) {
				count++;
			}
			
		}
		//System.out.println("Freq of "+ch+"is"+count);
		return count;
		
	}
	
	void printFreqOfDigit(String str) {
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			int index=str.indexOf(ch);
			if(Character.isDigit(ch)&&i==index) {
				int freqOfcount=getCharFreq( str,ch);
				 System.out.println("Frequency of character '" + ch + "' is: " + freqOfcount);
			 }
		
			
			}
			
		}
	
	public static void main(String[] args) {
		Assignment34 assignment34=new Assignment34();
		//assignment34.getCharFreq("AAB2cBB2BAd2ed3dd",'2');
		assignment34.printFreqOfDigit("AAB2cBB2BAd2ed3dd");
	}
}
