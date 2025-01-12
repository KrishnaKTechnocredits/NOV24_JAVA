/*
 * Assignment - 35 : 7th Dec [20 mins]
return "Upper" if uppercase frequency is higher than lowercase frequency other return "lower".
if both having same freqency then return "same".

input : teChnOcreDits
output : lower

 */

package mayur;

public class Assignment35 {
	
	String getCharacterCaseMajority(String str) {
		int uCount=0;
		int lCount=0;
		for (int i = 0;  i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch)) {
				uCount++;
			}else if (Character.isLowerCase(ch)) {
				lCount++;
			}
		}
		if (uCount > lCount) {
			return "Upper";
		}else if (lCount > uCount) {
			return "Lower";
		}else
			return "Same";		
	}
	
	public static void main(String[] args) {
		Assignment35 assign35 = new Assignment35();
		System.out.println(assign35.getCharacterCaseMajority("teChnOcreDits"));
	}
}
