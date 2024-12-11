package anuja.anuja_interview;

/*write a logic to print below pattern.

1 1 1 1
2 2 2 2
3 3 3 3
4 4 4 4
5 5 5 5*/
public class Assignment41 {

	void printPattern2(int num) {
		for(int i=1;i<=num;i++) {
			for(int j=1; j<num;j++) {
				System.out.print(i + " ");
			}
			
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Assignment41 assignment41 = new Assignment41();
		assignment41.printPattern2(5);
	}
}
