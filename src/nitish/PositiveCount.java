package nitish;

public class PositiveCount {
	
	void output() {
		int[] num = {5,10,15,-20,25,-30,35,-40};
		int count = 0;
		System.out.println("Positive numbers are --");
		for(int i = 0;i<num.length;i++) {
			int num2 = num[i];
			
			if(num2>=0) {
				System.out.println(num2);
				count++;
				
			}
		}
		System.out.println("\nThe count of positive numbers is --> "+count);
	}

	public static void main(String[] args) {
		PositiveCount obj = new PositiveCount();
		obj.output();

	}

}
