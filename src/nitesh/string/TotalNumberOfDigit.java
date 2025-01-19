/*Assignment - 22 : 25th Nov'2024 [20 mins]

write a method to return total number of digits from the given input.
print the count in main method.

input : aa1kan33ks4h5a
output : total 5 digits are there in given input.

Hint : boolean Character.isDigit(ch)
 */
package nitesh.string;

class TotalNumberOfDigit{
	static int count;

	int getDigitString(String str){
		for(int i= 0;i<=str.length()-1; i++){
			if(Character.isDigit(str.charAt(i))){
				count++;
			} 
		}return count;
	}
	public static void main (String[] args){
		TotalNumberOfDigit totalnumberofdigit = new TotalNumberOfDigit();
		totalnumberofdigit.getDigitString("aa1kan33ks4h5a");
		System.out.println("total " +count+ " digits are there in given input."); 
	}
}