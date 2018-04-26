//Problem 25 - 1000 digit Fibonacci

/*The Fibonacci sequence is defined by the recurrence relation:

Fn = Fn−1 + Fn−2, where F1 = 1 and F2 = 1.
Hence the first 12 terms will be:

F1 = 1
F2 = 1
F3 = 2
F4 = 3
F5 = 5
F6 = 8
F7 = 13
F8 = 21
F9 = 34
F10 = 55
F11 = 89
F12 = 144
The 12th term, F12, is the first term to contain three digits.

What is the index of the first term in the Fibonacci sequence to contain 1000 digits?
*/

import java.math.BigInteger;

public class Problem25 {

	public static void main(String[] args){
		long start = System.nanoTime();
		
		long index = 2;
		BigInteger f1 = new BigInteger("1");
		BigInteger f2 = new BigInteger("1");

		while (f2.toString().length() < 1000){
			BigInteger temp = f2;
			f2 = f2.add(f1);
			f1 = temp;
			index++;
		}
	
		System.out.println(index);
		System.out.println((System.nanoTime() - start)/1000000000.0 + " seconds");

	}

}
