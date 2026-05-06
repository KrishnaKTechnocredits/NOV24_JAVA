package swapnilImp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Example2 {
	
	public static void main(String[] args) {
		String[] arr = {"PremLata","Anuja","Swapnil","Fazrana","Harshada"};
		Set<String> setOfNames = new HashSet<String>(Arrays.asList(arr));
		System.out.println(setOfNames);
		
		for(String name : setOfNames) {
			if(name.length()>5 && name.endsWith("a")) {
				System.out.println(name);
			}
		}
	}
}
