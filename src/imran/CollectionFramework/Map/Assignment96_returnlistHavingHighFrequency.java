/*
 Assignment - 96 : 26th Jan'2025

return the list of all the words having highest frequency.
 
String str = "Hi Hello Hi Hi Pune India Pune India India City";
output : [Hi, India] 
 */
package imran.CollectionFramework.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment96_returnlistHavingHighFrequency {

	Map<String,Integer> getFrequency(String[] data)
	{
		List<String> list1 = new ArrayList<String>(Arrays.asList(data));
		Map<String,Integer> map1 = new HashMap<String,Integer>();
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
		//System.out.println(" The frequency of each element in a string is :" + map1);
		return map1;
	}
	
	List<String> getHighestFrequencyElementList(Map<String,Integer> mapData)
	{
		Set<String> keyOfmapData = mapData.keySet();
		List<String> list1 = new ArrayList<String>();
		Iterator<String> itr = keyOfmapData.iterator();
		int maxKeyvalue=0;
		while(itr.hasNext())
		{
			String key = itr.next();
			int value = mapData.get(key);
			if(maxKeyvalue<value)
			{
				maxKeyvalue = value;
			}
		}
		itr = keyOfmapData.iterator();
		while(itr.hasNext())
		{
			String key = itr.next();
			int value = mapData.get(key);
			if(value== maxKeyvalue)
			{
				list1.add(key);
			}
		}
		return list1;
	}
	
	public static void main(String[] args) {
		String str ="Hi Hello Hi Hi Pune India Pune India India City";
		String[] str1= str.split(" ");
		System.out.println(" The given array is :" + str);
		Assignment96_returnlistHavingHighFrequency assignment96_1 = new Assignment96_returnlistHavingHighFrequency();
		Map<String,Integer> map1 = assignment96_1.getFrequency(str1);
		List<String> highFrequencyElementList = assignment96_1.getHighestFrequencyElementList(map1);
		System.out.println(" The List of High Frequency Element are as follwes : "+ highFrequencyElementList );
	}
}
