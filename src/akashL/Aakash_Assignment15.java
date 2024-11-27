package akashL;

public class Aakash_Assignment15 {
	
		void method1(int startRange, int endRange) {
			int count=0;
			for(int num=startRange; num<=endRange;num++) {
				if(num%3==0 && num%4==0) {
					System.out.println("number divisible by 3 and 4 are _"+ num);
					if (++count==3){
						break;
					}
					
				}
			}
			
		}
		
		public static void main(String[] args) {
			Aakash_Assignment15 assignment15=new Aakash_Assignment15();
			assignment15.method1(10, 500);
		}

}
