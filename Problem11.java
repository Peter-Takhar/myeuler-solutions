//Question 11

/* What is the greatest product of four adjacent numbers in the same direction (up, down, left, right, or diagonally) in the 20×20 grid? */


import java.util.*;
import java.io.*;
public class Problem11{
	
	public static void main(String[] args) throws FileNotFoundException{
		long start = System.nanoTime();
		
		Scanner scan = new Scanner(new File("problem11.txt"));

		int[][] grid = new int[20][20];
		int rowIndex=0;
		
		while (scan.hasNext()){
		
			String line = scan.nextLine();
			String[] tokens = line.split(" ");

			for (int i=0; i<grid[0].length; i++){
				grid[rowIndex][i] = Integer.parseInt(tokens[i]);
			}
			rowIndex++;
		}

		//up,down,right,left, diagonal upleft,diagonal downleft,//diagonal upright, diagonal downright
		
		int largest = 0;
		for (int i=0; i < grid.length; i++){
			for (int j=0; j<grid[0].length; j++){
				int hold = 0;
				//down
				if (i+4 < 20){
					hold = grid[i][j] * grid[i+1][j] * grid[i+2][j] * grid[i+3][j];
					largest = hold < largest ? largest : hold;
				}
				//up
				if (i-4 > -1){
					hold = grid[i][j] * grid[i-1][j] * grid[i-2][j] * grid[i-3][j];
					largest = hold < largest ? largest : hold;
				}
				//left
				if (j-4 > -1){
					hold = grid[i][j] * grid[i][j-1] * grid[i][j-2] * grid[i][j-3];
					largest = hold < largest ? largest : hold;	
				}
				//right
				if (j+4 < 20){
					hold = grid[i][j] * grid[i][j+1] * grid[i][j+2] * grid[i][j+3];
					largest = hold < largest ? largest : hold;
				}
				//diag upleft
				if (i-4 > -1 && j-4 > -1){
					hold = grid[i][j] * grid[i-1][j-1] * grid[i-2][i-2] * grid[i-3][j-3];
					largest = hold < largest ? largest : hold;
				}
				//diag downleft
				if (i+4 < 20 && j-4 > -1){
					hold = grid[i][j] * grid[i+1][j-1] * grid[i+2][j-2] * grid[i+3][j-3];
					largest = hold < largest ? largest : hold;
				}
				//diag upright
				if (i-4 >-1 && j+4 < 20){
					hold = grid[i][j] * grid[i-1][j+1] * grid[i-2][j+2] * grid[i-3][j+3];
					largest = hold < largest ? largest : hold;
				}
				//diag downright
				if (i+4 < 20 && j+4 < 20){
					hold = grid[i][j] * grid[i+1][j+1] * grid[i+2][j+2] * grid[i+3][j+3];
					largest = hold < largest ? largest : hold;
				}

			} 
		}

		System.out.println(largest);
		System.out.println((System.nanoTime()-start)/1000000000.0+"seconds");
	}

}
