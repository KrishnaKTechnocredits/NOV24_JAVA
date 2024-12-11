package kishor;
//print the frequency of character in given string "technocredits"

public class Assignment32_Frequency {
	
	int getFrequency(String name,char letter) {
		int count=0;
		for(int i=0;i<name.length();i++) {
			char ch = name.charAt(i);
			if(letter==ch) {
				count++;
			}
		}
		return count;
	}
	void characterCount(String str) {
		for(int k=0;k<str.length();k++) {
			char ch1=str.charAt(k);
			Assignment32_Frequency assignment32 = new Assignment32_Frequency();
			int ans=assignment32.getFrequency(str, ch1);
			int index = str.indexOf(ch1);
			if(k==index) {
				System.out.println("letter " + ch1 +" frequency is:- "+ans);
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment32_Frequency assignment32 = new Assignment32_Frequency();
		assignment32.characterCount("technocredits");
		
		
	}
}
