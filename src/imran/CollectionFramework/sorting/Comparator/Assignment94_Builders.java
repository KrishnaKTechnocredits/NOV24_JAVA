/*
 Assignment - 94 : 26th Jan'2025
Create a class called Builder, define few variables and provide a mechanism to initialise them while creating an object.
Create an ArrayList, add few builders object in the Arraylist and sort them based on any of the parameter.

Attribute : name, city, exp, revenue
expecting sorting based on revenue. 
make sure while you print the list after sorting, it should print name and revenue in sorted order of revenue.
 */
package imran.CollectionFramework.sorting.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import imran.CollectionFramework.sorting.Comparable.Builder;

public class Assignment94_Builders {

	List<Builders> listBuilder()
	{
		List<Builders> listOfBuilder = new ArrayList<Builders>();
		listOfBuilder.add(new Builders("Imran","Satna",12,33));
		listOfBuilder.add(new Builders("Aadil","Maihar",10,32));
		listOfBuilder.add(new Builders("Umar","Rewa",3,14));
		listOfBuilder.add(new Builders("Husnain","Maihar",10,34));
		System.out.println("The Given List is : " + listOfBuilder);
		return listOfBuilder;
	}
	
	void getSortByRevenue(List<Builders> listdata)
	{
		Collections.sort(listdata, new RevenueCompare());
		System.out.println("Sorting By Revenue : " + listdata); 
	}
	
	void getsortByExperience(List<Builders> listdata)
	{
		Collections.sort(listdata, new ExperienceCompare());
		System.out.println("Sorting By Experience : " + listdata);
	}
	
	void getsortByName(List<Builders> listdata)
	{
		Collections.sort(listdata, new NameCompare());
		System.out.println("Sorting By Name : " + listdata);
	}
	
	void getsortByCity(List<Builders> listdata)
	{
		Collections.sort(listdata, new CityCompare());
		System.out.println("Sorting By City : " + listdata);
	}
	
	public static void main(String[] args) {
		Assignment94_Builders assignment94_1 = new Assignment94_Builders();
		List<Builders> builderList = assignment94_1.listBuilder();
		assignment94_1.getsortByName(builderList);
		assignment94_1.getsortByExperience(builderList);
		assignment94_1.getSortByRevenue(builderList);
		assignment94_1.getsortByCity(builderList);
		
	}
}
