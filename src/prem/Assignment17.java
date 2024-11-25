package prem;

public class Assignment17 {
	static int count;
	
	void reverseRangePrint(int startRange, int endRange) {
		System.out.println("Last 5 divisible numbers are");
		for(int num=endRange; num>startRange;num--) {
			if (num%5==0) {
				System.out.println(num);
			count++;
				if(count==5) {	
				break;
			    }
		    }
	    }	
	}
	
	public static void main(String[] args) {
		Assignment17 assign17 = new Assignment17();
		assign17.reverseRangePrint(10,500);
	}

}
