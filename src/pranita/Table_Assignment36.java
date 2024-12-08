package pranita;

public class Table_Assignment36{
    public static void printTables(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.println("Table for " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println(); 
        }
    }

    public static void main(String[] args) {
        printTables(1, 5);
    }
}
