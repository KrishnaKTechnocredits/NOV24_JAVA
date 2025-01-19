package mahesh;

public class Assignment_18 {
	static int num;
	int count;

		int getLastNumber (int startRange, int endRange) {
			
			for (int i=endRange; i>=startRange; i--) {
				if (count<1) {
					if (i%5==0) {
						num = i;
						count++;
					}
				}
			}
			return num;
		}
		
		public static void main(String[] args) {
			Assignment_18 assignment = new Assignment_18();
			assignment.getLastNumber(10, 498);
			System.out.println(num +" is the last number which is divisible by 5 in the given range.");
		}
}
