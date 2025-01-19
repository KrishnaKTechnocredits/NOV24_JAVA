package reshma;
/* Return the word having highest digits in the given String .  
  Input : String str = "H2i22 H1ello Techno C2red3i3t4s5";  
  Output : C2red3i3t4s5 */

public class Assignment71_PrintHighestDigitWord {
	int getDigitCount(String str) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index)))
				count++;
			}		
		return count;
	}
	
   String getMaxDigitCount(String str) {
	   String[] arr = str.split(" ");
		int maxCount = 0;
		String maxDigitWord = "";
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			 count =  getDigitCount(arr[i]);
			if (count >= maxCount) {
				maxCount = count;
				maxDigitWord = arr[i];
			}
		}
		return maxDigitWord;
	}
   public static void main(String[] args) {		
	   Assignment71_PrintHighestDigitWord a71 = new Assignment71_PrintHighestDigitWord();
		String str = "H2i22 H1ello Techno C2red3i3t4s5";
		String word = a71.getMaxDigitCount(str);
		System.out.println("The word having highest digits in the given String is: " + word);
	}
}
