package packageTest.HashMap;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapSortingComparator {

	@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
	public static void main(String[] args) {
		HashMap<Integer, String> Hmap = new HashMap<Integer, String>();

		Hmap.put(1, "Dharmpal");
		Hmap.put(5, "Patna");
		Hmap.put(2, "Kumar");
		Hmap.put(4, "India");
		Hmap.put(3, "Bihar");
		System.out.println(" Before Sorting :: ");
		Set set = Hmap.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()){
			Map.Entry me = (Map.Entry)itr.next();
			System.out.println("Set ::  Key : "+me.getKey()+"  Value :   "+me.getValue());
		}
		Map<Integer, String> map = sortByValues(Hmap);
		Set set1 = Hmap.entrySet();
		Iterator itr1 = set1.iterator();
		while(itr1.hasNext()){
			Map.Entry me1 = (Map.Entry)itr1.next();
			System.out.println("Set1 ::  Key ::  "+me1.getKey()+"  Value  ::  "+me1.getValue());
		}
		
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static HashMap sortByValues(HashMap map) {
		List list = new LinkedList(map.entrySet());
		Collections.sort(list, new Comparator(){
			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				return ((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry) (o2)).getValue());
			}
		});
		HashMap sortedHashMap = new LinkedHashMap();
		for(Iterator itr2 = list.iterator(); itr2.hasNext();){
			Map.Entry me2 = (Map.Entry)itr2.next();
			System.out.println("Set :  Key :: "+me2.getKey()+"  Value ::  "+me2.getValue());
			sortedHashMap.put(me2.getKey(), me2.getValue());
			System.out.println(" Comparator Print  :::   "+sortedHashMap.put(me2.getKey(), me2.getValue()));
		}
		return map;
	}
}
