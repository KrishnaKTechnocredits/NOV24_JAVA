package pratiksha;

public class Assignment32 {

	int getCharFreq(String str,char ch) {
		int count=0;
		int Stringlength=str.length();
		for(int i=0; i<Stringlength;i++) {
			if(str.charAt(i)==ch) {
				count++;
			}
		}
		return count;
	}
	void freqAllChar(String str) {
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			int index=str.indexOf(ch);
			if(i==index){
				int freqOfCount=getCharFreq(str,ch);
				System.out.println("Frequency of character " +ch+ " is: " +freqOfCount);
				
			}
			
		}
	}
		public static void main(String[]args){
			Assignment32 assig32=new Assignment32();
			assig32.getCharFreq("Aakansha", 'a');
			assig32.freqAllChar("Aakansha");
		}
	}

