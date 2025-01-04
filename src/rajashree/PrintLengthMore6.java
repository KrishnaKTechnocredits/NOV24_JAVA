package rajashree;
//47.Print only names having length more than 6 characters from given String array.


public class PrintLengthMore6 {
	public static void main(String[] args) {
		String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};
		for(int index=0; index<names.length; index++) {
			
			String str= names[index];
			if (str.length() > 6)
				System.out.println(str);
		}
	}

}
