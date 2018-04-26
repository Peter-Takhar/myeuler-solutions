//Question 9

/* A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a^2 + b^2 = c^2
For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc. */

public class Problem9 {

	public static void main(String[] args){
		long start = System.nanoTime();
		int product = 0;
		for (int c=0; c < 1000; c++){
			for (int b = 0; b < c; b++){
				for (int a = 0; a < b; a++){
					if ((Math.pow(a,2)+Math.pow(b,2)) == Math.pow(c,2)){
						if (a+b+c == 1000){
							product = a *b*c;
						}
					}
				}
			}
		}
		
		System.out.println(product);
		System.out.println((System.nanoTime() - start) / 1000000000.0 + " seconds");
		
	}

}
