package pranita;

public class CharacterCounterAssignment23 {

    public static void charcount(String input) {
        int uppercaseCount = 0;
        int lowercaseCount = 0;
        int digitCount = 0;
        int spaceCount = 0;
        int specialCharCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isUpperCase(ch)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowercaseCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            } else if (Character.isWhitespace(ch)) {
                spaceCount++;
            } else {
                specialCharCount++;
            }
        }

        System.out.println("uppercase : " + uppercaseCount);
        System.out.println("lowercase  : " + lowercaseCount);
        System.out.println("digit  : " + digitCount);
        System.out.println("space  : " + spaceCount);
        System.out.println("special char : " + specialCharCount);
    }

    public static void main(String[] args) {
        String input = "Te4c_hno Credi3ts";
        charcount(input);
    }
}
