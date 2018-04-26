//Problem 17 - Number letter counts

/* f the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?

NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. The use of "and" when writing out numbers is in compliance with British usage.

*/


import java.util.*;

public class Problem17 {

	public static void main(String[] args){
		long start = System.nanoTime();
		
		Map<Integer, String> numberMap = new HashMap<>();
		numberMap.put(0, "");
		numberMap.put(1,"one");
		numberMap.put(2,"two");
		numberMap.put(3,"three");
		numberMap.put(4,"four");
		numberMap.put(5,"five");
		numberMap.put(6,"six");
		numberMap.put(7,"seven");
		numberMap.put(8,"eight");
		numberMap.put(9,"nine");
		numberMap.put(10, "ten");
		numberMap.put(11, "eleven");
		numberMap.put(12, "twelve");
		numberMap.put(13, "thirteen");
		numberMap.put(14, "fourteen");
		numberMap.put(15, "fifteen");
		numberMap.put(16, "sixteen");
		numberMap.put(17, "seventeen");
		numberMap.put(18, "eighteen");
		numberMap.put(19, "nineteen");
		numberMap.put(20, "twenty");
		numberMap.put(30, "thirty");
		numberMap.put(40, "forty");
		numberMap.put(50, "fifty");
		numberMap.put(60, "sixty");
		numberMap.put(70, "seventy");
		numberMap.put(80, "eighty");
		numberMap.put(90, "ninety");
		numberMap.put(100, "hundred");
		numberMap.put(1000, "thousand");
		
		long sum = 0;
		
		for (int i = 1; i <= 1000; i++){
			String number = "";
			if (i < 20)
				number += numberMap.get(i);
			else if (i < 100){
				number += numberMap.get(i/10*10) + " ";
				number += numberMap.get(i%10);
			} else if (i < 1000){
				number += numberMap.get(i/100) + " ";
				number += numberMap.get(100);
				if (i%100 != 0){
					number += " and ";
					if (i%100 < 20)
						number += numberMap.get(i%100);
					else {
						number += numberMap.get((i%100)/10*10);
						if ((i%10)%10 != 0)
							number += "-";
						number += numberMap.get((i%10)%10);
					}
				}
			} else {
				number += numberMap.get(i/1000) + " ";
				number += numberMap.get(1000);
			}
				
			System.out.println(number);	
			
			for (int k=0; k<number.length(); k++){
				if (number.charAt(k) != ' ' && number.charAt(k) != '-')
					sum++;
				
			}
		}
		System.out.println("Sum: " + sum);
		System.out.println((System.nanoTime() - start)/1000000000.0 + " seconds");

	}
}


