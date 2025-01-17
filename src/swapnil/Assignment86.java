package swapnil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment86 {
	List<String> removeName(String[] str){
		List<String> newList = new ArrayList<String>(Arrays.asList(str));
		for(int i=0;i<newList.size();i++) {
			String name = newList.get(i);
			if(name.length()<=5) {
				newList.remove(name);
				i--;
			}
		}
		return newList;
	}
	public static void main(String[] args) {
		String[] str = {"Aaruhi","Ansh", "Akanksha", "Eva", "Kishor"};
		Assignment86 a = new Assignment86();
		List<String> abc=a.removeName(str);
		System.out.println(abc);
	}
}
