package options;

public class Option3_BottomUp {

	public static void main(String[] args) {
		
		int n = 100000;
		int value = fibonacci(n);
		System.out.println(n+"th fib number is: "+ value );

	}
	
	//Building up the array, O(n) 
	public static int fibonacci(int n) {
//		if(n==1 || n==2)
//			return 1;
		int[] bottomUpArray = new int[n+1];
		bottomUpArray[1] = 1;
		bottomUpArray[2] = 1;

		for (int i = 3; i <= n; i++) {
			bottomUpArray[i] = bottomUpArray[i-1] + bottomUpArray[i-2]; 
		}
		
		return bottomUpArray[n];
	}
	
	

}
