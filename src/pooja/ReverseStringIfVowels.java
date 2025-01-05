package pooja;

import java.util.Arrays;

/*input = {"apple","sky","orange","try","eagle"};
 * output =[elppa, sky, egnaro, try, elgae]
 */
public class ReverseStringIfVowels {
	
	String getreveserse(String str) {
		String word ="";
		for(int i=str.length()-1;i>=0;i--) {
			word  = word + str.charAt(i);
		}
		return word;
	}
	
	int vowelscount(String str) {
		int cnt =0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' ||
					str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				cnt++;
			}			
		}
		return cnt;		
	}
	
	void reverseStringIfContainsVowels(String[] input) {
		String[] temp = new String[input.length];
		int cnt = 0;
		for(int i=0;i<input.length;i++) {
			cnt = vowelscount(input[i]);
			if(cnt>1) {
				temp[i] = getreveserse(input[i]);				
			}else {
				temp[i]=input[i];
			}
		}
		System.out.println(Arrays.toString(temp));
	}
	public static void main(String[] args) {
		String[] input = {"apple","sky","orange","try","eagle"};
		ReverseStringIfVowels reverseString = new ReverseStringIfVowels();
		reverseString.reverseStringIfContainsVowels(input);
	}
}