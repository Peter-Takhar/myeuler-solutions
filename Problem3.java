//Question 3



/* The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ? */


public class Problem3{

	public static void main(String[] args){
		
		long largest = 2L;	
		long limit = 600851475143L;
		

		while (limit != 1){
			if (limit%largest == 0){
				limit /= largest;	
			}
			else 
				largest++;
		}

		System.out.println(largest);
		for (long i = 2; i < limit; i++){
			if (limit % i == 0){
				largest = i;
				limit /= i;
			}
			
		}

		System.out.println(largest);
	}
}

