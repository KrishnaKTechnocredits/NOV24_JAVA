package rohan;

public class Assignment36 {

	public static void main(String[] args) {
		Assignment36 assignment = new Assignment36();
		assignment.table();
	}
	void table() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=10;j++) {
				System.out.println(i+" * "+j+" = "+i*j );
			}
			System.out.println("-----------------");
		}
	}

}
