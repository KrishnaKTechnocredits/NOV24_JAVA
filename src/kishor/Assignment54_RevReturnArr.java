package kishor;
//input : {10,34,22,16,19,99} return the array in reverse order

public class Assignment54_RevReturnArr {
	
	int[] getRevArray(int[] arr) {
		int[] obj = new int[arr.length];
		for(int i=arr.length-1,k=0;i>=0;i--,k++) {
			obj[k]=arr[i];
		}
		return obj;
	}
	
	public static void main(String[] args) {
		int[] input = {10,34,22,16,19,99};
		Assignment54_RevReturnArr assignment54 = new Assignment54_RevReturnArr();
		int[] ans=assignment54.getRevArray(input);
		for(int i=0;i<ans.length;i++) {
			System.out.println(ans[i]);
		}
	}
}
