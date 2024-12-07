package prajaktaP.Opps_Assignment;

public class Assignmentt32 {
	int getCharFreq(String str,char ch){
		int count=0;
		int Stringlength=str.length();
		for(int i=0;i<Stringlength;i++){
			if(str.charAt(i)==ch){
				count++;
			}
		}
		return count;
	}

	void freqOfAllChar(String str) {
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			int index=str.indexOf(ch);
			if(i==index) {
			int freOfCount=getCharFreq(str,ch);
			System.out.println("Frequency of character '" + ch + "' is: " + freOfCount);
			}
		}
	}

	public static void main(String[] args){
		Assignmentt32 assignmentt32=new Assignmentt32();
		assignmentt32.getCharFreq("aakanskha",'a');
		assignmentt32.freqOfAllChar("aakanskha");
	}
}
