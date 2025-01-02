package nilam.Array;

public class Assignment55 {
	
	int[] unionOfArray(int[] arr1,int[] arr2) {
		int[] unionArray=new int [arr1.length+arr2.length];
		int count=0;
		for(int a1=0;a1<arr1.length;a1++) {
			unionArray[a1]=arr1[a1];
			count++;
		}
		for(int a2=0;a2<arr2.length;a2++) {
			unionArray[count]=arr2[a2];
			count++;
		}
		return unionArray;
	}
	
	public static void main(String[] args) {
		Assignment55 assignment55=new Assignment55();
		int[] arr1= {100,10,19,18},arr2= {99,8};
		int[] unionArray=assignment55.unionOfArray(arr1,arr2);
			for(int i=0;i<unionArray.length;i++) {
				System.out.println(unionArray[i]);
			}
	}
}
