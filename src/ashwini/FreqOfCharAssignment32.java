package ashwini;

//Assignment32-->Find count of each character in the given string :input -aakansha

public class FreqOfCharAssignment32 {

	int freqOfChar(String str,char letter) 
	{
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(letter==ch) {
				count++;
			}
		}
		return count;
	}
		
		void printFreqOfChar(String input) {
			for(int j=0;j<input.length();j++) {
				char ch1=input.charAt(j);
				FreqOfCharAssignment32 assn32=new FreqOfCharAssignment32();
				int ans= assn32.freqOfChar(input, ch1);
				int index = input.indexOf(ch1);
				if(j==index) {
				System.out.println("Letter " +ch1 + " frequency is " + ans);
				}
		}
		}	
			
	     public static void main(String[] args) {
		FreqOfCharAssignment32 assn32 = new FreqOfCharAssignment32();
		assn32.printFreqOfChar("aakanksha");
		
	}

}
