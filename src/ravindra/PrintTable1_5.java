package ravindra;

public class PrintTable1_5 {
	void tablePrint1__5() {
		for(int i=1;i<=5;i++) {
			for(int innerIndex=1;innerIndex<=10;innerIndex++) {
				System.out.println(i*innerIndex);
			}
			System.out.println("-------------------------");
		}
	}
	
	public static void main(String[] args) {
		PrintTable1_5 printTable1_5=new PrintTable1_5();
		printTable1_5.tablePrint1__5();
	}
}
