package ajay_PatternAssignments38to45;

public class Assignment44 {

	    void patternPrinting() {
	        int i, j;
	        for (i = 1; i <= 5; i++) { 
	            for (j = 1; j <= i; j++) {
	                if (j % 2 != 0) { 
	                    System.out.print("*");
	                } else { 
	                    System.out.print("#");
	                }
	                System.out.print(" "); 
	            }
	            System.out.println(); 
	        }
	    }

	    public static void main(String[] args) {
	        Assignment44 pattern7 = new Assignment44();
	        pattern7.patternPrinting(); 
	    }
	}

