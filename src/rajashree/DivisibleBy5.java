//Assignment_16
package rajashree;
class DivisibleBy5{
	
	void printReverseOrder(int startRange,int endRange){
		int count=0;
		System.out.println("Last 5 numbers divisible by 5 is : ");
		for(int num=endRange; num>=startRange; num--){
			if(num%5==0){
			count++;
			System.out.println(num);
			}
			if(count==5){
			break;
			}
		}
	}
	public static void main (String[] args){
		DivisibleBy5 divisibleBy5 = new DivisibleBy5();
		divisibleBy5.printReverseOrder(10,500);
	}
}