package swapnil;

public class Assignment103 {
	
	int getNum(int num) {
		int revNum = 0;
		while(num!=0) {
			int digit = num % 10;
			revNum = revNum*10 + digit;
			num=num/10;
		}
		
		return revNum;
		
	}
	public static void main(String[] args) {
		Assignment103 a = new Assignment103();
		int num = 1221;
		String str = "naman";
		
		int ans = a.getNum(num);
		if(ans==num) {
			System.out.println(num+"is palindrome number");
		}
		else {
			System.out.println(num+"is not palindrome number");
		}
		StringBuilder a1 = new StringBuilder(str);
		StringBuilder a2 = a1.reverse();
		if(a1.equals(a2.toString())) {
			System.out.println(a1+" is palindrome name");
		}
		else {
			System.out.println(a1+" is palindrome name");
		}
		
	}
	
}
