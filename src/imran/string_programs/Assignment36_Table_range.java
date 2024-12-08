package imran.string_programs;

public class Assignment36_Table_range {

	void getTabledata(int start_range , int end_range)
	{
		for(int i=start_range;i<=end_range;i++)
		{
			System.out.println("The Table of "+ i+ " is: ");
			for(int j=1;j<=10;j++)
			{
				int result= i*j;
				System.out.println(i +" * " +j+ " -> "+ result);
			}
			System.out.println(" ");
		}
	}
	
	public static void main(String[] args) {
		Assignment36_Table_range assignment36_Table_range_1 = new Assignment36_Table_range();
		assignment36_Table_range_1.getTabledata(1,5);
	}
}
