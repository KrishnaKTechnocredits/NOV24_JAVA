package roshan.ComparableComperator;
import java.util.*;

public class ExapleValue {
	void m1() {
		List <Builder> List = new ArrayList <>();
		List.add(new Builder ("vimay","patna",3,1300));
		List.add(new Builder ("king","pune",2,30000));
		List.add(new Builder ("ketha","pulgaon",8,25000));
		List.add(new Builder ("roshan","nagpur",12,12000));
		
		Collections.sort(List); //mistake in spelling add s in last 
		System.out.println(List.toString()); //toprint sorting write like this
	}
		public static void main(String[] args){
			ExapleValue exaplevalue = new ExapleValue();
			exaplevalue.m1();
		}
		

		
	}


	/*
	 * Assignment - 94 : 26th Jan'2025 Create a class called Builder, define few
	 * variables and provide a mechanism to initialise them while creating an
	 * object. Create an ArrayList, add few builders object in the Arraylist and
	 * sort them based on any of the parameter. Attribute : name, city, exp, revenue
	 * expecting sorting based on revenue. make sure while you print the list after
	 * sorting, it should print name and revenue in sorted order of revenue.
	 */