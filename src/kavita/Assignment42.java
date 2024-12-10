package kavita;
/*write a logic to print below pattern.

1
2 2
3 3 3
4 4 4 4
Time: 4min*/
public class Assignment42 {
	void printNumPattern() {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment42 assignment42=new Assignment42();
		assignment42.printNumPattern();
	}
}
