package nitesh.string;
/*Assignment-33
print the freq of each uppercase character.
input : aaKaNKshA
K=2
N=1
A=1
hint : charAt , indexOf
 */
public class UpperCaseFreq {
	int getFreq(String strinput,char chinput){
		int count=0;
		for(int i=0;i<strinput.length();i++){
			char ch = strinput.charAt(i);
			if(chinput==ch && Character.isUpperCase(ch)){
				count++;
			}
		}return count;
	}

	void printUppercaseFreq(String input) {
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			if(Character.isUpperCase(ch) && input.indexOf(ch)==index) {
				int freq = getFreq(input,ch);
				System.out.println("Frequency of UpperCase Character " + ch + " is " +freq);
			}
		}
	}
	public static void main(String[] args) {
		UpperCaseFreq uppercasefreq =new UpperCaseFreq();
		uppercasefreq.printUppercaseFreq("aaKaNKshA");
	}
}
