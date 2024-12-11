package pooja.stringassignments;

public class CapitalCharacterFrequency {

	int getFreqChar(String str, char ch) {
		int cnt = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				cnt++;
			}
		}
		return cnt;
	}

	void printCapitalCahrFrequency(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (i == str.indexOf(str.charAt(i))) {
				if (Character.isUpperCase(str.charAt(i)))
					System.out.println(str.charAt(i) + " -> " + getFreqChar(str, str.charAt(i)));

			}
		}
	}	
	public static void main(String[] args) {
		CapitalCharacterFrequency caital = new CapitalCharacterFrequency();
		caital.printCapitalCahrFrequency("techNNoCredits");
		
	}
}