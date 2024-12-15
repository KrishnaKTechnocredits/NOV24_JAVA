package nilam.loop;

public class Assignment14_count_Sum {
	
	void sumOfNum(int startNum, int endNum){
		int num=startNum;
		int sum=0,count=0;
		for(;num<=endNum;num++) {
			sum=sum+num;
			count++;
		}
		
		System.out.println("Between range " +startNum+ " To " +endNum+ ",sum is " + sum);
		System.out.println("Total numbers are "+count);
	}
	public static void main(String[] args) {
		Assignment14_count_Sum assignment14_count_sum= new Assignment14_count_Sum();
		assignment14_count_sum.sumOfNum(1,70);
	}
}
