package fazrana;

public class FAssignment15 {
	
	void div(int startNum, int endNum) {
		int count=0;
		System.out.println("First 3 number divisible by 3 & 4-");
		for (;startNum<=endNum;startNum++) {
			if (startNum%3==0 && startNum%4==0) {
				System.out.println(startNum);
				count++;
				if (count==3) {
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		FAssignment15 fassignment15=new FAssignment15();
		fassignment15.div(10, 500);
	}
}
