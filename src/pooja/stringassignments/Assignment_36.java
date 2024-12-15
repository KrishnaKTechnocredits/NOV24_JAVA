package pooja.stringassignments;

/*Assignment - 36 : 8th Dec [10 mins]
print table for 1 to 5 numbers.*/
public class Assignment_36 {

	void printTable1To5(int fromValue, int toValue) {
		for (int i = fromValue; i <= toValue; i++) {
			System.out.println("-------- " + i + " Table" + "---------");
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Assignment_36 assignment_36 = new Assignment_36();
		assignment_36.printTable1To5(1, 5);
	}
}