/*Print count of uppercase, lowercase, digit, space and special characters in given input string. [20 mins]

Input : "Te4c_hno Credi3ts"
Output : uppercase -> 2
lowercase -> 11
digit -> 2
space -> 1
special char -> 1

Hint : use Character class static methods.
 */
package nitesh.string;
/*Print count of uppercase, lowercase, digit, space and special characters in given input string. [20 mins]

Input : "Te4c_hno Credi3ts"
Output : uppercase -> 2
lowercase -> 11
digit -> 2
space -> 1
special char -> 1

Hint : use Character class static methods.
*/
class PrintUppLowDigSpSpe{
	 int uCount;
	 int lCount;
	 int scount;
	 int spCount;
	 int dCount;
	 int count;
	
	void getStringValues(String str){
		for(int i= 0; i<=str.length()-1;i++ ){
			char ch = str.charAt(i);
			if(Character.isDigit(ch)){
				dCount++;
				
			}
			else if(Character.isUpperCase(ch)){
				uCount++;
			}
			else if(Character.isLowerCase(ch)){
				lCount++;
			}
			else if(ch ==' '){
				scount++;
			}
			else 
				spCount++;
		}
		System.out.println("uppercase -> "+ uCount);
		System.out.println("lowercase -> "+ lCount );
		System.out.println("digit -> "+ dCount);
		System.out.println("space -> "+ scount);
		System.out.println("Special char -> "+ spCount);
	}
	public static void main(String[] args){
		PrintUppLowDigSpSpe printupplowdigspspe = new PrintUppLowDigSpSpe();
		printupplowdigspspe.getStringValues("Te4c_hno Credi3ts");
	}
}