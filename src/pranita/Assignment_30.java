package pranita;

public class Assignment_30 {
    int sumOfEvenDigits(String str) {
        int evensum = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) { // Check if the character is a digit
                int digit = Character.getNumericValue(ch);
                if (digit % 2 == 0) { 
                    evensum += digit;
                }
            }
        }
        return evensum;
    }

    public static void main(String[] args) {
        Assignment_30 A = new Assignment_30();
        int a = A.sumOfEvenDigits("te1ch2no3cre7dits");
        System.out.println("The sum of even digits: " + a); 

        int b = A.sumOfEvenDigits("techno");
        System.out.println("The sum of even digits: " + b); 

        int c = A.sumOfEvenDigits("4563");
        System.out.println("The sum of even digits: " + c); 
    }
}
