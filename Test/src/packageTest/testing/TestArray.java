package packageTest.testing;

public class TestArray {

	static void min(int arr[]) {
		int min = arr[0];
		for(int i=1; i<arr.length; i++)
		if(min>arr[i])
			min = arr[i];
		System.out.println("Minimum : "+min);
	}
	
	public static void main(String args[]) {
	int a[] = {34323,34343,63434,56564,};
	min(a);
	}
}
