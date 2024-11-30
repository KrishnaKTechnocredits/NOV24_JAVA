package fazrana;

public class FAssignment12 {
	
	void evenNumber(int startNum, int endNum) {
		System.out.println("Even numbers are-");
		for (;startNum<=endNum;startNum++) {
			if(startNum%2==0) {
				System.out.println(startNum);
			}
		}
	}
	
	public static void main(String[] args) {
		FAssignment12 fassignment12=new FAssignment12();
		fassignment12.evenNumber(10, 15);
	}
}
