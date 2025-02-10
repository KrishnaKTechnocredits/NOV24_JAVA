package pranita;

import java.util.Arrays;

public class Assignment_56 {
	
	public int[] getMaxNumberForEachIndex(int[] ip1, int[] ip2){
		int[] output = new int[ip1.length];	
	
		for(int i=0,j=0;i<ip1.length; i++,j++) {
			if(ip1[i]>ip2[j] || ip1[i]==ip2[j]) {
				output[i]=ip1[i];
			}else if(ip1[i]<ip2[j]) {
				output[i]=ip2[j];
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		int[] input1 = {10,55,22,77,88};
		int[] input2 = {5,102,28,77,18};
		Assignment_56 assi56 = new Assignment_56();
		int[] output = assi56.getMaxNumberForEachIndex(input1,input2);
		System.out.println(Arrays.toString(output));
	}
}
