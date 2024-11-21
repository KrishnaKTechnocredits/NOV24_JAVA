package prajaktaP;
public class Division {
	    void DivisibleByFiveAndThree(int startRange, int endRange) {
	        System.out.println("Divisible by 5 & 3, numbers are:");
	        for (int num = startRange; num <= endRange; num++) {
	            if (num % 5 == 0 && num % 3 == 0) {
	                System.out.println(num);
	            }
	        }
	    }

	    public static void main(String[] args) {
	        int startRange = 5;
	        int endRange = 40;
	        Division division = new Division();
	        division.DivisibleByFiveAndThree(startRange, endRange);
	    }
	}


