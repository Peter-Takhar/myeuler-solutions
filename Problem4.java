//Question 4

/*A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers. */

public class Problem4 {

	public static void main(String[] args){
		
		long start = System.nanoTime();

		int largest = 0;
		for (int i = 100; i <= 999; i++){
			for (int j = 100; j <= 999; j++){
				
				String product = (i*j) + "";
				boolean check = true;
				for (int k = 0; k <= (product.length()/2); k++){
					 if(product.charAt(k) != product.charAt(product.length()-1-k)){
						check = false;
						break;
					}
							
				}
				
				if (check && (i*j > largest)){
					largest = i*j;
				}	
				
			}
		}
		System.out.println(largest + " end this");
		
		System.out.println((System.nanoTime() - start) / 1000000000.0 + " seconds");
	}
}
