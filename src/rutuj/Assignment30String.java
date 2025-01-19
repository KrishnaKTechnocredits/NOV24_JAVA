package rutuj;

public class Assignment30String {
	
	void bloodDonate(int age , int weight )
	{
		if(age<18 )
		{
			System.out.println(" Age is less than 18: Age must be greater than 18");
		}
	else if(age >=18  && weight >=50)
		{
			
			System.out.println("The person is eligible to donate blood");
					
		}
		else 
		{
			System.out.println("The person is not eligible to donate blood");
		}
	}
	
	public static void main(String[] args)
	{
		Assignment30String ex1 = new Assignment30String();
		ex1.bloodDonate(18, 49);
		
	}
	
	

}