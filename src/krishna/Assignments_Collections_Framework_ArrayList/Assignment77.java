package Assignments_Collections_Framework_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Assignment77 {

	List<String> getList(List<String> list) {
		for(int i = 0;i<list.size();i++) {
			if(list.indexOf("Nitesh") != list.lastIndexOf("Nitesh")) {
				list.remove(list.lastIndexOf("Nitesh"));
			}
		}
		return list;
	}

	public static void main(String[] args) {
		Assignment77 assignment77 = new Assignment77();
		ArrayList<String> al = new ArrayList<String>();
		al.add("Anuja");
		al.add("Fazrana");
		al.add("Nitesh");
		al.add("Fazrana");
		al.add("Krishna");
		al.add("Nitesh");
		al.add("Fazrana");
		al.add("PremLata");
		al.add("Nitesh");
		al.add("Nitesh");
		al.add("Nitesh");
		al.add("Aashvi");

		System.out.println(assignment77.getList(al));
	}
}
