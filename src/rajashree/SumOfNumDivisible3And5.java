//Assignment_14
package rajashree;
class SumOfNumDivisible3And5{
	
	void SumOfNum(int startRange,int endRange){
		int sum=0,count=0;
		for(int num=startRange; num<=endRange; num++){
			if(num%5==0 && num%3==0){
			sum = sum+num;
			count++;
			}
		
		}
		System.out.println("In the range of 1 to 60,calculated sum is " + sum);
		System.out.println("In the range of 1 to 60, " +count+ " numbers are divisible by 3 & 5.");
	}
	public static void main(String [] args){
		SumOfNumDivisible3And5 ex1 = new SumOfNumDivisible3And5();
		ex1.SumOfNum(1,60);
		}
}