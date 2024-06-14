package Assignments.assgn1;

public class SmallestDivisibleByN {
    public static long gcd(long a, long b){
		if (a==0 || b==0) 
		return 0; 
		if (a==b) return a; 
		if (a>b) return gcd(a-b, b); 
		return gcd(a, b-a); 
	} 
	public static long psb(long n, long k){ 
		long a = (long)Math.pow(10, k); 
		long res = gcd(a, n); 
		return ((a * n) / res); 
	} 
}
