package anuja;
/*return the last numbers which is divisible by 5 and print the answer in main method.*/
/*logic is to return the method and */

public class Assignment18 {
	
	//write a method to return the num, hence return type is int.
	int printLastNumDivisibleBy5(int firstNUm, int lastNum) {
		for (;lastNum>=firstNUm;lastNum--)
			if(lastNum%5==0){
					break;//break if count==1 , as we will be only required one value.
			}
		return lastNum;// method should return something and this one returning lastnum	
	}
	//main method, 
	public static void main(String[] args) {
		Assignment18 assignment18 = new Assignment18();//object of method
		//assignment18.printLastNumDivisibleBy5(10, 498);//pass the
		int ans = assignment18.printLastNumDivisibleBy5(10, 498);
		System.out.println(ans+" is the last number which is divisible by 5");
	}
}
