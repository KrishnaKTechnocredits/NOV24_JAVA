package swapnil;

public class Assignment104 {
	
	int armstrongNum(int num) {
		int sum =0;
		while(num>0) {
			int digit = num%10;
			sum = sum +(digit*digit*digit);
			num = num/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Assignment104 a = new Assignment104();
		int num =153;
		int ans = a.armstrongNum(num);
		if(num==ans) {
			System.out.println(num+" is armstrong number");
		}
		else {
			System.out.println(num+" is not armstrong number");
		}
	}
}
