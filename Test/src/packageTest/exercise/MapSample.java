package packageTest.exercise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapSample {
	
	public static void main(String[] args) {
		Map m = new HashMap();
		m.put(101, "Findu");
		m.put(101, "DeePee");
		System.out.println("Output  :::: >>>>>  "+m);
		
		System.out.println(" Iterator not allowed in Map and HashMap");
	}
}
