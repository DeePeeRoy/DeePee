package packageTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class HashMapClass {

	public static void main(String[] args) {
		HashMap<Integer, String> Hmap = new HashMap<Integer, String>();
		
		Hmap.put(1, "Dharmpal");
		Hmap.put(5, "Patna");
		Hmap.put(2, "Kumar");
		Hmap.put(4, "India");
		Hmap.put(3, "Bihar");
		
		Set set = Hmap.entrySet();
		Iterator itr = set.iterator();
		
		while(itr.hasNext()){
			Map.Entry Mentry = (Map.Entry) itr.next();
			System.out.println("Set :  Key : "+Mentry.getKey()+ "   Value :  "+Mentry.getValue());
		}
		
		String iVal = Hmap.get(2);
		System.out.println("Index  value : "+iVal);
		
		String rVal = Hmap.remove(3);
		System.out.println("Removal value : "+rVal);
		
		Set set1 = Hmap.entrySet();
		Iterator itr1 = set1.iterator();
		while(itr1.hasNext()){
			Map.Entry Mentry1 = (Map.Entry) itr1.next();
			System.out.println("Set : Key : "+Mentry1.getKey()+ "  Value  :  "+Mentry1.getValue());
		}
	}
}
