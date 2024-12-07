package anuja.string;

/*count frequency of lower, upper, same and return which one is more or same*/
public class Assignment35 {
	int upperCount =0;
	int lowerCount =0;

	public int getFrequencyOfAllChar(String str, char ch) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (ch == str.charAt(i)) {
				count++;
			}
		}
		return count;
	}

	public int getCountOfUpperCase(String str) {
		upperCount = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(str.charAt(i)) && i == str.indexOf(ch)) {
				upperCount = upperCount+getFrequencyOfAllChar(str, ch);
			}
		}
		// System.out.println(upperCount);
		System.out.println("Upper case count is: " +upperCount);
		return upperCount;

	}

	public int getCountOfLowerCase(String str) {
		lowerCount = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isLowerCase(str.charAt(i)) && i == str.indexOf(ch)) {
				lowerCount = lowerCount +getFrequencyOfAllChar(str, ch);
			}

		}
		System.out.println("Lower case count is: "+ lowerCount);
		return lowerCount;

	}

	public void printCount() {
		if (upperCount > lowerCount) {
			System.out.println("Upper case char are more \n");
		} else if (upperCount < lowerCount) {
			System.out.println("Lower case char are more \n");
		} else
			System.out.println("Equal");

	}
	
	public static void main(String[] args) {
		Assignment35 assignment35 = new Assignment35();
		
		assignment35.getCountOfLowerCase("teChnOcreDits");
		assignment35.getCountOfUpperCase("teChnOcreDits");
		assignment35.printCount();
	}
}
		