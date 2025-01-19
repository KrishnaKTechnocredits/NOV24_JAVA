package ajay_StringAssignment;

public class Assignment32 {

    void getFreqChar(String input) {
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            int count = 0;
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == currentChar) {
                    count++;
                }
            }
            if (input.indexOf(currentChar) == i) {
                System.out.println(currentChar + " -> " + count);
            }
        }
    }

    public static void main(String[] args) {
        Assignment32 assignment32 = new Assignment32();
        assignment32.getFreqChar("aakanksha");
    }
}
