package pooja.stringassignments;

/*
 * Assignment - 35 : 7th Dec [20 mins]
return "Upper" if uppercase frequency is higher than lowercase frequency other return "lower".
if both having same freqency then return "same".

input : teChnOcreDits
output : lower

if(uCount > lCount)
	return "upper";
else if(lCount > uCount)
   return "lower";
else
   return "same";*/
public class Assignment_35 {

	int getFreqOfChar(String str, char ch) {
		int cnt = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch)
				cnt++;
		}
		return cnt;
	}

	String getUpperLowerOrSamefreqeuency(String str) {
		int upperCount = 0, lowerCount = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (i == str.indexOf(ch)) {
				if (Character.isUpperCase(ch)) {
					int ans = getFreqOfChar(str, ch);
					System.out.println(ch + " - > " + ans);
					upperCount++;
				} else if (Character.isLowerCase(ch)) {
					int ans = getFreqOfChar(str, ch);
					System.out.println(ch + " - > " + ans);
					lowerCount++;
				}
			}
		}
//		System.out.println(upperCount + " " + lowerCount);
		if (upperCount > lowerCount) {
			return "Upper";
		} else if (lowerCount > upperCount) {
			return "Lower";
		} else {
			return "Same";
		}
	}

	public static void main(String[] args) {
		Assignment_35 assignment_35 = new Assignment_35();
		System.out.println(
				"The greater count is " + assignment_35.getUpperLowerOrSamefreqeuency("TeCChnOcreDDits") + " case letters count ");
	}
}