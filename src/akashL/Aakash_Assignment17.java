package akashL;

public class Aakash_Assignment17 {
	
		void method1(int startRange, int endRange) {
			int  count=0;
			for(int num=endRange; num>=startRange; num--) {
				if(num%5==0) {
					System.out.println(num);
					count++;
					
					if(count==5) {
						break;
					}					
				}
			}			
		}
		
		public static void main(String[] args) {
			Aakash_Assignment17 aakash_Assignment17=new Aakash_Assignment17();
			aakash_Assignment17.method1(10, 500);
		}
}