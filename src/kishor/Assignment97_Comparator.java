package kishor;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment97_Comparator {
	
	public static void main(String[] args) {
		ArrayList<Assignment97_Builder> list= new ArrayList<Assignment97_Builder>();
		list.add(new Assignment97_Builder("VTP","Pune",10,50000));
		list.add(new Assignment97_Builder("lodha","Mumbai",19,20000));
		list.add(new Assignment97_Builder("amarcon","delhi",17,60000));
		
		Collections.sort(list, new Assignment97_Revenue());
		//Collections.sort(list, new Assignment97_Experience());
		
		System.out.println(list);
		
	}
}
