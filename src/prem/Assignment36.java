package prem;

public class Assignment36 {
	
	void table1To5() {
		for(int i=1;i<=5;i++) {
			for (int j=1;j<=10;j++) {
			System.out.println(i +" * " +j + "="+ i*j);
			System.out.println("--------------------------------");
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment36 assign36 = new Assignment36();
				assign36.table1To5();
	}

}
