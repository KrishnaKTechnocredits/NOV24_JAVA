//Assignment - 34 : 7th Dec [15 mins]
//print the frequency of all digit characters.
package pramod;
class Assignment34{
	
	int getFrequency(String str, char ch){
		int count=0;
		for(int i=0 ; i<str.length(); i++){
			char currentch=str.charAt(i);
			if(ch==currentch)
				count++;
		}
		return count;	
	}
	
	void printDigitFrequency(String str){
		System.out.println("Given string is: "+str);
		int answer=0;
		for(int i=0; i<str.length(); i++){
			char ch=str.charAt(i);
			int index = str.indexOf(ch);
			if(Character.isDigit(ch)&&i==index){
				answer=getFrequency(str,ch);
				System.out.println("Frequency of Digit "+ch+"-> "+answer);
			}
		}
	}
	
	public static void main(String[] args){
		Assignment34 digitfrq = new Assignment34();
		String input = "Pramodmane11223";
		digitfrq.printDigitFrequency(input);
	}
}