package anuja.anuja_interview;

/*
write a logic to print below pattern.

1
1 2
1 2 3
1 2 3 4*/
public class Assignment39 {

	void printPattern1(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Assignment39 assignment39 = new Assignment39();
		assignment39.printPattern1(4);
	}
}