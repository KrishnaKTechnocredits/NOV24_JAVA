package ashwini.ArrayProgram;
/*
 Assignment - 59 : 21th Dec'2024 [25 mins]
print all the second maximum length string from given array.

input : {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"}
ouput : GlobantPune
        PuneGlobant
		PuGlobantne
 */
	public class Assignment59 {
		String secondMaxLenString(String[] arr) {
		String maxLen=arr[0],secondMaxLen=arr[1];
		if(arr[1].length()>arr[0].length()) {
			maxLen=arr[1];
			secondMaxLen=arr[0];
			}
		for(int index=2;index<arr.length;index++) {
			if(maxLen.length()<arr[index].length()) {
				secondMaxLen=maxLen;
				maxLen=arr[index];
			}else if(secondMaxLen.length()<arr[index].length()) {
				secondMaxLen=arr[index];
			}
		}
			printStringHavingExpectedLength(arr,secondMaxLen.length());
	
		return secondMaxLen;
		}
		void printStringHavingExpectedLength(String[] input,int targetLen) {
			for(int i=0;i<input.length;i++) {
				if(input[i].length()==targetLen) {
					System.out.println(input[i]);
				}
			}
		}
		public static void main(String[] args) {
			String[] arr={"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"};
			Assignment59 a59 = new Assignment59();
			String secondMaxLen=a59.secondMaxLenString(arr);
			//System.out.println(secondMaxLen);
		}

	}


