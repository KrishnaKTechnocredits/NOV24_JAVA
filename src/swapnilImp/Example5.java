package swapnilImp;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Example5 {
	
	public static void main(String[] args) {
		String[] str = {"Arav","Aaryahi","Rutuj","jeet","Sachin"};
		Set<String> setOfNames = new LinkedHashSet<String>(Arrays.asList(str));
		
		Iterator<String> itr = setOfNames.iterator();
		
		while(itr.hasNext()){
			String name = itr.next();
			if(name.length()<=5) {
				itr.remove();
			}
		}
		System.out.println(setOfNames);
	}
}
