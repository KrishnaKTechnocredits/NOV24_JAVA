//Assignment - 35 : 7th Dec [20 mins]
//return "Upper" if uppercase frequency is higher than lowercase frequency other return "lower".
//if both having same freqency then return "same".
//
//input : teChnOcreDits
//output : lower

package fazrana.string;

public class FAssignment35 {
	
	int countUpper=0;
	int countLower=0;
	
	void getFreq(String str) {
		for (int i=0; i< str.length();i++) {
			char ch= str.charAt(i);
			if (Character.isUpperCase(ch)) {
				countUpper++;
			}else if(Character.isLowerCase(ch))
				countLower++;
		}
	}
	
	void displayCase(String str) {
		getFreq(str);
		if (countUpper>countLower) {
			System.out.println("Upper");
		}else if (countUpper<countLower) {
			System.out.println("Lower");
		}else {
			System.out.println("Same");
		}
			
	}
	
	public static void main(String[] args) {
		FAssignment35 fassignment35= new FAssignment35();
		fassignment35.displayCase("teChnOcreDits1234");
	}
}
