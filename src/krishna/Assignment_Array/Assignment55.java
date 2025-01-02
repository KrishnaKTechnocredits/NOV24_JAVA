package Assignment_Array;

public class Assignment55 {
	int[] getUnionArray(int[] input1, int[] input2) {
        int count = 0;
        int[] output = new int[input1.length + input2.length];
        
        for (int i = 0; i < input1.length; i++) {
            output[count] = input1[i];
            count++;
        }
        
        for (int i = 0; i < input2.length; i++) {
            output[count] = input2[i];
            count++;
        }
        
        return output;
    }

    public static void main(String[] args) {
        int[] arr1 = {10, 17, 15};
        int[] arr2 = {55, 12};
        
        int[] output = new Assignment55().getUnionArray(arr1, arr2);
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }
}
