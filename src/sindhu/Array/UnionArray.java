package sindhu.Array;

public class UnionArray {
	int[] getarr(int[] arr1, int[] arr2) {
		int[] output = new int[arr1.length + arr2.length];
		System.out.println("Length of New Array: "+output.length);
		int count=0;
		//output[count]=0;
		for(int i=0; i< arr1.length; i++) {
				output[count]=arr1[i];
				count++;
				//System.out.println(output[count]);
		}
		for(int j=0; j< arr2.length; j++) {
			output[count]=arr2[j];
			count++;
			//System.out.println(output[count]);
		}
		return output;
		
	}
	
	public static void main(String[] args) {
		int[] arr1= {10,19,18};
		int[] arr2= {99,8};
		UnionArray uniArr = new UnionArray();
		int[] output = uniArr.getarr(arr1, arr2);
		System.out.println("output array:");
		for(int k=0;k<output.length; k++) {
			System.out.println(output[k]);
		}
	}
}
