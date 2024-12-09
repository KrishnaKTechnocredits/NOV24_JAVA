package prajaktaP.Opps;
public class Assignment32 {
	void getFrequencyofString(String str, char ch) {
		int count=0;
		for(int j = 0; j < str.length(); j++) {
			char currentch = str.charAt(j);
			if(currentch==ch){
				count++;
			}
		}
		System.out.println("Freq. of char. "+ch+" in String is: "+ count);
	}

	void getFrequencyOfChar(String str) {
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(i==str.indexOf(ch)) {
				getFrequencyofString(str,ch);
			}
		}
	}

	public static void main(String[] args) {
		String str = "aakanksha";
		Assignment32 assign32 = new Assignment32();
		assign32.getFrequencyOfChar(str);
	}

}
