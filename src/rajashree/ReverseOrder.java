package rajashree;
//53.Print the array in reverse order.

public class ReverseOrder {
	
	void PrintArrayReverseOrder() {
		int[] arr = {10,34,22,16,19,99};
		for(int i= arr.length-1; i>=0 ; i--) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		ReverseOrder ex1 = new ReverseOrder();
		ex1.PrintArrayReverseOrder();
	}

}
