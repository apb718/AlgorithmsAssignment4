
public class ItalianNumbers {

	public int fib(int n) {
		
		int[] f = new int[n+2];
		f[0] = 0;
		f[1] = 1;
		return fib(n, f);
		
	}
	
	private int fib(int n, int[] accum) {
		if(n <= 1) {
			return n;
		}
		accum[n] = fib(n-1, accum) + fib(n-2, accum); 
		return accum[n];
		 
		
	}
	
}
