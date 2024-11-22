package ajay;

class Assignment15{
	void nosdivisible1(int startRange, int endRange){
		int count=0;
		int i;
		System.out.println("First 3 Numbers divisible by 3 and 4 are = ");
		for(i=startRange;i<=endRange;i++){
			if(i%3==0 && i%4==0){
				System.out.println(i);
				count++;
				if(count==3){
					break;
				}
			}
		}
		
	}
	public static void main(String[] args){
		Assignment15 assignment15=new Assignment15();
		assignment15.nosdivisible1(10,500);
	}
}