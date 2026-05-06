package imran.CollectionFramework.sorting.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignment97_Employees {

	List<Employees> employeeList()
	{
		List<Employees> employeeList = new ArrayList<Employees>();
		employeeList.add(new Employees("Imran", "satna", 15000, 8));
		employeeList.add(new Employees("Aadil", "Maihar", 13000, 6));
		employeeList.add(new Employees("Shoieb", "Indore", 18000, 10));
		employeeList.add(new Employees("Husnain", "Unchehra", 15000, 8));
		employeeList.add(new Employees("Ahmed","rewa", 15800, 7));
		System.out.println("The List Of Employees is " +employeeList);
		return employeeList;
	}
	
	void getSortByName(List<Employees> listdata)
	{
		Collections.sort(listdata, new Emp_NameCompare());
		System.out.println("List Sort based on Name " +listdata);
	}
	
	void getSortBycity(List<Employees> listdata)
	{
		Collections.sort(listdata, new Emp_CityCompare());
		System.out.println("List Sort based on city " +listdata);
	}
	
	void getSortBySalary(List<Employees> listdata)
	{
		Collections.sort(listdata, new Emp_SalaryCompare());
		System.out.println("List Sort based on Salary " +listdata);
	}
	
	void getSortByExperience(List<Employees> listdata)
	{
		Collections.sort(listdata, new Emp_ExperienceCompare());
		System.out.println("List Sort based on Experience " +listdata);
	}
	
	public static void main(String[] args) {
		Assignment97_Employees assignment97_1 = new Assignment97_Employees();
		List<Employees> listdata = assignment97_1.employeeList();
		assignment97_1.getSortByName(listdata);
		assignment97_1.getSortBySalary(listdata);
		assignment97_1.getSortByExperience(listdata);
		assignment97_1.getSortBycity(listdata);
	}
}
