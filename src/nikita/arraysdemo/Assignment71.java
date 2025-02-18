/* Assignment - 71 : 5th Jan'2025 [IMP]

return the word having highest digits in the given String .
String str = "H2i22 H1ello Techno C2red3i3t4s5";

output : C2red3i3t4s5*/

package nikita.arraysdemo;

public class Assignment71 {
	
	int getDigitCount(String str) {
		int count = 0;
		for(int i = 0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch)) {
				count++;
			}
		}
		return count;
	}
	
	String displayHighestDigitString(String str)
	{
		String[] arr = str.split(" ");
		String maxString = arr[0];
		int maxCount = 0;
		for(int i = 0; i<arr.length; i++) {
			int count = getDigitCount(arr[i]);
			if(maxCount < count) {
			 maxCount = count;
			 maxString = arr[i];
			}
		}
		return maxString;
	}

	public static void main(String[] args) {
		Assignment71 a71 = new Assignment71();
		String ans = a71.displayHighestDigitString("H2i22 H1ello Techno C2red3i3t4s5");
		System.out.println(ans);
		}
}
