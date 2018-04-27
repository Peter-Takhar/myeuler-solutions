//Problem 29 - Distinct Powers

import java.util.*;
import java.math.BigInteger;

public class Problem29{

    public static void main(String[] args){
        long start = System.nanoTime();
        
        
        System.out.println(numOfDistinctPrimes(100,100));
        
        System.out.println((System.nanoTime() - start)/1000000000.0 + " seconds");
    }
    
    public static int numOfDistinctPrimes(long a, long b){
        Set<BigInteger> set = new TreeSet<>();
        for (long i = 2; i<=a;i++){
            for (long k=2; k<=b; k++){
                set.add(power(i,k));
            }
        }
        return set.size();
        
    }
    
    public static BigInteger power(long a, long b){
        BigInteger product = new BigInteger("1");
        BigInteger mul = BigInteger.valueOf(a);
        for (int i = 0; i<b; i++){
            product = product.multiply(mul);  
        }
        return product;
    }
}
