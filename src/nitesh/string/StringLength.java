/*Assignment - 21 : 24th Nov'2024 [20 mins]

Find the length of the given string excluding space. 

input : prem lata gupta
output : length without space is 13 and space characters are 2. 
 */
package nitesh.string;

public class StringLength {
	int count;
	int len;

	void getStringLength(String str) {
		for(int i=0;i<=str.length()-1;i++) {
			if(str.charAt(i)== ' ') {
				count++;
			}
		}
		len = str.length()-count;
		System.out.println("length without space is"+" "+len+" "+ "and space characters are"+" " +count);
	}
	public static void main(String[] args) {
		new StringLength().getStringLength("prem lata gupta");
	}
}
