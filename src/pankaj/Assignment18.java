package pankaj;

public class Assignment18 {

	int num;
	//int count;

	int processData(int endrange, int startrange) {
		
		int num=0;
		int count=0;

		for (num = startrange; num >=endrange ; num--) 
		{
			if (num % 5 == 0) 
			{
				System.out.println(num);
				count++;
				if(count==1)
				{
					return num;
				}
				else 
				{
					System.out.println("There is no number");
				}
			} 
			
		}
	    return num;

	}

	public static void main(String[] args) {

		Assignment18 A18 = new Assignment18();
		int a = A18.processData(10, 498);
		System.out.println(a + " is the last number divisible by 5");
	}

}
