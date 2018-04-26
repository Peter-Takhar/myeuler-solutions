//Question 13

/*Work out the first ten digits of the sum of the following one-hundred 50-digit numbers. found in problem13.txt */

import java.util.*;
import java.io.*;

public class Problem13 {

	public static void main(String[] args) throws FileNotFoundException{
		long start = System.nanoTime();
		Scanner scan = new Scanner(new File ("problem13.txt"));
		
	
		String[] numbers = new String[100];
		int index = 0;
		
		//fill a array of strings with numbers
		while (scan.hasNext()){
			numbers[index] = scan.nextLine();
			index++;
		}
		long sum = 0;
		
		//loop through each string, get first ten digits,
		for (String num: numbers){
			String cutString = num.substring(0, 11);
			long cutNum = Long.parseLong(cutString);
			sum += cutNum;
		}
		
		System.out.println(String.valueOf(sum).substring(0,10));
		System.out.println((System.nanoTime()-start)/1000000000.0 + " seconds");
	}

}
