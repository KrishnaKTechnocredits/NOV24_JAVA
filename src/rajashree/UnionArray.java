package rajashree;
//55.return union of given two array.

public class UnionArray {
	
	int[] retArray() {
		int[] arr1= {10,19,18};
		int[] arr2= {99,8};
		int[] output = new int[arr1.length + arr2.length];
		int j=0;
		for(int i=0; i<arr1.length;i++) {
			output[j]=arr1[i];
			j++;
		}
		
		for(int i=0;i<arr2.length;i++) {
			output[j]=arr2[i];
			j++;
		}
		
		return output;
	}
	public static void main(String[] args) {
		UnionArray ex1 = new UnionArray();
		int[] output1 = ex1.retArray();
		for(int i=0;i<output1.length;i++) {
			System.out.println(output1[i]);	
		}
	}
}
