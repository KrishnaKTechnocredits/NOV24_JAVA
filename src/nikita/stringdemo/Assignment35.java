/* return "Upper" if uppercase frequency is higher than lowercase frequency other return "lower".
if both having same freqency then return "same".

input : teChnOcreDits
output : lower
*/

package nikita.stringdemo;

public class Assignment35 {
	
	private String getCharFreq(String str) {
		String result = " ";
		int upperCaseCount = 0;
		int lowerCaseCount = 0;
		for(int i = 0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isLowerCase(ch)) {
				lowerCaseCount++;
			}
			else if (Character.isUpperCase(ch)) {
				upperCaseCount++;
			}
		}
		
		if (lowerCaseCount == upperCaseCount) {
			result = "same";
		} else if (lowerCaseCount > upperCaseCount) {
			result = "lower";
		} else {
			result = "upper";
		}
		return result;
	}

	public static void main(String[] args) {
		Assignment35 a35 = new Assignment35();
		String str = "teChnOcreDits";	
		System.out.println(a35.getCharFreq(str));
	}
}
