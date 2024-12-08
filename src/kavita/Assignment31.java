package kavita;
/*Assignment - 31 : 2nd Dec'2024 [15 mins]
return the difference of Sum of all the odd digits and even digits present in a given String. 
HINT : sum of odd digits - sum of even digits

input : "te1ch2no3cre7dits"
output : 9

input : "4563"
output : -2*/
/*Time: 10m*/
public class Assignment31 {
	int differenceOfSum(String str) {
		int evenSum=0;
		int oddSum=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isDigit(ch)) {
				int digit=Character.getNumericValue(ch);
				if(digit%2==0) {
					evenSum=evenSum+digit;
					}else {
						oddSum=oddSum+digit;
					}
				}
			}
			//Difference=sum of odd digits - sum of even digits
			int diff=oddSum-evenSum;
		
		System.out.println("Difference between oddsum and evensum "+diff);
		return oddSum-evenSum;
		
		}
	
		public static void main(String[] args) {
			Assignment31 assignment31=new Assignment31();
			assignment31.differenceOfSum("te1ch2no3cre7dits");
			assignment31.differenceOfSum("4563");
		}
	}


