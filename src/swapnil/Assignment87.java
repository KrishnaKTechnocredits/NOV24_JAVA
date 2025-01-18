package swapnil;

import java.util.HashSet;
import java.util.Set;

public class Assignment87 {
	
	Set<String> setOfNames(String[] str){
		Set<String> output = new HashSet<String>();
		for(String name : str) {
			String ch = Character.toString(name.charAt(name.length()-1));
			if("aeiou".contains(ch)) {
				output.add(name);
			}
		}
		
		return output;
	}
	
	public static void main(String[] args) {
		String[] str = {"techno","credits","rushikesh","krishna"};
		Assignment87 a =new Assignment87();
		Set<String> set = a.setOfNames(str);
		System.out.println(set);
	}
}
