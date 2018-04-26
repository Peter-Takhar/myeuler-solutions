//Question 6

/* The sum of the squares of the first ten natural numbers is,

1^2 + 2^2 + ... + 10^2 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)^2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum. */

public class Problem6 {

	public static void main(String[] args){
		long start = System.nanoTime();
		
		long sumOfSquares = 0;
		long squareOfSum = 0;
		
		for (int i = 1; i <=100; i++){
			sumOfSquares += (long)Math.pow(i,2);
			squareOfSum += i;
		}
		
		System.out.println((long)Math.pow(squareOfSum,2) - sumOfSquares);	

		System.out.println((System.nanoTime() - start) / 1000000000.0 + " seconds");
		
	}

}
