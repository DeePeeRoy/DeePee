package packageTest.HashMap;

import org.json.JSONArray;

public class ArrayToJson {

	public static void main(String args[]) {
	      String [] myArray = {"JavaFX", "HBase","", "JOGL"," ", "WebGL"};
	      JSONArray jsArray = new JSONArray();
	      for (int i = 0; i < myArray.length; i++) {
	         jsArray.put(myArray[i]);
	      }
	      System.out.println(jsArray);
	   }
}
