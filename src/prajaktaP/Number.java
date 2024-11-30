package prajaktaP;
public class Number {
	// Using two method - Assignment 11
	String findMinimum(int num1, int num2) {
	        if (num1 < num2) {
	            return num1 + " is smaller between " + num1 + " and " + num2 + ".";
	        } else if (num1 > num2) {
	            return num2 + " is smaller between " + num1 + " and " + num2 + ".";
	        }
	        return "Both numbers are equal.";
	    }

	    String findMaximum(int num1, int num2) {
	        if (num1 > num2) {
	            return num1 + " is bigger between " + num1 + " and " + num2 + ".";
	        } else if (num1 < num2) {
	            return num2 + " is bigger between " + num1 + " and " + num2 + ".";
	        }
	        return "Both numbers are equal.";
	    }

	    public static void main(String[] args) {
	        int num1 = 10;
	        int num2 = 17;
	        Number number = new Number();
	        System.out.println(number.findMinimum(num1, num2));
	        System.out.println(number.findMaximum(num1, num2));
	    }
	}


