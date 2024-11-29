package sachin;

public class Assignment_17 {
		
		void lastNumber(int start, int end) {
			int count=0;
			System.out.println("Last five numbers divisible by 5 is: ");
			for (;start<=end;end--) {
				if (end%5==0) {
					System.out.println(end);
					count++;
					if (count==5) {
						break;
					}
				}
			}
		}
		
		public static void main(String[] args) {
			new Assignment_17().lastNumber(10, 500);
		}
	
	
	
	
}
