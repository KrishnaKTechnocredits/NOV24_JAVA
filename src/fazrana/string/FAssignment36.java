//Assignment - 36 : 8th Dec [10 mins]
//print table for 1 to 5 numbers.
//5min
package fazrana.string;

public class FAssignment36 {
	void printTable(int start,int end) {
		for (int i=start;i<=end;i++) {
			for (int j=1;j<=10;j++) {
				System.out.println(i+" * "+j+" = "+ (i*j));
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		FAssignment36 fassignment36=new FAssignment36();
		fassignment36.printTable(1, 5);
	}
}
