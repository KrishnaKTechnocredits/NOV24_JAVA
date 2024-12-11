package reshma;
/* return "Upper" if uppercase frequency is higher than lowercase frequency other return "lower".
if both having same freqency then return "same".

input : teChnOcreDits
output : lower */

public class Assignment35_PrintFreqOfChar {
	String printFreqOfChar(String input) {
		int Ucount = 0;
		int Lcount = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isUpperCase(ch)) {
				Ucount++;
			}
			if (Character.isLowerCase(ch)) {
				Lcount++;
			}
		}

			if (Ucount > Lcount) {
				return "Upper";
			} else if (Lcount > Ucount) {
				return "Lower";
			}else {
				return "Same";
			}
		}	

	public static void main(String[] args) {
		Assignment35_PrintFreqOfChar a35 = new Assignment35_PrintFreqOfChar();
		String input = a35.printFreqOfChar("teChnOcreDits");
		System.out.println(input);
		
		/*input = a35.printFreqOfChar("TECHNO");
		System.out.println(input);
		
		input = a35.printFreqOfChar("TEChno");
		System.out.println(input);*/
	}
}
