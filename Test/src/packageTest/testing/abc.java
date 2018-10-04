package packageTest.testing;

public class abc {
	static String findNumber(int arr[], int n, int k)
    {
        if (arr[n-1] == k)
            return "Found";
  
        int backup = arr[n-1];
        arr[n-1] = k;
  
        for (int i = 0; ;i++)
        {
            if (arr[i] == k)
            {
                arr[n-1] = backup;
  
                if (i < n-1) {
                	return "Found1";
                }else {
                	return "Not Found";
                }
                    //return "Found1";
            }
        }
    }
     
    public static void main (String[] args) 
    {
        int arr[] = {4, 6, 1, 5, 8};
        int n = arr.length;
        int x = 1;
        System.out.println(findNumber(arr, n, x));
    }
}
