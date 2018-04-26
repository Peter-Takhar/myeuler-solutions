//Question 5

 /* 
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20? */

public class Problem5 {
	
	public static void main(String[] args){

	long start = System.nanoTime();
	
	int largest = 2;	
	
	for (int i = 2; i < 1000000000 ; i++){
		boolean check = true;
		for (int k = 2; k <= 20; k++){
			if (i % k != 0){
				check = false;
				break;	
			}
		}
		if (check){
			largest = i;
			break;
		}
	
	}
	System.out.println(largest);
		
	System.out.println((System.nanoTime() - start) / 1000000000.0 + " seconds");		

	}

}
