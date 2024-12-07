// Assignment32 Print the frequency of capital letter.

package pramod;
class Assignment33 {
	
	void printFreqOfCapitalChar(String str) {
		int answer=0;
		System.out.println("Given string is: "+str);
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			int index = str.indexOf(ch);
			if(i==index){
			
			if(Character.isUpperCase(ch)) {
					answer = getCountofFrequency(str,ch);
					System.out.println("Capital char "+ch+"->"+answer);
			}
		//	System.out.println("Capital char"+ch+"->"+answer);
			}
			//System.out.println("Capital char"+ch+"->"+answer);
		}
		//System.out.println("Capital char"+ch+"->"+answer);
	}
	
	int getCountofFrequency(String str, char letter) {
		int count=0;
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch==letter){
				count++;
			}
		}
		return count;
		
	}
	
	public static void main(String[] args) {
		Assignment33 freqOfCapital = new Assignment33();
		String input = "PramodManePM";
		freqOfCapital.printFreqOfCapitalChar(input);
		
		
	}

}