//Problem 67 - Maximum Path Sum II

/** 
By starting at the top of the triangle below and moving to adjacent numbers on the row below, the maximum total from top to bottom is 23.

3
7 4
2 4 6
8 5 9 3

That is, 3 + 7 + 4 + 9 = 23.

Find the maximum total from top to bottom of the triangle below:

*/

import java.util.*;
import java.io.*;

public class Problem67 {

	public static void main(String[] args) throws FileNotFoundException{

		long start = System.nanoTime();

		Scanner scan = new Scanner(new File("problem67.txt"));
		long grid[][] = new long[100][100];
		int row = 0;
		
		while (scan.hasNext()){
			int column= 0;
			String line = scan.nextLine();
			String[] split = line.split(" ");
		
			for (String num: split){
				grid[row][column] = Long.valueOf(num);
				column++;
			}
			row++;		
		}
		



		for (int i=1; i<row;i++){
			for (int k=0; k<row; k++){
				if (grid[i][k] == 0) break;
				if (k-1 < 0){
					grid[i][k] += grid[i-1][k];
					
				} else if (grid[i][k-1] == 0){
					grid[i][k] += grid[i-1][k-1];
				} else {
					if (grid[i-1][k] > grid[i-1][k-1])
						grid[i][k] += grid[i-1][k];
					else
						grid[i][k] += grid[i-1][k-1];
				}
			}
		}		
		
		
		long sum = 0;
		for (int i=0; i<row;i++){
			for (int k=0; k<row; k++){
				if (grid[i][k] > sum)
					sum = grid[i][k];
				System.out.print(grid[i][k] + " ");
			}
			System.out.println();
		}
		
		System.out.println(sum);
		System.out.println((System.nanoTime() - start)/1000000000.0 + " seconds");

	}
	

}
