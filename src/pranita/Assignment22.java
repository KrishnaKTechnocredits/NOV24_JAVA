package pranita;

public class Assignment22{

    public static int countDigits(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String input = "aa1kan33ks4h5a";
        int digitCount = countDigits(input);
        System.out.println("Total " + digitCount + " digits are there in given input.");
    }
}
