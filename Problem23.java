//Problem 23 - Non-abundant Sums

/* A perfect number is a number for which the sum of its proper divisors is exactly equal to the number. For example, the sum of the proper divisors of 28 would be 1 + 2 + 4 + 7 + 14 = 28, which means that 28 is a perfect number.

A number n is called deficient if the sum of its proper divisors is less than n and it is called abundant if this sum exceeds n.

As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16, the smallest number that can be written as the sum of two abundant numbers is 24. By mathematical analysis, it can be shown that all integers greater than 28123 can be written as the sum of two abundant numbers. However, this upper limit cannot be reduced any further by analysis even though it is known that the greatest number that cannot be expressed as the sum of two abundant numbers is less than this limit.

Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers.

*/

import java.util.*;
public class Problem23 {

	public static void main(String[] args){
		long start = System.nanoTime();
		
		//find an abundant number
		//add abundant number to set
		//once done, find all sums of two abundant numbers
		//substract that set from set of all number below 28123
		Set<Integer> divisorSet = new TreeSet<>();
		Set<Integer> abundantSet = new TreeSet<>();
		Set<Integer> sumSet = new TreeSet<>();
		Set<Integer> allSet = new TreeSet<>();

		for (int i=1; i<=28123; i++){

			divisorSet.clear();
			for (int k=1; k<=(int)Math.sqrt(i); k++){
				if (i % k ==0){
					divisorSet.add(k);
					divisorSet.add(i/k);
				}
			}
			divisorSet.remove(i);
			int sum = 0;
			Iterator<Integer> iter = divisorSet.iterator();
			while (iter.hasNext()){
				sum += iter.next();
			}
			
			if (sum > i)
				abundantSet.add(i);
			allSet.add(i);
		}
			
		Iterator<Integer> iterA = abundantSet.iterator();
		Iterator<Integer> iterB;
		
		while (iterA.hasNext()){
				int num = iterA.next();
				iterB = abundantSet.iterator();
				while (iterB.hasNext()){
					 sumSet.add(num + iterB.next());
				}
		}
		
		allSet.removeAll(sumSet);
		Iterator<Integer> iter = allSet.iterator();
		long sum = 0;
		while (iter.hasNext()){
			sum += (long) iter.next();
		}
		
	
		System.out.println(sum);
		System.out.println((System.nanoTime() - start)/1000000000.0 + " seconds");
	}
}
