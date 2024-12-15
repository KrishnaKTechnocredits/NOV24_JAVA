package pranita;

class Assignment29 {

    // Method to convert character to its ASCII value
    int charToAscii(char ch) {
        int ascii = ch;
        return ascii;
    }

    // Method to print ASCII values of uppercase letters
    void printUpperCaseAscii() {
        System.out.println("List of Uppercase letters with their ASCII values:");
        for (char ch1 = 'A'; ch1 <= 'Z'; ch1++) {
            int ans = charToAscii(ch1);
            System.out.println(ch1 + " : " + ans);
        }
    }

    // Method to print ASCII values of lowercase letters
    void printLowercaseAscii() {
        System.out.println("List of Lowercase letters with their ASCII values:");
        for (char ch1 = 'a'; ch1 <= 'z'; ch1++) {
            int ans = charToAscii(ch1);
            System.out.println(ch1 + " : " + ans);
        }
    }

    // Method to print ASCII values of digits from a string
    void printAsciiForDigits(String str) {
        System.out.println("The Character to ASCII values for digits 0-9 are as below:");
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (Character.isDigit(currentChar)) {
                int ascii = currentChar;
                System.out.println(currentChar + " -> " + ascii);
            } else {
                System.out.println(currentChar + " is not a digit.");
            }
        }
    }

    public static void main(String[] args) {
        Assignment29 assignment29 = new Assignment29();
        assignment29.printUpperCaseAscii();
        assignment29.printLowercaseAscii();
        String digits = "0123456789";
        assignment29.printAsciiForDigits(digits);
    }
}
