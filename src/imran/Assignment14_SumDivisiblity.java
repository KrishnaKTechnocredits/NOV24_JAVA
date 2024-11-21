package imran;

public class Assignment14_SumDivisiblity {

	void sumDivisible(int num1, int num2) {
		int sum=0;
		int count=0;
		if (num1<num2)
		{
			for(int i=num1;i<num2;i++)
			{
				if(i%3==0 && i%5==0)
				{
					sum=sum+i;
					count++;
				}
			}
			System.out.println("In the Range of "+ num1+" and " +num2+" , calculated sum is "+ sum +" and total number of Numbers divisible by 3 & 5 are " +count);
		}
		else 
		{
			for(int i=num1;i<num2;i++)
			{
				if(i%3==0 && i%5==0)
				{
					sum=sum+i;
					count++;
				}
			}
			System.out.println("In the Range of "+ num1+" and " +num2+" , calculated sum is "+ sum +" and total number of Numbers divisible by 3 & 5 are " +count);
		}
	}
	
	public static void main(String[] args) {
		Assignment14_SumDivisiblity assignment14_SumDivisiblity_1 = new Assignment14_SumDivisiblity();
		assignment14_SumDivisiblity_1.sumDivisible(1, 70);
	}
}
