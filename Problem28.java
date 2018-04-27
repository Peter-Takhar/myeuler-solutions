//Problem 28 -  Number Spiral Diagonals

public class Problem28{
	
	public static void main(String[] args){
		long start = System.nanoTime();
                
                System.out.println(sum(1001));

		System.out.println((System.nanoTime()-start)/1000000000.0 + " seconds");
	
	}
	
	public static int sum(int size){
	   int sum = 1;
	   int add = 2;
	   int num = 1;
	   for (int i = 3; i<=size; i+=2){
	        for (int k=0;k<4;k++){
	              num += add;
	              sum += num;
	        }
	        add += 2;
	   }
	   return sum;
	}

}


