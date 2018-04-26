//Problem26 - Reciprocal cycles

/*

A unit fraction contains 1 in the numerator. The decimal representation of the unit fractions with denominators 2 to 10 are given:

1/2	= 	0.5
1/3	= 	0.(3)
1/4	= 	0.25
1/5	= 	0.2
1/6	= 	0.1(6)
1/7	= 	0.(142857)
1/8	= 	0.125
1/9	= 	0.(1)
1/10	= 	0.1
Where 0.1(6) means 0.166666..., and has a 1-digit recurring cycle. It can be seen that 1/7 has a 6-digit recurring cycle.

Find the value of d < 1000 for which 1/d contains the longest recurring cycle in its decimal fraction part.

*/

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.*;
 	
public class Problem26 {

	public static void main(String[] args){
		long start = System.nanoTime();

		BigDecimal one = BigDecimal.ONE;
		
		int maxRecurrance = 0;
		String maxDenom = "";

		MathContext mc = new MathContext(30, RoundingMode.HALF_UP);
		for (int i = 2; i<50; i++){
			BigDecimal denom = new BigDecimal(i);
			String number = one.divide(denom, mc).toString();
			//System.out.println(number.substring(0, number.length()-1));
			int recurrance = numOfRepeating(
								number.substring(2, number.length()-1));
			if (recurrance > maxRecurrance){
				maxRecurrance = recurrance;
				maxDenom = number;
			}
		} 
		
		System.out.println(maxRecurrance);
		System.out.println(maxDenom);
		System.out.println((System.nanoTime() - start)/1000000000.0 + " seconds");
	

	}

	public static int numOfRepeating(String number){
			/*Set<String> digits = new LinkedHashSet<String>();

			for (int i = 0; i < number.length(); i++){
				digits.add(String.valueOf(number.charAt(i)));
			}

			String cycle = "";
			for (String s : digits){
				cycle += s;
			}
	
			int recurrance = cycle.length();
			
			if (number.length() < recurrance*2)
				return 0;
			
			System.out.println(recurrance);
			String part = number.substring(recurrance+1, 
											recurrance*2+2);
			if (cycle.compareTo(part) == 0)
				return recurrance;
			else
				return 0;*/
			ArrayList<String> digits = new ArrayList<String>();
			String sub = "":

			for (int i=number.length(); i>0; i--){
				String num = String.valueOf(number.charAt(i));
				if (digits.contain(num)) break;
				digits.add(num);
				sub += num;
			}

			if (
		
		}
}
