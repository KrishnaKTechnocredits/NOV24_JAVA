package nitish;

public class Divisible2 {
	
	void sumOfNum(int start,int end) {
		int sum= 0;
		int count=0;
		for(int num = start;num <=end;num++) {
			if(num%5==0 && num%3==0) {
				sum= sum+num;
				count++;
			}
		}
		System.out.println("The Sum of all the numbers divisible by 5 and 3 between "+start+" and "+end+"  =  " +sum);
		System.out.println("Count of numbers divisible by 5 and 3  =  "+count);
	}

	public static void main(String[] args) {
		Divisible2 divisible2 = new Divisible2();
		divisible2.sumOfNum(1, 70);

	}

}
