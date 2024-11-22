package ajay;

class Assignment16{
	void nosdivisible1(int startRange, int endRange){
		int count=0;
		int sum=0;
		int avg=0;
		for(int i=startRange;i<=endRange;i++){
			if(i%5==0 && i%7==0){
				count++;
				sum=sum+i;
				avg=sum/3;
				if(count==3){
					break;
				}
			}
		}System.out.println("Sum of first 3 numbers is "+sum +" and "+" Average of first 3 Numbers is " +avg);

		
	}
	public static void main(String[] args){
		Assignment16 assignment16=new Assignment16();
		assignment16.nosdivisible1(1,210);
	}
}