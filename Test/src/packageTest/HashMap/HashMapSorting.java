package packageTest.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapSorting {

	public static void main(String[] args) {
		HashMap<Integer, String> Hmap = new HashMap<Integer, String>();
		
		Hmap.put(1, "Dharmpal");
		Hmap.put(5, "Patna");
		Hmap.put(2, "Kumar");
		Hmap.put(4, "India");
		Hmap.put(3, "Bihar");
		
		System.out.println(" Before Sorting  :: ");
		Set set = Hmap.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()){
			Map.Entry me = (Map.Entry)itr.next();
			System.out.println("Set :  Key : "+me.getKey()+ "   Value :  "+me.getValue());
		}
		Map<Integer, String> map = new TreeMap<Integer, String>(Hmap);
		System.out.println(" After Sorting  ::  ");
		Set set1 = Hmap.entrySet();
		Iterator itr1 = set1.iterator();
		while(itr1.hasNext()){
			Map.Entry me1 = (Map.Entry)itr1.next();
			System.out.println("Set :  Key : "+me1.getKey()+"  Value :  "+me1.getValue());
		}
	}
}
