package packageTest.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapLooping {

	public static void main(String[] args) {
		HashMap<Integer, String> Hmap = new HashMap<Integer, String>();
		
		Hmap.put(1, "Dharmpal");
		Hmap.put(5, "Patna");
		Hmap.put(2, "Kumar");
		Hmap.put(4, "India");
		Hmap.put(3, "Bihar");
		
		System.out.println(" Through for Loop ");
		for(Map.Entry me : Hmap.entrySet()){
			System.out.println("Set :   Key : "+me.getKey()+"  Value :  "+me.getValue());
		}
		
		
		System.out.println(" Through While loop ");
		
		
	}
}
