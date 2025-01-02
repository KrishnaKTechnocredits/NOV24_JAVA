package pranita;

public class Assignment47 {
    void printStringsLongerThanFive(String[] arr) {
        for (String str : arr) {
            if (str.length() > 5) {
                System.out.println(str);
            }
        }
    }

    public static void main(String[] args) {
        String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana", "Sindhu"};
        Assignment47 assi47 = new Assignment47();
        assi47.printStringsLongerThanFive(names);
    }
}
