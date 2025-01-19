package pranita;

public class Assignment46 {
	
	void getMiddleChar(String[] arr) {
		for(int i=0; i<arr.length; i++) {
			String str = arr[i];
			if(str.length()%2==0) {
				System.out.println(arr[i]+"-> "+str.charAt(str.length()/2-1));
			}else {
				System.out.println(arr[i]+"-> "+str.charAt(str.length()/2));
			}
		}
	}
	
	public static void main(String[] args) {
		String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};
		Assignment46 assi46 = new Assignment46();
		assi46.getMiddleChar(names);
	}
}


