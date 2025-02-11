package swapnilImp;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Example3 {
	
	public static void main(String[] args) {
		Map<String, String> mapOfNames = new HashMap<String, String>();
		mapOfNames.put("Swapnil","Hole");
		mapOfNames.put("jay","Hole");
		mapOfNames.put("vijay","Hole");
		mapOfNames.put("karma","Hole");
		mapOfNames.put("vilas","patil");
		mapOfNames.put("vikas","patil");
		
		Set<String> keys =mapOfNames.keySet();
		System.out.println(keys);
		
		for(String currentKey : keys) {
			String value = mapOfNames.get(currentKey);
			if(value.equals("Hole")) {
				System.out.println(currentKey+"-->"+value);
			}
		}
	}
}
