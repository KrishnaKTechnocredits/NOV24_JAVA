package rajashree;
//51.print maximum and minimum number from given array. 

public class PrintMaxAndMinNo {
	void MaxAndMinNo(){
		int[] arr = {44,45,22,25,47,29,46};
		int MaxNum=arr[0];
		int MinNum=arr[0];
		for(int i=1; i<arr.length;i++) {
			if(arr[i]>MaxNum) {
				MaxNum=arr[i];
			}
			if(arr[i]<MinNum) {
				MinNum=arr[i];
			}
		}
		System.out.println("MaxNum " + MaxNum);
		System.out.println("MinNum " + MinNum);
	}
	public static void main(String[] args) {
		PrintMaxAndMinNo ex1 = new PrintMaxAndMinNo();
		ex1.MaxAndMinNo();
	}

}
