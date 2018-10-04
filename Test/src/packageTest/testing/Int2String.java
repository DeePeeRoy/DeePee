package packageTest.testing;

public class Int2String {

	public static void main(String [] args) {
		int n = 200;
		String s = String.valueOf(n);
		System.out.println("Converted Output :  "+s);
		String i = Integer.toString(n).trim();
		System.out.println(" -------->>> i : "+i);
	}
}
