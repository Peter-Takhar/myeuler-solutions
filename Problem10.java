//Question 10

/* The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million. */

public class Problem10{

	public static void main(String[] args){
		long start = System.nanoTime();

		long sum = 0;
		int count = 0;
		
		for (long i = 2; i < 2000000; i++){
			long factor = (long) Math.sqrt(i);
			boolean check = true;
			for (long k = 2; k<=factor; k++){
				if (i % k == 0){
					check = false;
					break;
				}
			}
			if (check){
				sum += i;
			}
		}
				

		System.out.println(sum);

		System.out.println((System.nanoTime()-start)/1000000000.0 + "seconds");

	}

}
