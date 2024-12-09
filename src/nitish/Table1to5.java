package nitish;

public class Table1to5 {
	
	void result() {
		for(int i = 1;i<=5;i++) {
			System.out.println("Table of '"+i+"' is ");
			for(int j = 1;j<=10;j++) {
				System.out.print(i*j+" ");
			}
			System.out.println("\n");
		}
	}

	public static void main(String[] args) {
		Table1to5 obj = new Table1to5();
		obj.result();
	}

}
