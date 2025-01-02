package pranita;

public class ArraySumReplace {

    public static int[] replaceWithSumOfOthers(int[] input) {
        int totalSum = 0;

        // Calculate the total sum of all elements in the array
        for (int num : input) {
            totalSum = totalSum + num;
        }

        // Create the output array by subtracting each element from the total sum
        int[] output = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            output[i] = totalSum - input[i];
        }

        return output;
    }

    public static void main(String[] args) {
        int[] input = {3, 5, 7, 1, 9};
        int[] output = replaceWithSumOfOthers(input);

        // Print the resulting output array
        for (int num : output) {
            System.out.print(num + " ");
        }
    }
}
