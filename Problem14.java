//Question 14

/* Longest Collatz sequence

The following iterative sequence is defined for the set of positive integers:

n → n/2 (n is even)
n → 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:

13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million. */

public class Problem14 {
	
	public static void main(String[] args){
		long start = System.nanoTime();
		long startingNumber = 0;
		long largestChain = 0;

		for (long i = 2; i < 1000000; i++){
			System.out.println(i);
			long count = 0;
			long num = i;

			while (num != 1){
				if (num % 2 == 0){
					num = even(num);
				}
				else{
					num = odd(num);
				}
				count++;
			}

			if (count > largestChain){
				largestChain = count;
				startingNumber = i;
			}
		}
		
		System.out.println(startingNumber);
		System.out.println((System.nanoTime() - start)/1000000000.0 + " seconds");
	}
	
	public static long even(long n){
		return n/2;
	}
	
	public static long odd(long n){
		return 3*n+1;
	}
}

