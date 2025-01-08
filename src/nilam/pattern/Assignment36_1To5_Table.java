package nilam.pattern;
//print table for 1 to 5 numbers.

/*
public class Assignment36_1To5_Table {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for (int j=1;j<=10;j++) {
				System.out.println(i*j);
			}
		}
	}

}
*/

public class Assignment36_1To5_Table {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			for (int j=1;j<=5;j++) {
				System.out.print(i*j + "\t");
			}System.out.print("\n");
		}
	}

}
