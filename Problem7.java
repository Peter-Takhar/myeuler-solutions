//Question 7

/* By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number? */

public class Problem7 {

	public static void main(String[] args){
		
		long start = System.nanoTime();
		int count = 0;
		final int LIMIT = 10001;
		int n = 1000000;
		int largest = 0;

		for (int k = 2; k<=n; k++){
			if (count == LIMIT)
				break;
			boolean check = true;
			for (int i = 2; i <= (int)Math.sqrt(k);i++){
				if (k % i == 0){
					check = false;
					break;
				}
			}
			if (check){
				largest = k;
				count++;
			}
		} 
			
		System.out.println(largest);
		
		System.out.println((System.nanoTime() - start) / 1000000000.0 + " seconds");
		
	}

}
