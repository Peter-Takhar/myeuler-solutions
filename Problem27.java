//Problem27 - Quadratic Primes

/* Euler discovered the remarkable quadratic formula:

n^2+n+41
It turns out that the formula will produce 40 primes for the consecutive integer values 0≤n≤39. However, when n=40,40^2+40+41=40(40+1)+41 is divisible by 41, and certainly when n=41,41^2+41+41 is clearly divisible by 41.

The incredible formula n2−79n+1601 was discovered, which produces 80 primes for the consecutive values 0≤n≤79. The product of the coefficients, −79 and 1601, is −126479.

Considering quadratics of the form:

n^2+an+b, where |a|<1000 and |b|≤1000

where |n| is the modulus/absolute value of n
e.g. |11|=11 and |−4|=4
Find the product of the coefficients, a and b, for the quadratic expression that produces the maximum number of primes for consecutive values of n, starting with n=0.

*/

public class Problem27{

	public static void main(String[] args){
		long start = System.nanoTime();
		int max = 0;
		int product = 0; 
		for (int i =-1000; i < 1000; i++){
			for (int k=-1000; k<=1000; k++){
				int count = numOfPrimes(i,k);
				if (count > max){
					max = count;
					product = i * k;
			
				}
			} 	
		}
		System.out.println(max);
		System.out.println(product);
		System.out.println((System.nanoTime() - start)/1000000000.0 + " seconds");
	}	

	public static int numOfPrimes(int a, int b){
		int index = 0;
		int sum = index*index + a*index + b;
		while (isPrime(sum)){
			index++;
			sum = index*index + a*index + b;
			
		}
		return index;
		
	}

	public static boolean isPrime(int a){
		if (a <= 1) return false;
		for (int i=2; i<=(int)Math.sqrt(a);i++){
			if (a%i==0) return false;
		}
		return true;
	}
	
}
