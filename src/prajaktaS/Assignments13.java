package prajaktaS;


public class Assignments13 {
		
	
	void divisibleby35(int startIndex,int endIndesx) {
		System.out.println("No Divisible by 3 and 5: ");
		for (int i=startIndex;i<=endIndesx;i++) {
		
		if (i%5==0 && i%3==0)
		{
		System.out.println(i);
		}
	}
}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignments13 assignmnet13=new Assignments13();
		assignmnet13.divisibleby35(5,40);
	}

}
