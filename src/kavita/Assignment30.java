package kavita;
/*Assignment - 30 
Sum of all the even digits present in a given String. 
input : "te1ch2no3cre7dits"
output : 2

input : "techno"
output : 0

input : "4563"
output : 10*/
/*Time: 8m*/
public class Assignment30 {
	int sum;
	int getSumOfEvendigits(String str) {
		sum=0;
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(Character.isDigit(ch)){
				int digit=Character.getNumericValue(ch);
				if(digit%2==0) {
					sum=sum+digit;
				}
			}
		}
		System.out.println("Sum of even digits "+sum);
		return sum;
	}
	public static void main(String[] args) {
		Assignment30 assignment30=new Assignment30();
		assignment30.getSumOfEvendigits("te1ch2no3cre7dits");
		assignment30.getSumOfEvendigits("techno");
		assignment30.getSumOfEvendigits("4563");
	}
}

	

