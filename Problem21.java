//Problem 21 - Amicable numbers

/* 
Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and each of a and b are called amicable numbers.

For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.

Evaluate the sum of all the amicable numbers under 10000. */

import java.util.*;


public class Problem21 {

	public static void main(String[] args){
		long start = System.nanoTime();	
		ArrayList<Integer> list = new ArrayList<>();
		long sum = 0;

		for (int i = 1; i<10000; i++){
			if (list.contains(i)){
				System.out.println(i);
				while(list.contains(i))
					i++;
			}
			Set<Integer> test = new TreeSet<Integer>();
			for (int k=1; k<=(int)Math.sqrt(i); k++){
				if (i % k == 0){
					test.add(k);
					test.add(i/k);
				}
			}
			test.remove(i);

			long sumA = 0;
			Iterator<Integer> iter = test.iterator();
			while (iter.hasNext()){
				sumA += (long)iter.next();
			}
		
			test.clear();

			for (int k=1; k<=(int)Math.sqrt(sumA); k++){
				if (sumA % k == 0){
					test.add(k);
					test.add((int)sumA/k);
					
				}
	
			}
			test.remove((int)sumA);

			long sumB = 0;
			iter = test.iterator();
			while (iter.hasNext()){
				sumB += (long)iter.next();
			}
			
			if (sumB == i && sumA != sumB){
				sum += (long)i + sumA;
				list.add(i);
				list.add((int)sumA);
			}
	
		}
		
		System.out.println(sum);
		
		System.out.println((System.nanoTime() - start)/1000000000.0 + " seconds");
		
	}
}
