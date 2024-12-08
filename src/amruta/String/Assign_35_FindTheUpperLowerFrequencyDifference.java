/*
Assignment - 35 : 7th Dec [20 mins]
return "Upper" if uppercase frequency is higher than lowercase frequency other return "lower".
if both having same freqency then return "same".

input : teChnOcreDits
output : lower

if(uCount > lCount)
	return "upper";
else if(lCount > uCount)
   return "lower";
else
   return "same";
*/

package amruta.String;

public class Assign_35_FindTheUpperLowerFrequencyDifference {

	String printFrequencyDifference(String str) {
		int frequencyUpperCharCount = 0;
		int frequencyLowerCharCount = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isUpperCase(ch)) {
				frequencyUpperCharCount++;
			} else if (Character.isLowerCase(ch)) {
				frequencyLowerCharCount++;
			} else {
				System.out.println("Invalid char");
			}
		}
		System.out.println("Frequency of UpperCase character is --> " + frequencyUpperCharCount);
		System.out.println("Frequency of LowerCase character is --> " + frequencyLowerCharCount);

		if (frequencyUpperCharCount > frequencyLowerCharCount)
			return "upper";
		else
			return "lower";
	}

	public static void main(String[] args) {
		Assign_35_FindTheUpperLowerFrequencyDifference a35 = new Assign_35_FindTheUpperLowerFrequencyDifference();
		String str = a35.printFrequencyDifference("teChnOcreDits");
		System.out.println(str + " case count is greater in given string.");
	}
}