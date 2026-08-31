/*Reverse the number without converting them into string:
Input-321*/
package sindhu.assignment102to107;

public class Assignment102 {
	public static void main(String[] args) {
		int num = 321;
		System.out.println("The input number is: "+num);
		new Assignment102().getRevNum(num);
	}
	
	int revnum=0;
	public void getRevNum(int num){
		while(num!=0){
			int digit =num%10;
			revnum= revnum*10+digit;
			num = num/10;
		}
		System.out.println("The reverse of given number is: "+revnum);
	}
}
