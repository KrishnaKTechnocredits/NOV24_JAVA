/*print the frequency of uppercase characters.

input : AABcBBBAdeddd
output : 
A -> 3
B -> 4*/

package sindhu.StringAssignment;

public class Assignment33 {
	
	void getFreqOfUpperChar(String str,char ch) {
		int count=0;
		for(int j=0; j<str.length(); j++) {
			char currentChar = str.charAt(j);
			if(currentChar==ch) {
				if(Character.isUpperCase(currentChar)) {
					count++;
				}else {
					return ;
				}
			}
		}
		System.out.println("Frequecy of Upper case character "+ch+" is "+count);
	}
	
	void getFreqOfChar(String str) {
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			if(i==str.indexOf(ch)) {
				getFreqOfUpperChar(str,ch);
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment33 assign33 = new Assignment33();
		String str = "AABcBBBAdeddd";
		assign33.getFreqOfChar(str);
	}
}
