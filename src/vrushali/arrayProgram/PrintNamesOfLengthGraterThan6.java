package vrushali.arrayProgram;
//Assignment - 47 : 15th Dec'2024 [12 mins]
//Print only names having length more than 6 characters from given String array.
//String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};
//
//output : 
//Premlata
//Fazrana

public class PrintNamesOfLengthGraterThan6 {
	void printNamesLengthGreaterThan6(String[] nameArray)
	{
		String str;
		for(int i=0;i<nameArray.length;i++)
		{
			str=nameArray[i];
			if(str.length()>6)
			{
				System.out.println(str);
			}
		}
	}
	public static void main(String[] args) {
		PrintNamesOfLengthGraterThan6 printNamesOfLengthGraterThan6=new PrintNamesOfLengthGraterThan6();
		String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};
		printNamesOfLengthGraterThan6.printNamesLengthGreaterThan6(names);
	}
}
