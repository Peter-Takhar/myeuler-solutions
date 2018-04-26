//Problem 19 - Counting Sundays

/* You are given the following information, but you may prefer to do some research for yourself.

1 Jan 1900 was a Monday.
Thirty days has September,
April, June and November.
All the rest have thirty-one,
Saving February alone,
Which has twenty-eight, rain or shine.
And on leap years, twenty-nine.
A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.

How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
*/

import java.util.*;
import java.time.*;

public class Problem19 {

	public static void main(String[] args){
		long start = System.nanoTime();
		ArrayList<String> days = new ArrayList<>();
		days.add("MONDAY"); 
		days.add("TUESDAY"); 
		days.add("WEDNESDAY"); 				
		days.add("THURSDAY");	
		days.add("FRIDAY"); 
		days.add("SATURDAY");
		days.add("SUNDAY");
		
		int year = 1900;
		int sum = 0;
		while (year < 2001){
			for (Month m: Month.values()){
				int totalDays = 31;
				if (m.equals(Month.SEPTEMBER) || m.equals(Month.APRIL) ||
						m.equals(Month.JUNE) || m.equals(Month.NOVEMBER)){
						totalDays = 30;
				}
				if (m.equals(Month.FEBRUARY)){
					totalDays = 28;
					if (year % 4 == 0){
						totalDays = 29;
						if (year % 100 == 0 && year % 400 != 0)
							totalDays = 28;
					}
				}


				for (int i=1; i<=totalDays; i++){
					if (i == 1 && days.get(i%7-1).equals("SUNDAY") && 
							year > 1900)
						sum++;
				}
				List<String> temp = new ArrayList<>();

				for(int i=0; i<7;i++){
					temp.add(days.get((int)Math.abs((totalDays%7+i)%7.0)));
				}
				days.clear();
				for(String day: temp){
					days.add(day);
				}
					
			}			
				
			year++;
		}
			
		
		System.out.println(sum);
		

		System.out.println((System.nanoTime() - start)/1000000000.0 + " seconds");
	}

}
