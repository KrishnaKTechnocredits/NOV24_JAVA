package anuja.anuja_interview;

/*write a logic to print below pattern.

1
2 2
3 3 3
4 4 4 4
*/
public class Assignment42 {

	void printPattern4(int num) {
		int count =0;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(count+i +" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Assignment42 assignment42 = new Assignment42();
		assignment42.printPattern4(4);
	}
}
