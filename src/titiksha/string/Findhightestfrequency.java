//return "Upper" if uppercase frequency is higher than lowercase frequency other return "lower".
//if both having same freqency then return "same".
//input : teChnOcreDits


package titiksha.string;

public class Findhightestfrequency {
	int uppercount;
	int lowercount;

	void getFrequencyofcharacter(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch) == true) {
				uppercount++;
			} else if (Character.isLowerCase(ch)) {
				lowercount++;
			}
		}
	}

	void getHighestFrequency(String str) {
		getFrequencyofcharacter(str);
		System.out.println("The count of uppercase is : " + uppercount);
		System.out.println("The count of lowercase is : " + lowercount);
		if (uppercount > lowercount) {
			System.out.println("The count of uppercase is high");
		} else if (uppercount < lowercount) {
			System.out.println("The count of lower is high");
		} else if (uppercount == lowercount) {
			System.out.println("The count of uppercase and lowercase is same");
		}

	}

	public static void main(String[] args) {
		Findhightestfrequency findhightestfrequency = new Findhightestfrequency();
		findhightestfrequency.getHighestFrequency("teChnOcreDits");
		//findhightestfrequency.getHighestFrequency("teChnOcreDitsTITIKSHA");
		//findhightestfrequency.getHighestFrequency("teChnOcreDitsTITIKSH");

	}
}
	
	
	

