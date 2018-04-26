//Problem22 - Names Scores

/* Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand first names, begin by sorting it into alphabetical order. Then working out the alphabetical value for each name, multiply this value by its alphabetical position in the list to obtain a name score.

For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So, COLIN would obtain a score of 938 × 53 = 49714.

What is the total of all the name scores in the file?
*/

import java.util.*;
import java.util.regex.*;
import java.io.*;

public class Problem22{

	public static void main(String[] args) throws FileNotFoundException{
		long start = System.nanoTime();
		
		Set<String> nameSet = new TreeSet<String>();

		Scanner scan = new Scanner(new File("problem22.txt"));
		scan.useDelimiter(",");
		
		String pattern = "[a-zA-z]+";	
		Pattern regex = Pattern.compile(pattern);

		while (scan.hasNext()){
			Matcher m = regex.matcher(scan.next());
			while (m.find()){
				nameSet.add(m.group());;
			}
		}
		
		Iterator<String> iter = nameSet.iterator();
		int count = 0;
		long sum = 0;
		while (iter.hasNext()){
			count++;
			String name = iter.next();
			int worth = 0;
			for (int i=0; i<name.length(); i++){
				worth += name.charAt(i) - 'A'+1;
			}
			sum += (worth*count);
		}
	
		

		System.out.println(sum);
		System.out.println((System.nanoTime() - start)/1000000000.0 + " seconds");
	}
}
