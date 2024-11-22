package ajay;

class Assignment17{
	void nosdivisible1(int startRange, int endRange){
		int count=0;
		int i;
		System.out.println("Last 5 Numbers divisible by 5 are = ");
		for(i=endRange;i>=startRange;i--){
			if(i%5==0){
				System.out.println(i);
				count++;
				if(count==5){
					break;
				}
			}
		}
		
	}
	public static void main(String[] args){
		Assignment17 assignment17=new Assignment17();
		assignment17.nosdivisible1(10,500);
	}
}
