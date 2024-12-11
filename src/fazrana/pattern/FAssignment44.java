//Assignment - 44 : 8th Dec[15 mins]
//write a logic to print below pattern.
//
//*
//* #
//* # *
//* # * #
//* # * # *

package fazrana.pattern;

public class FAssignment44 {
	void printSeq() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				if (j%2!=0) {
					System.out.print("*"+" ");
				}else {
					System.out.print("#"+" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		FAssignment44 Fassignment44=new FAssignment44();
		Fassignment44.printSeq();
	}
}
