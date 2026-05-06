package roshan.ArrayList;
import java.util.*;

public class ReturnDublicateNameFromArray {
	List <String> getDublicateName (String[] arr){
	List <String> list = new ArrayList <>();
	List <String> orignalList = Arrays.asList(arr); //convert arraytolist
	for (String name : orignalList) {
		int indexof = orignalList.indexOf(name);
		int lastindexof = orignalList.lastIndexOf(name);
		if(indexof != lastindexof && !list.contains(name)) {
			list.add(name);
		}
	}
	return list;
	}
	

public static void main(String[] args) {
	String[] arr = {"Harish", "Pramod","Harish", "Krishna", "Jeet", "Krishna"};
	ReturnDublicateNameFromArray returndublicatenamefromarray = new ReturnDublicateNameFromArray();
	List <String> output = returndublicatenamefromarray.getDublicateName(arr);
	System.out.println(output);
}	
	
}



/*
 * Assignment - 83: 12th Jan Return the list of duplicate names from given
 * Array. [IMP]
 * 
 * String[] arr = {"Harish", "Pramod","Harish", "Krishna", "Jeet", "Krishna"};
 */
