package akashL;

public class Aakash_Assignment13 {
	
		void method1(int startIndex, int endIndex){
			
			for (int index=startIndex; index<=endIndex;index++) {
				if (index%3==0 && index%5==0) {
				System.out.println(index);
				}
			}
		}
		
		public static void main(String[] args) {
			Aakash_Assignment13 aakash_Assignment13=new Aakash_Assignment13();
			aakash_Assignment13.method1(5, 40);
		}
}
