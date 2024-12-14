package anuja.anuja_interview;
/*
1A 
2B 3C 
4D 5E 6F 
7G 8H 9I 10J
*/
public class Pattern3 {

	int count = 0 ; 
	char ch = 'A';
	
	public void printPattern() {
		for(int i = 1; i<=4 ; i++) {
			for(int j=1;j<=i;j++) {
				count++;
				System.out.print(count);
				System.out.print(ch +" ");
				ch++;
			}
		System.out.println();	
		}
	}
	public static void main(String[] args) {
		Pattern3 a  = new Pattern3();
		a.printPattern();
	}
}
