package kishor;

public class Assignment36_printTable {
	
	void printTable() {
		for(int i=1;i<=5;i++) {
			for(int k=1;k<=10;k++) {
				System.out.println(i+"*"+k+"="+i*k);
			}
			System.out.println("-----------------------------");
		}
	}
	
	public static void main(String[] args) {
		Assignment36_printTable assignment36 = new Assignment36_printTable();
		assignment36.printTable();
	}
}
