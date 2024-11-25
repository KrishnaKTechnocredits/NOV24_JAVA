package prajaktaP;
public class IndexParameter {
	public static void main(String[] args) {
        int start = 1; 
        int end = 60; 
        calculateSumAndCount(start, end);
    }

    public static void calculateSumAndCount(int start, int end)
    {
        int sum = 0;    
        int count = 0; 

        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 && i % 5 == 0) 
            { 
                sum += i;  
                count++;  
            }
        }
        System.out.println("In the range " + start + " to " + end + ", calculated sum is " + sum);
        System.out.println("In the range " + start + " to " + end + ", " + count + " numbers are divisible by 3 and 5.");
    }

}
