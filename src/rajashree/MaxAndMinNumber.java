package rajashree;
class MaxAndMinNumber{
	
	void findMax(int num1,int num2){
		if(num1>num2){
		System.out.println(num1+" is bigger between"+num1+" and "+num2);
		}
	
		else{
		System.out.println(num2+" is bigger between"+num1+" and "+num2);
		}
	}
	void findMin(int num1,int num2){
		if(num1<num2){
		System.out.println(num1+" is smaller between"+num1+" and "+num2);
		}
	
		else{
		System.out.println(num2+" is smaller between"+num1+" and "+num2);
		}
	}
		
	public static void main(String[] args){
		MaxAndMinNumber maxAndMinNumber = new MaxAndMinNumber();
		maxAndMinNumber.findMax(10,17);
		maxAndMinNumber.findMin(10,17);
	}
}