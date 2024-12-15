package ashwini.nestedForLoopAssignment;
//Assignment36-->print 1-5
public class Assignment36 {
	void printTable() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=10;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println("--------------------------");
		}
	}
	public static void main(String[] args) {
		Assignment36 a36=new Assignment36();
		a36.printTable();

	}

}
