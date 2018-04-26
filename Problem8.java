//Question 8

/* Find the thirteen adjacent digits in the 1000-digit number that have the greatest product. What is the value of this product? */

import java.util.Scanner;
import java.io.*;

public class Problem8 {

	public static void main(String[] args) throws FileNotFoundException{
		long start = System.nanoTime();
		
		Scanner scan = new Scanner(new File("Problem8.txt"));
		
		String number = "";
		while (scan.hasNext()){
			number += scan.nextLine();
		}
		long largest = 0L;

		for (int i = 13; i < number.length(); i++){
			long hold = 1L;
			for (int k = i-13; k < i; k++){
				hold *= Character.getNumericValue(number.charAt(k));
			}
			if (hold > largest)
				largest = hold;
		}

		System.out.println(largest);
		
		System.out.println((System.nanoTime() - start) / 1000000000.0 + " seconds");
	}

}
