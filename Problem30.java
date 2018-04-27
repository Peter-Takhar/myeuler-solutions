//Problem 30 - Digit Fifth powers

public class Problem30 {

    public static void main(String[] args){
        long start = System.nanoTime();
        
        System.out.println(sumOfDigitPowers(5));
        System.out.println((System.nanoTime() - start)/1000000000.0 + " seconds");
    }
    
    public static int sumOfDigitPowers(int power){
        
        int hLimit = (int) Math.pow(10, power+1);
        int sum = 0;
        int totalSum = 0;
        for (int i = 2; i< hLimit; i++){
            int temp = i;
            sum = 0;
            while (temp > 0){
                sum += (int)Math.pow((temp%10),power);
                temp /= 10;
            }
            
            if (i == sum)
                totalSum += i;
        }
        return totalSum;
    }
    
    
}
