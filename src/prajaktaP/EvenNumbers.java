package prajaktaP;
public class EvenNumbers {

    void getEvenNum(int startRange, int endRange) {
        System.out.println("Even numbers are:");
        for (int num = startRange; num <= endRange; num++) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }

    public static void main(String[] args) {
        EvenNumbers evenNumbers = new EvenNumbers();
        evenNumbers.getEvenNum(10,15);
    }
}


