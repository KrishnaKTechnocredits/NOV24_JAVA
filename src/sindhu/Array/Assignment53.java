/*print the array in reverse order. 

input : {10,34,22,16,19,99}
output : 99
         19
		 16
		 22
		 34
		 10 */

package sindhu.Array;

public class Assignment53 {
	
	int[] getRevArr(int[] input) {
		int[] output = new int[input.length];
		for(int i=input.length-1,j=0; i>=0; i--,j++) {
			output[j]=input[i];
			//System.out.println(output[j]);
		}
		return output;
	}
	
 public static void main(String[] args) {
	 Assignment53 assi53 = new Assignment53();
	 int[] input = {10,34,22,16,19,99};
	 int[] output = assi53.getRevArr(input);
	 System.out.println("reverse of given array: "+output[0]+" "+output[1]+" "+output[2]+" "+output[3]+" "+output[4]+" "+output[5]);
 }
}
