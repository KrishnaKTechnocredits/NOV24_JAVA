package pranita;

class Assignment_8{

	void printData(int startRange ,int endRange){	
        System.out.println("Even numbers :");	
			for(int num=startRange;num<=endRange;num++){
				if(num%2==0){
					System.out.println(num);
				}
			}
		}
	
	public static void main(String [] args){
		Assignment_8 assignment_8= new Assignment_8();
		assignment_8.printData(10,15);
		
	}
}
