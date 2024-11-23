//Assignment15
package rajashree;
class DivisibleBy3And4{
	void printFirst3Number(int startRange,int endRange){
		int count=0;
		System.out.println("First 3 numbers divisible by 3 and 4 is : ");
		for (int num=startRange;num<=endRange;num++){
			if(num%3==0 && num%4==0){
				count++;
				System.out.println(num);
				}
				if(count==3){
				break;
				}
			}
		}
	
	public static void main(String[] args){
		DivisibleBy3And4 ex1 = new DivisibleBy3And4();
		ex1.printFirst3Number(1,500);
	}
}