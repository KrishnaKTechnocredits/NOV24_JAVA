package nilam.pattern;
/*
write a logic to print below pattern.

1
2 2
3 3 3
4 4 4 4
*/

public class Assignment42_Pattern5 {
	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print(i);
			}System.out.print("\n");
		}
	}
}
