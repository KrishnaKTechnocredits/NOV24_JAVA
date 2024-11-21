//Assignment 13
package ravindra;

public class NumDivBy5And3 {
	void numDivision(int startIndex,int endIndex) {
		System.out.println("Divisible by 5 & 3, numbers are:");
		for(int num=startIndex;num<=endIndex;num++) {
			if(num%5==0 && num%3==0) {
				System.out.println(num);
			}
		}
	}
	
	public static void main(String[] arg) {
		NumDivBy5And3 numDivBy5And3=new NumDivBy5And3();
		numDivBy5And3.numDivision(5, 40);
	}
}
