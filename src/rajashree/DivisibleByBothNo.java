//Assignment13
package rajashree;
class DivisibleByBothNo{
	void divBy5And3(int startRange,int endRange){
		System.out.println("Divisible by 5 & 3, numbers are:");
		for(int num=startRange;num<=endRange;num++){
			if(num%5==0 && num%3==0)
			System.out.println(num);
		}
	}
	public static void main(String[] args){
		DivisibleByBothNo divisibleByBothNo = new DivisibleByBothNo();
		divisibleByBothNo.divBy5And3(5,40);
	}
}