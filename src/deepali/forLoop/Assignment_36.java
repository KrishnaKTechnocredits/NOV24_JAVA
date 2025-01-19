package deepali.forLoop;

//Assignment - 36 : 8th Dec [10 mins]
//print table for 1 to 5 numbers.
public class Assignment_36 {
	void getTable(int startIndex, int endIndex) {
		for (int i = startIndex; i <= endIndex; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println("i*j" + "=" + " " + i * j);
			}
			System.out.println("---------------------------");
		}
	}

	public static void main(String[] args) {
		Assignment_36 assignment = new Assignment_36();
		assignment.getTable(1, 5);
	}
}
