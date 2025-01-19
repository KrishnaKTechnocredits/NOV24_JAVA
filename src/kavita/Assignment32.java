package kavita;
/*Assignment32: Find out the frequency of each character in the string*/
/*Time:20m */
public class Assignment32 {
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
		Assignment32 assignment32=new Assignment32();
		assignment32.getCharFreq("Aakansha",'a');
		assignment32.freqOfAllChar("Aakansha");
	}
	
}
