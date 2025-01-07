package anuja.array1;
/*
WAP to print the below pattern-
1A
2B 3C
4D 5E 6F 
 * */
public class INterview3_1 {
	
	public void printPattern() {
		int count = 1 ;
		char ch = 'A';
		for(int i = 0 ; i<3 ; i++) {
			for(int j = 0 ;j<=i ;j++ ) {
					System.out.print(count);
					System.out.print(ch +" ");
					count++;
					ch++;
			}
			
			System.out.println();
		}
	}
	public static void main(String[] args) {
		INterview3_1 iNterview3_1 = new INterview3_1();
		iNterview3_1.printPattern();	
}
}
