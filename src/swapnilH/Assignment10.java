package SwapnilH;

public class Assignment10 {
	
	void quarter(int num) {
		if (num >=1 && num <=3) {
			System.out.print("Month index " + num+ " is in Q1");
		
		if (num == 1) {
			System.out.print(", its january");
			}
		if (num == 2) {
			System.out.print(", its february");
		}
		if (num == 3) {
			System.out.print(", its march");
			}
		}
		if (num >=4 && num <=6) {
			System.out.print("Month index " + num+ " is in Q2");
		
		if (num == 4) {
			System.out.print(", its april");
			}
		if (num == 5) {
			System.out.print(", its may");
		}
		if (num == 6) {
			System.out.print(", its june");
			}
		}
		if (num >=7 && num <=9) {
			System.out.print("Month index " + num+ " is in Q3");
		
		if (num == 7) {
			System.out.print(", its july");
			}
		if (num == 8) {
			System.out.print(", its august");
		}
		if (num == 9) {
			System.out.print(", its september");
			}
		}
		if (num >=10 && num <=12) {
			System.out.print("Month index " + num+ " is in Q4");
		
		if (num == 10) {
			System.out.print(", its october");
			}
		if (num == 11) {
			System.out.print(", its november");
		}
		if (num == 12) {
			System.out.print(", its december");
			}
		}
		if (num < 0) {
			System.out.print("invalid month index, it can't be negative");
		}
		else if (num >12){
			System.out.print("invalid month index, it can't be greater than 13");
		}
	}
			
		public static void main(String[] args) {
			Assignment10 assignment10 = new Assignment10();
			assignment10.quarter(5);
			System.out.println();
			assignment10.quarter(2);
			System.out.println();
			assignment10.quarter(-3);
			System.out.println();
			assignment10.quarter(13);
		}		
	}		
	/*	else if (num >=4 && num <=6) {
			System.out.println("Month index" + num+ "is in Q2");
		}
		else if (num >=7 && num <=9) {
			System.out.println("Month index" + num+ "is in Q3");
		}
		else if (num >=10 && num <=12) {
			System.out.println("Month index" + num+ "is in Q4");
		}
	}
	void month(int num) {	
		if (num == 1) {
			System.out.println(", its january");
		}
		else if (num == 2) {
			System.out.println(", its february");
		}
		else if (num == 2) {
			System.out.println(", its march");
		}
		else if (num == 2) {
			System.out.println(", its april");
		}
		else if (num == 2) {
			System.out.print(", its may");
		}
		else if (num == 2) {
			System.out.println(", its june");
		}
		else if (num == 2) {
			System.out.println(", its july");
		}
		else if (num == 2) {
			System.out.println(", its august");
		}
		else if (num == 2) {
			System.out.println(", its september");
		}
		else if (num == 2) {
			System.out.println(", its octomber");
		}
		else if (num == 2) {
			System.out.println(", its november");
		}
		else if (num == 2) {
			System.out.println(", its december");
		}
	}
	
	else if (num < 0) {
			System.out.print("invalid month index, it can't be negative");
		}
		else {
			System.out.print("invalid month index, it can't be greater than 13");
		}

	public static void main(String[] args) {
		Assignment10 assignment10 = new Assignment10();
		assignment10.quarter(5);
		assignment10.month(5);

	}

}


/*
 Assignment - 10 : 18th Nov'2024

Please use nested if else for below requirement.
Based on month index, print quarter and name of the month.

1 to 3 -> Q1
4 to 6 -> Q2
7 to 9 -> Q3
10 to 12 -> Q4

input : 5
output : Month index 5 is in Q2, its May.
input : 2
output : Month index 2 is in Q1, its Febuary.

input : -3
output: invalid month index, it can't be negative.

input : 13
output: invalid month index, it can't be greater than 13.*/
 