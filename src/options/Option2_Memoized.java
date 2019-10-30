package options;

public class Option2_Memoized {

	public static void main(String[] args) {
		//say we need to get the nth fibonacci number
		int n =1000;
		int[] array = new int[n+1];
		int nth_value = fibonacci(n,array);
		System.out.println(n+"th fib number is: "+ nth_value );

	}
	
	//T(n) #calls * time it takes (T)
	//(2n +1 )  O(1)  = (2n+1) = O(n)
	
	public static int fibonacci(int n, int[] memo) {
		int result = 0;
		
		if(memo[n] != 0)
			return memo[n];
		
		if (n== 1 || n== 2)
			result = 1;
		else
			result = fibonacci(n-1, memo) + fibonacci(n-2, memo);
		
		memo[n] = result;
		
		return result;
	}

}
