package ashwini.nestedForLoopAssignment;
/* Write a program to print below pattern
1 1 1 1
2 2 2 2
3 3 3 3
4 4 4 4
5 5 5 5
*/
public class Assignment41 {
	void printPattern() {
		for(int i=1;i<=5;i++){
			for(int j=1;j<=4;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Assignment41 assn41 = new Assignment41();
		assn41.printPattern();
	}

}
