package ashwini.interview;

/*
 Assignment 102: Reverse a Number Without Using Strings
📥 Input: 321
📤 Output: 123
 */
public class RevNumAssignment102 {
int getRevNum(int num) {
	int	revereseNum= 0;
	while(num!=0) {
		//get last digit
		int digit=num%10;
			revereseNum= revereseNum*10+digit;
			//remove last digit
			num=num/10;
	}
	return revereseNum;
}
public static void main(String[] args) {
RevNumAssignment102 revNum=new RevNumAssignment102();
	int num=321;
	int revNum1= revNum.getRevNum(num);
	System.out.println("Reverse number of "+num+"--> "+revNum1);
	
}
}
