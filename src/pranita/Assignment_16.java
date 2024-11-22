package pranita;

public class Assignment_16 {

    void calculate(int startRange, int endRange) {
        int count = 0;
        int sum = 0;

        System.out.println("First 3 numbers divisible by 5 and 7:");
        for (int num = startRange; num <= endRange; num++) {
            if (num % 5 == 0 && num % 7 == 0) {
                System.out.println(num);
                sum += num; 
                count++;

                if (count == 3) {
                    break; 
                }
            }
        }
            if (count == 0) {
            System.out.println("No numbers divisible by 5 and 7 found in the given range.");
        } else {
            int average = (int) sum / count;
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
        }
    }
    public static void main(String[] args) {
        Assignment_16 assignment = new Assignment_16();
        assignment.calculate(1, 210);
    }
}
