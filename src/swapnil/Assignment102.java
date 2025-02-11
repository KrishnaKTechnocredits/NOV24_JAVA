package swapnil;

public class Assignment102 {
	
	int getRevNum(int num) {
	int revNum =0;
	while(num!=0) {
	int digit = num % 10;
	revNum = revNum*10 + digit;
	num=num/10;
	}
	return revNum;
	}
	
	public static void main(String[] args) {
		Assignment102 a = new Assignment102();
		int num = 321;
		int ans = a.getRevNum(num);
		System.out.println(num+"->"+ans);
	}
}
