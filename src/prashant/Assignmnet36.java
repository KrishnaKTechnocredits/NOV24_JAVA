/*Assignment - 36 : 8th Dec [10 mins]
print table for 1 to 5 numbers.*/

package prashant;

public class Assignmnet36 {
	
	void printTable()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.println(i + "*" +j + "=" + i*j);
			}
			System.out.println("----------------");
		}
		
	}

	public static void main(String[] args) 
	{
		Assignmnet36 assignmnet36 = new Assignmnet36();
		assignmnet36.printTable();
	}

}
