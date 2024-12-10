package kavita;
/*print the frequency of uppercase characters.
input : AABcBBBAdeddd
output : 
A -> 3
B -> 4*/
/*Time:10m */
public class Assignment33 {
	int getFreqOfChar(String str,char ch) {
			int count=0;
			int Stringlength=str.length();
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)==ch) {
				count++;
				}
				
			}
			return count;
			//System.out.println("Frequency of "+ch+"->"+count);
	}
	
	void getFeqOfUpperChar(String str) {
			for(int i=0;i<str.length();i++) {
				 char ch=str.charAt(i);
				 int index=str.indexOf(ch);
					 if(Character.isUpperCase(ch)&& i==index) {
						 int freqOfcount=getFreqOfChar( str,ch);
						 System.out.println("Frequency of character '" + ch + "' is: " + freqOfcount);
					 }
				
				 }
			}
	
	
	
	public static void main(String[] args) {
		Assignment33 assignment33=new Assignment33();
		assignment33.getFeqOfUpperChar("AABcBBBAdeddd");
	}

}
