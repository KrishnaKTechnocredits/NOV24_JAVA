package pratik;

public class Assignment12 {

	void evenNumber(int startNum, int endNum) {
		System.out.println("even number is");
		for (; startNum <= endNum; startNum++)
			if (startNum % 2 == 0) {
				System.out.println(startNum);
			}
	}

	public static void main(String[] args) {
		Assignment12 a = new Assignment12();
		a.evenNumber(10, 15);
	}
}
