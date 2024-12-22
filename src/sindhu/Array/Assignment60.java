/*return second maximum number from given array.

input = {33,33,19,55,53,11};
output : 53 */

package sindhu.Array;

public class Assignment60 {
	
	int getSecMaxNum(int[] ip) {
		int MaxNum = ip[0];
		int SecMaxNum = ip[1];
		
		if(SecMaxNum>MaxNum) {
			MaxNum = ip[1];
			SecMaxNum = ip[0];
		}
		
		for(int i=2; i<ip.length; i++) {
			if(ip[i]>MaxNum) {
				SecMaxNum = MaxNum;
				MaxNum = ip[i];
			}else if(ip[i]>SecMaxNum) {
				SecMaxNum = ip[i];
			}			
		}
		return SecMaxNum;
	}
	
	public static void main(String[] args) {
		int[] input = {33,33,19,55,53,11};
		Assignment60 assign60  = new Assignment60();
		int SecMaxNum = assign60.getSecMaxNum(input);
		System.out.println("Second Max Num in given array is: "+SecMaxNum);
	}
}
