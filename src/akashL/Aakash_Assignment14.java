package akashL;

public class Aakash_Assignment14 {
	
	void sumOfNum(int startIndex, int endIndex){
			int sum=0;
			int count=0;
			for (int num=startIndex; num<=endIndex; num++) {
				if(num%3==0 && num%5==0) {
					sum=sum+num;
					count++;
					
				}
				
			}
			System.out.println("sum of raange is : "+sum);
			System.out.println("count of numbers are : " +count);
		}
	
	public static void main(String[] args) {
		Aakash_Assignment14 aakash_Assignment14=new Aakash_Assignment14();
		aakash_Assignment14.sumOfNum(1, 70);
	}

}
