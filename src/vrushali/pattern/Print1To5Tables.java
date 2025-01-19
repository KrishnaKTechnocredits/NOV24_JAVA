package vrushali.pattern;
//Assignment - 36 : 8th Dec [10 mins]

//print table for 1 to 5 numbers.

public class Print1To5Tables {
	void printTables() {
		for (int i = 1; i <= 5; i++) { 
			System.out.println("Table for "+i);
			for (int j = 1; j <= 10; j++) {
				System.out.println(i+" * "+j+" = "+i * j); 
			}
			System.err.println("---------------------------------------------");
		}
	}

	public static void main(String[] args) {
		Print1To5Tables print1To5Tables = new Print1To5Tables();
		print1To5Tables.printTables();

	}
}
