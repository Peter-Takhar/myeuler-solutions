//Question 15

/* Lattice paths

Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner.


How many such routes are there through a 20×20 grid? */

import java.util.*;

public class Problem15 {

	public static void main(String[] args){
		//get middle of pascal's triangle
		long start = System.nanoTime();
		
		ArrayList<Long> first = new ArrayList<>();
		first.add(1L);
		first.add(1L);
		
		ArrayList<Long> second = new ArrayList<>();

		int count = 0;
		while (count < 20){
			second.clear();
			second.add(1L);
			for (int i = 1; i < first.size(); i++){
				second.add(first.get(i-1) + first.get(i));
			}
			second.add(1L);
			first.clear();
			first.addAll(second);
			if (first.size() % 2 != 0)
				count++;
		}
		System.out.println(first);
		System.out.println(first.size());
		System.out.println(first.get(first.size()/2));
		

		System.out.println((System.nanoTime() - start)/1000000000.0 + " seconds");
	
	}
} 
