package reshma;
// print table for 1 to 5 numbers.

public class Assignment36_Table {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=10;j++) {
				int num=i*j;
				System.out.println(i+ "*" +j+  " = " +num);
			}
			System.out.println("------------------");
		}
	}
}
