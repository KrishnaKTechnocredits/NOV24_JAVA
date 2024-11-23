package pranita;

class Assignment_17{
	int count=0;
	void printNum(int endRange, int startRange) {
		System.out.println("Last five numbers divisible by 5 in given range: ");
		for(int num=endRange; num>=startRange; num--){
			if(num%5==0){
				System.out.println(num);
				count++;
				
				if(count==5){
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment_17 assignment17 = new Assignment_17();
		assignment17.printNum(500,10);
	}
}

	



