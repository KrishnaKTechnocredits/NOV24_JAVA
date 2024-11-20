package akashL;

public class Aakash_Assignment12 {
	
		void method1(int startRange, int endRange) {
			
			for(int num=startRange; num<=endRange; num++) {
				if (num%2==0) {
					System.out.println(num);	
				}
			}
		}
		
		public static void main(String[] args) {
			Aakash_Assignment12 aakash_Assignment12=new Aakash_Assignment12();
			aakash_Assignment12.method1(10, 15);
		}

}
