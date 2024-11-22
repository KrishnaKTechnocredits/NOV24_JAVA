package pranita;

class Assignment_15{
	void printData(int startRange ,int endRange){
	 int count=0;
		System.out.println("Num Divisible by 4 & 3 :");
			for(int num=startRange;num<=endRange;num++){
				if(num%4==0 && num%3==0){
					System.out.println(num);
					count++;
					
					if (count==3){
						break;
				}
			}
		}
	}
	
	public static void main(String[]args){
		Assignment_15 assignment_15= new Assignment_15();
        assignment_15.printData(10,50);
	}
}














