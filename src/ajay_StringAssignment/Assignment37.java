package ajay_StringAssignment;

public class Assignment37 {

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
        Assignment37 assignment37 = new Assignment37();
        assignment37.getFreqChar("aakanksha");
    }
}
