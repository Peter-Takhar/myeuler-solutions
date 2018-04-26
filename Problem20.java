//Problem 20 - Factorial digit sum

/*n! means n × (n − 1) × ... × 3 × 2 × 1

For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

Find the sum of the digits in the number 100!

*/

import java.math.BigInteger;
public class Problem20{

	public static void main(String[] args){
		long start = System.nanoTime();
		
		BigInteger product = new BigInteger("1");
		
		for (int i=100; i > 0; i--){
			product = product.multiply(new BigInteger(i + ""));
	
		}
		String number = product.toString();
		
		long sum = 0;
		for (int i=0; i< number.length();i++){
			long digit = Character.getNumericValue(number.charAt(i));
			sum += digit;
		}
		
		System.out.println(sum);
		System.out.println((System.nanoTime() - start)/1000000000.0 + " seconds");

	}
}
