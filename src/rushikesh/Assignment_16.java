package rushikesh;

public class Assignment_16 {

	void printMethod(int startIndex,int endIndex) {
		
		int count=0;
		int sum=0;
		System.out.println("First 3 numbers divisible by 5 and 7 is :");
		for (int num1=startIndex;num1<=endIndex;num1++) {
			if (num1%5==0 && num1%7==0) {
				sum=sum+num1;
				System.out.println(num1);
				count++;
				if(count==3) {
					break;
				}
			}
		}
		
		System.out.println();
		System.out.println("Found "+count+" numbers which are divible by 5 & 7.");
		System.out.println("Toatl sum is= "+sum);
		System.out.println("Average is "+sum/count);
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_16 assognment_16=new Assignment_16();
		assognment_16.printMethod(1,210);
	}

}
