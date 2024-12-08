/*return "Upper" if uppercase frequency is higher than lowercase frequency other return "lower".
if both having same freqency then return "same".

input : teChnOcreDits
output : lower
*/

package sindhu.StringAssignment;

public class Assignment35 {
	
	String getFrequency(String str,char ch) {
		int uCount=0;
		int lCount = 0;
		for(int j=0; j<str.length(); j++) {
			char curntChar = str.charAt(j);
			if(Character.isUpperCase(curntChar)) {
				uCount++;
			}else if(Character.isLowerCase(curntChar)){
				lCount++;
			}
		}
		
		if(uCount>lCount) {
			return "upper";
		}else if(uCount<lCount) {
			return "Lower";
		}else {
			return "same";
		} 
	}
	
	String callGetFreq(String str) {
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(i==str.indexOf(ch)) {
				String returnOp = getFrequency(str,ch);
				return returnOp;
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		Assignment35 assign35 = new Assignment35();
		String str = "teChnOcreDits";
		String output = assign35.callGetFreq(str);
		System.out.println(output);
	}
}
