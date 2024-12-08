package pranita;

public class CharacterFrequencyAss37 {
    
    public static void getCharFrequency(String input) {
        String checkedChars = ""; 
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (checkedChars.indexOf(currentChar) != -1) {
                continue;
            }

            int count = 0;
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == currentChar) {
                    count++;
                }
            }

            checkedChars += currentChar; 
            System.out.println(currentChar + " -> " + count);
        }
    }
	
	 public static void main(String[] args) {
        String input = "aakanksha";
        getCharFrequency(input);
    }
}
