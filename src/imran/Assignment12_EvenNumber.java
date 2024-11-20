package imran;

public class Assignment12_EvenNumber {

	void evenNum(int num1,int num2)
	{
		if (num1<num2)
		{
			System.out.println("Then Even number Between " + num1 + " and " + num2 + " are as follows");
			for(int i=num1;i<=num2;i++)
			{
				if(i%2==0)
				{
					System.out.println(i);
				}
			}
		}
		else
		{
			System.out.println("Then Even number Between " + num2 + " and " + num1 + " are as follows");
			for(int i=num2;i<=num1;i++)
			{
				if(i%2==0)
				{
					System.out.println(i);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment12_EvenNumber assignment12_EvenNumber_1=new Assignment12_EvenNumber();
		assignment12_EvenNumber_1.evenNum(10, 15);
		assignment12_EvenNumber_1.evenNum(56, 48);
	}
}
