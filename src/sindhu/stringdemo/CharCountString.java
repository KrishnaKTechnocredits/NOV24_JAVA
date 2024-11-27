//Find the given character count from given string.
//aakanskha 

package sindhu.stringdemo;

public class CharCountString {
	int count;
	int getCharCount(String str, char c) {
		for(int i=0; i<=str.length()-1; i++) {
			if(str.charAt(i)== 'a') {
				count++;				
			}
		}
		System.out.println("Count of 'a' in this string is "+count);
		return count;
	}
	
	public static void main(String[] args) {
		CharCountString charCountString = new CharCountString();
		int cnt= charCountString.getCharCount("aakanskha",'a');
		System.out.println(cnt);
	}
}
