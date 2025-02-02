
	/*Create a class called Employee, define few variables and provide a mechanism to initialise them while creating an object.
	Create an ArrayList, add few builders object in the Arraylist and sort them based on multiple parameter.

	Attribute : name, city, exp, revenue
	expecting sorting based on revenue and exp. 

	make sure while you print the list after sorting, it should print name, revenue, exp in sorted order of revenue.*/

package sindhu.Collection.Assignment97;
import java.util.*;

public class Assignment97 {
		
	List<Emp> getListOfObjects(){
		List<Emp> l1 = new ArrayList<Emp>();
		l1.add(new Emp("Mahendra","Mumbai",2500, 2600000.00));
		l1.add(new Emp("Sindhu","Pune",3000, 900000.00));
		l1.add(new Emp("Pradeep","Pune",2500, 1500000.00));
		l1.add(new Emp("Anuja","Mumbai",1450, 2500000.00));
		//System.out.println("The input list is: "+l1);
		return l1;
	}
	
	void getListSortedOnRevenue(){
		List<Emp> RL = new ArrayList<>();
		RL = getListOfObjects();
		Collections.sort(RL, new RevenueClass97());
		System.out.println("The list sorted on revenue: "+RL);
	}
	
	void getListSortedOnExpenses(){
		List<Emp> EL = new ArrayList<>();
		EL = getListOfObjects();
		Collections.sort(EL, new ExpenseClass97());
		System.out.println("The list sorted on expense: "+EL);
	}
		
		
	public static void main(String[] args) {
		new Assignment97().getListSortedOnRevenue();
		new Assignment97().getListSortedOnExpenses();
	}
}

