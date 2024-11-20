package fazrana;

public class FAssignment13 {
	void div(int startNum, int EndName) {
		System.out.println("Numbers divisible by 3&5-");
		for (;startNum<=EndName;startNum++) {
			if (startNum%3==0 && startNum%5==0) {
				System.out.println(startNum);
			}
		}
	}
	
	public static void main(String[] args) {
		FAssignment13 fassignment13=new FAssignment13();
		fassignment13.div(5, 40);
	}
}
