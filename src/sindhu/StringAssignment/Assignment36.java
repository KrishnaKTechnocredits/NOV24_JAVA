/*print table for 1 to 5 numbers.*/

package sindhu.StringAssignment;

public class Assignment36 {
	
	void getTableOf5(int startRange, int endRange) {
		for(int i=startRange; i<=endRange; i++) {
			for(int j=startRange; j<=10; j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
			System.out.println("---------");
		}
	}
	
	 public static void main(String[] args) {
		 Assignment36 assign36 = new Assignment36();
		 assign36.getTableOf5(1,5);
			
	}
}
