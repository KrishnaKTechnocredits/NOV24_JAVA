package vidya;

public class Even {
	
	int startrange;
	int endrange;
	
	void printEvenNum(int startRange,int endRange) {
		
		for(int num=startRange; num<=endRange; num++)
		{
			if(num%2 == 0) {
			System.out.println(num);
			}
		}
		
	}
	public static void main(String[] a)
	{
		Even even = new Even();
		even.printEvenNum(10,15);
	}

}
