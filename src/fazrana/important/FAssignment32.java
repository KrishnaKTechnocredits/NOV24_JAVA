//get instance of each character
package fazrana.important;

public class FAssignment32 {
	int getCharCount(String str,char ch) {
		int count=0;
		for (int i=0;i< str.length();i++) {
			char chr= str.charAt(i);		
			if (chr==ch) {
				count++;
			}
		}return count;
	}
	
	void printFreqOfAllChar(String input) {
		input= input.toLowerCase();
		for (int j=0;j<input.length();j++) {
			char c= input.charAt(j);
			int indexCount=getCharCount(input, c);
			if (j== input.indexOf(c))
				System.out.println("index for "+ c+" in "+input+" is "+ indexCount);
		}
	}
	
	public static void main(String[] args) {
		FAssignment32 fassignment32=new FAssignment32();
		fassignment32.printFreqOfAllChar("Aakansha");
	}
}
