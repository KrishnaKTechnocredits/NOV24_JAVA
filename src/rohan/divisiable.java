package rohan;

public class divisiable {

	void division(int StartRange, int EndRange) {
		System.out.println("Number divisiable by 5 and 3 betweem "+StartRange+" to "+EndRange);
		
		for(;StartRange<=EndRange ; StartRange++) 
		{
			if(StartRange%5==0 && StartRange%3==0) 
			{
				System.out.println(StartRange);
			}
		}
	}
	public static void main(String[] args) {
		divisiable div = new divisiable();
		div.division(5, 150);
	}
}
