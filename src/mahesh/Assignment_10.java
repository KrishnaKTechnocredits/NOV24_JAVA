package mahesh;

public class Assignment_10 {
	
	void printMonth (int index) {
		
		if (index <=0) {
			System.out.println("invalid month index, it can't be zero or negative.");
			
		} else if (index>=1 && index<=3) {
			System.out.print("Month index "+index+" is in Q1, ");
			if (index ==1) {
				System.out.println("its January.");
			} else if (index ==2) {
				System.out.println("its February.");
			} else {
				System.out.println("its March.");
			}
			
		} else if (index>=4 && index<=6) {
			System.out.print("Month index "+index+" is in Q2, ");
			if (index ==4) {
				System.out.println("its April.");
			}else if (index ==5) {
				System.out.println("its May.");
			}else {
				System.out.println("its June.");
			}
			
		} else if (index>=7 && index<=9) {
			System.out.print("Month index "+index+" is in Q3, ");
			if (index ==7) {
				System.out.println("its July.");
			}else if (index ==8) {
				System.out.println("its August.");
			}else {
				System.out.println("its September.");
			}
			
		} else if (index>=10 && index<=12) {
			System.out.print("Month index "+index+" is in Q4, ");
			if (index ==10) {
				System.out.println("its October.");
			}else if (index ==11) {
				System.out.println("its November.");
			}else {
				System.out.println("its December.");
			}
			
		} else {
			System.out.println("invalid month index, it can't be greater than 12.");
		}
	}
	
	public static void main(String[] args) {
		Assignment_10 assignment = new Assignment_10();
		assignment.printMonth(5);
		System.out.println("----------------------------------------");
		assignment.printMonth(2);
		System.out.println("----------------------------------------");
		assignment.printMonth(-3);
		System.out.println("----------------------------------------");
		assignment.printMonth(13);
	}

}
