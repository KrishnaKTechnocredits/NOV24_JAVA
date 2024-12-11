//Assignment - 36 : 8th Dec [10 mins]
//print table for 1 to 5 numbers.

package harshada.Nestedloop;

public class Tables1to10 {
	
	void printTables1tp10() {
		for(int i=1;i<=5;i++) {
			for (int j=1; j<=10;j++) {
				System.out.println(i*j);
			}
			System.out.println("----------------------");
		}
	}
	
	public static void main(String[] args) {
		Tables1to10 tables1to10=new Tables1to10();
		tables1to10.printTables1tp10();
	}
}
