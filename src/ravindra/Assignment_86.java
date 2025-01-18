package ravindra;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment_86 {
	public static void main(String[] args) {
		String[] input = { "Aaruhi", "Ansh", "Akanksha", "Eva", "Kishor" };
		ArrayList<String> list=new ArrayList<>(Arrays.asList(input));
		
		for(int i=0;i<list.size();i++) {
			String name=list.get(i);
			if(name.length()<=5) {
				list.remove(name);
			}
		}System.out.println(list);
	}
}
