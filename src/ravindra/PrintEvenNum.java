//Assignment12
package ravindra;

public class PrintEvenNum {
	void printEvenNum(int startIndex,int endIndex) {
		System.out.println("Even numbers are ");
		for(int num=startIndex;num<=15;num++) {
			if(num%2==0) {
				System.out.println(num);
			}
		}
	}
	
	public static void main(String[] args) {
		PrintEvenNum printEvenNum=new PrintEvenNum();
		printEvenNum.printEvenNum(10, 15);
	}
}
