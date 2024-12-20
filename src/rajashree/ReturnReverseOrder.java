package rajashree;
//54.return the array having elements in reverse order of original array.

public class ReturnReverseOrder {
	
	int[] PrintArrayReverseOrder() {
		int[] arr = {10,34,22,16,19,99};
		int[] revarr = new int[arr.length];
		int j=0;
		for(int i= arr.length-1; i>=0 ; i--) {
			revarr[j] = arr[i];
			j++;
		}
		return revarr;
	}
	public static void main(String[] args) {
		ReturnReverseOrder ex1 = new ReturnReverseOrder();
		int[] output=ex1.PrintArrayReverseOrder();
		for(int i=0; i<output.length; i++) {
			System.out.println(output[i]);
		}
	}

}
	

