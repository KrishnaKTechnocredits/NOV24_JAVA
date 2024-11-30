package pranita;

public class Assignment13 {
	
	void printData(int startIndex, int endIndesx) {
		System.out.println("No Divisible by 3 and 5: ");
		for (int i=startIndex; i<=endIndesx; i++) {
		
		if (i%5==0 && i%3==0)
		{
		System.out.println(i);
		}
	}
}	
	
	public static void main(String[] args) {
		Assignment13 assignmnet13=new Assignment13();
		assignmnet13.printData(5,40);
	}

}
