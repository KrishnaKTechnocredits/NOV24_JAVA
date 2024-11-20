package roshan;

public class MonthIndex {
	
 static void calander (int index) {
	
	if (index < 1 ) {
		System.out.println("Invalid month index, it can't be negative.");
	}
		
	else if (index > 12 ) {
		System.out.println("Invalid month index, it can't be grater than 12.");
	}
	else {
		if (index >= 1 && index <= 3) {
			if (index==1) {
			 System.out.println("Month index 1 is in Qater 1, its Janauary.");
			}
			 else if (index==2) {
				 System.out.println("Month index 2 is in Qater 1, its Febauary.");
			 }
			 else if (index==3) {
				 System.out.println("Month index 3 is in Qater 1, its March.");
			 }
		}
	else {
		if (index >= 4 && index <= 6) {
			if (index==4) {
			 System.out.println("Month index 4 is in Qater 2, its April.");
			}
			 else if (index==5) {
				 System.out.println("Month index 5 is in Qater 2, its May.");
			 }
			 else if (index==6) {
				 System.out.println("Month index 6 is in Qater 2, its June.");
			 }
		}
		else {
			if (index >= 7 && index <= 9) {
				if (index==7) {
				 System.out.println("Month index 7 is in Qater 3, its July.");
				}
				 else if (index==8) {
					 System.out.println("Month index 8 is in Qater 3, its Augst.");
				 }
				 else if (index==9) {
					 System.out.println("Month index 9 is in Qater 3, its september.");
				 }
			}
		else {
		   if (index >= 10 && index <= 12) {
			   if (index==7) {
			   System.out.println("Month index 10 is in Qater 4, its Octember.");
			   }
			   else if (index==8) {
			   System.out.println("Month index 11 is in Qater 4, its November.");
			   }
			   else if (index==9) {
			   System.out.println("Month index 12 is in Qater 4, its December.");
	          }
				
	      }		

		}

		}
		
	    }
		
	    }
}
        public static void main(String[] args) {
	
        	MonthIndex.calander(12);
	       
}
}

