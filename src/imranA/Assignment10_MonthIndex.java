package imranA;

public class Assignment10_MonthIndex {

	void index(int mI)
	{
		if(mI>0 && mI<=3)
		{
			if(mI==1)
			{
				System.out.println("Month Index is " + mI +",in Quarter 1.It's January.");
			}
			else if(mI==2)
			{
				System.out.println("Month Index is " + mI +",in Quarter 1.It's  February");
			}
			else
			{
				System.out.println("Month Index is " + mI +",in Quarter 1.It's  March");
			}
		}
		else if(mI>3 && mI<=6)
		{
			if(mI==4)
			{
				System.out.println("Month Index is " + mI +", in Quarter 2.It's April.");
			}
			else if(mI==5)
			{
				System.out.println("Month Index is " + mI +", in Quarter 2.It's May.");
			}
			else
			{
				System.out.println("Month Index is " + mI +", in Quarter 2.It's June.");
			}
		}
		else if(mI>6 && mI<=9)
		{
			if(mI==7)
			{
				System.out.println("Month Index is " + mI +", in Quarter 3.It's July");
			}
			else if(mI==8)
			{
				System.out.println("Month Index is " + mI +", in Quarter 3.It's August");
			}
			else
			{
				System.out.println("Month Index is " + mI +", in Quarter 3.It's September");
			}
		}
		else if(mI>9 && mI<=12)
		{
			if(mI==10)
			{
				System.out.println("Month Index is " + mI +", in Quarter 4.It's October");
			}
			else if(mI==11)
			{
				System.out.println("Month Index is " + mI +", in Quarter 4.It's November");
			}
			else
			{
				System.out.println("Month Index is " + mI +", in Quarter 4.It's December");
			}
		}
		else
		{
			if(mI<0)
			{
				System.out.println("Invalid Month Index,It cant be negative");
			}
			else
			{
				System.out.println("Invalid Month Index,It cant be Greater than 12");
			}
		}			
	}
	public static void main(String[] args) {
		Assignment10_MonthIndex assignment10_MonthIndex1 = new Assignment10_MonthIndex();
		assignment10_MonthIndex1.index(5);
		assignment10_MonthIndex1.index(5);
		assignment10_MonthIndex1.index(-3);
		assignment10_MonthIndex1.index(13);
	}
}
