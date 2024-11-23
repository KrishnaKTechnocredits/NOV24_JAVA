//Assignment_16
package rajashree;
class DivisibleBy5And7{
	
	void printSumAndAvg(int startRange,int endRange){
		int sum=0;
		int avg=0;
		int count=0;
		System.out.println("Numbers are ,");
		for(int num=startRange; num<=endRange;num++){
			if(num%5==0 && num%7==0){
				System.out.println(num);
				sum= sum+num;
				count++;
			}
			if(count==3){
			avg = sum / count;
			break;
			}
		
		}
		System.out.println("Found " +count+ "numbers which are divible by 5 & 7.");
		System.out.println("Sum = " + sum);
		System.out.println("Avg = " + avg);
	}
	public static void main (String[] args){
		DivisibleBy5And7 ex1 = new DivisibleBy5And7();
		ex1.printSumAndAvg(1,210);
	}
}