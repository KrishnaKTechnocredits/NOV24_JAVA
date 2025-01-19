/*write a logic to print below pattern.

1
2 3
4 5 6
7 8 9 10*/

package sindhu.StringAssignment;

public class Assignment40 {
	void getPattern() {
		int count=1;
		for(int i=1;i<5; i++) {
			for(int j=1;j<=i; j++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}		
	}
	
	public static void main(String[] args) {
		Assignment40 assign40 = new Assignment40();
		assign40.getPattern();
	}
}
