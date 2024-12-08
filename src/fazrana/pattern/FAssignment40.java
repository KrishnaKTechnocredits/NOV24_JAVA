//Assignment - 40 : 8th Dec[15 mins]
//
//write a logic to print below pattern.
//
//1
//2 3
//4 5 6
//7 8 9 10

//5min

package fazrana.pattern;

public class FAssignment40 {
	void getNumPattern() {
		int count=0; 
		for(int i=1; i<=4;i++) {
			for (int j=1;j<=i;j++) {
				count++;
				System.out.print(count+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		FAssignment40 fassignment40=new FAssignment40();
		fassignment40.getNumPattern();
	}
}
