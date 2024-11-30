package akashL;

public class Aakash_Assignment16 {
	
		void method1(int startRange, int endRange) {
			int count=0;
			int sum=0;
			int avg=0;
			
			for(int num=startRange; num<=endRange; num++) {
				if(num%5==0 && num%7==0) {
					System.out.println(num);
					sum=sum+num;
					count++;					
					if(count==3) {
						avg=sum/count;
						break;
					}
				}
			}
			System.out.println("sum of numbers devided by 5 and 7 is : "+sum);
			System.out.println("average of numbers devided by5 and 7 is : "+avg);
		
		}
		
		public static void main(String[] args) {
			Aakash_Assignment16 aakash_Assignment16=new Aakash_Assignment16();
			aakash_Assignment16.method1(1, 210);
		}

}
