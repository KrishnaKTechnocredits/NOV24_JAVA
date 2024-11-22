package ajay;

class Assignment14{
	void nosdivisible(int startRange, int endRange){
		int count=0;
		int sum=0;
		for(int i=startRange;i<=endRange;i++){
			if(i%3==0 && i%5==0){
				sum=sum+i;
				count++;
			}
		}System.out.println("Sum of all numbers divisible by 3 and 5 is ="+sum +" In the range 1 to 70 numbers divisible by 3 and 5 are= "+count);
		
	}
	
	public static void main(String[] args){
		Assignment14 assignment14=new Assignment14();
		assignment14.nosdivisible(1,70);
	}
}