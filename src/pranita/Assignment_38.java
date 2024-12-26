package pranita;

public class Assignment_38 {
 

		void getPatternSymbol(char ch)
		{
			for(int i=1; i<=4;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(ch);
				}
				System.out.println(" ");
			}
		}
		
		public static void main(String[] args) {
			Assignment_38 assignment38 = new Assignment_38();
			assignment38.getPatternSymbol('*');
		}
	}

