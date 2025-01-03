package nilam.Array;
//return the maximum number from given array. 
public class Assignment49 {
	
	int printMaxNum(int[] arr) {
		int maxNum=arr[0];
		for(int index=1;index<arr.length;index++) {
			if(maxNum<arr[index]) {
				maxNum=arr[index];				
			}
		}
		return maxNum;
	}

	public static void main(String[] args) {
		Assignment49 assignment49=new Assignment49();
		int[] arr= {44,45,22,25,47,29,46};
		int[] arr1= {-44,-45,-22,-25,-47,-29,-46};
		int max=assignment49.printMaxNum(arr);
		System.out.println("Max number in given array: "+max);
		int max1=assignment49.printMaxNum(arr1);
		System.out.println("Max number in given array: "+max1);
	}
}

/*public class Assignment49 {

	int printMaxNum(int[] arr) {
		int maxNum = 0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {	
					maxNum=arr[j];
				}	
				else {
					arr[j]=arr[i];
					maxNum=arr[i];
					arr[i]=maxNum;
				}
			}	
		}
		return maxNum;
	}

	public static void main(String[] args) {
		Assignment49 assignment49=new Assignment49();
		int[] arr= {994,45,122,25,47,529,00};
		int max=assignment49.printMaxNum(arr);
		System.out.println("Max number in given array: "+max);
	}
}*/

