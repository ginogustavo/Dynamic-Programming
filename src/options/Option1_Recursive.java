package options;

public class Option1_Recursive {

	public static void main(String[] args) {
		
		//say we need to get the nth fibonacci number
		int n =40;
		int nth_value = fibonacci(n);
		System.out.println(n+"th fib number is: "+ nth_value );
	}
	
	
	/**
	 * The time this recursion takes grows exponentially: 2^n. Then, not efficient.
	 * 
	 * @param n
	 * @return value of nth fib number
	 */
	@Deprecated
	public static int  fibonacci(int n) {
		int result = 0;
		if (n == 1 || n ==2) 
			result = 1;
		else
			result = fibonacci(n-1) + fibonacci(n-2);
		
		return result;
	}

}
