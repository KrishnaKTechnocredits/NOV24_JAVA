package roshan;

public class SumAverage {
	static void m1 (int startRange , int endRange){
		int num = 0;
		int count=0;
		int sum =0;
		int avg=0;
		for( num = startRange ; num<=endRange ;num++) {
			if (num % 5==0 && num % 7 ==0) {
				sum=sum+num; 
		        count++;
		        if (count == 3) {
		        break;
		        }        	
		    	
			}
		
		}
		
		
	if (count==3) {
        avg=sum/count;
        System.out.println("On user defined range first 3 numbers avg and sum which is divisible by 5 & 7 are  " + sum +" " + avg);

	}
	}
	
	public static void main(String[] args) {
		
		SumAverage.m1 (1,100);
	}
}



