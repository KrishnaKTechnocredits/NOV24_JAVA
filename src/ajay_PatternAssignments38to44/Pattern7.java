package ajay_PatternAssignments38to44;

public class Pattern7 {

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
	        Pattern7 pattern7 = new Pattern7();
	        pattern7.patternPrinting(); 
	    }
	}

