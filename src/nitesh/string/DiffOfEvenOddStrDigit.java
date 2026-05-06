package nitesh.string;
/*Assignment-31
return the difference of Sum of all the odd digits and even digits present in a given String. 
HINT : sum of odd digits - sum of even digits

input : "te1ch2no3cre7dits"
output : 9

input : "4563"
output : -2
 */
public class DiffOfEvenOddStrDigit {
	int sumOdd;
	int sumEven;
	int sumDiff;

	int sumOfEvenOdd(String str){
		sumEven = 0;
		sumOdd =0;
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			if(Character.isDigit(ch)){
				int digit = Character.getNumericValue(ch);
				if(digit % 2 ==0){
					sumEven+=digit;  
				}else
					sumOdd+=digit;
			}
		}
		sumDiff = sumOdd-sumEven;
		System.out.println("Difference between oddsum and evensum "+sumDiff);
		return sumDiff;
	}

	public static void main(String[] args){
		DiffOfEvenOddStrDigit doeosd = new DiffOfEvenOddStrDigit();
		doeosd.sumOfEvenOdd("te1ch2no3cre7dits");
		doeosd.sumOfEvenOdd("4563");
	}

}
