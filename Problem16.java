//Problem 16 - Power digit sum

/* 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

What is the sum of the digits of the number 2^1000?

*/

import java.math.BigInteger;

public class Problem16 {
	
	public static void main(String[] args){
		long start = System.nanoTime();
		
		BigInteger product = new BigInteger("1");
		BigInteger two = new BigInteger("2");		


		for (int i = 0; i < 1000; i++){
			product = product.multiply(two);
		}

		String num = product.toString();
		long sum = 0;
		
		for (int i = 0; i < num.length(); i++){
			sum += Long.valueOf(num.charAt(i) - '0');
		}
			
		System.out.println(sum);		
		System.out.println((System.nanoTime()-start)/1000000000.0 + " seconds");
 
	}
}
