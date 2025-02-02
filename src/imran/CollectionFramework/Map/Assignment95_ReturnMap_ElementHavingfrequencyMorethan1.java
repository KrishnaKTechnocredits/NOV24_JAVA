/*
 Assignment - 95 : 26th Jan'2025

String str = "Hi Hello Hi Hi Pune India Pune India India City";
output : Hi -> 3
         Hello -> 1
		 Pune -> 2
		 India -> 3
		 City -> 1
		 
		 return a map, having only those words with freq more than 1. 
		 Hi -> 3
         Pune -> 2
		 India -> 3
 */
package imran.CollectionFramework.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Assignment95_ReturnMap_ElementHavingfrequencyMorethan1 {

	Map<String,Integer> getfrequency(String[] data)
	{
		List<String> list1 = new ArrayList<String>(Arrays.asList(data));
		Map<String,Integer> map1 = new LinkedHashMap<String,Integer>();
		Iterator<String> itr = list1.iterator();
		int value=0;
		while(itr.hasNext())
		{
			String key = itr.next();
			if(!map1.containsKey(key))
			{
				map1.put(key,1);
			}
			else
			{
				value= map1.get(key);
				value = value+1;
				map1.put(key,value);
			}
		}
		System.out.println(" The element with frequency are : " + map1);
		return map1;
	}
	
	Map<String,Integer> getmapElementfrequencyMoreThan1(Map<String,Integer> mapData)
	{
		ConcurrentHashMap<String, Integer> map1 = new ConcurrentHashMap<String, Integer>(mapData);
		Set<String> keyofmapData = mapData.keySet();
		Iterator<String> itr = keyofmapData.iterator();
		while(itr.hasNext())
		{
			String key = itr.next();
			int value= map1.get(key);
			if(value<=1)
			{
				map1.remove(key);
			}
		}
		return map1;
	}
	
	public static void main(String[] args) {
		String str = "Hi Hello Hi Hi Pune India Pune India India City";
		String[] str1 = str.split(" ");
		System.out.println(" The Given array is :" + str);
		Assignment95_ReturnMap_ElementHavingfrequencyMorethan1 assignment95_1 = new Assignment95_ReturnMap_ElementHavingfrequencyMorethan1();
		Map<String,Integer> mapdata = assignment95_1.getfrequency(str1);
		Map<String,Integer> mapfinaldata = assignment95_1.getmapElementfrequencyMoreThan1(mapdata);
		System.out.println(" The Final element map containg element frequency more than 1 is: " + mapfinaldata);
	}
}
