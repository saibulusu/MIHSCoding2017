package problems;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Array2D {
	public static void main(String[] args) throws FileNotFoundException{
		//String path = "C:\\Users\\saibu\\Desktop\\SampleFiles\\";
		
		String path = "E:\\JudgeFiles\\";
		
		Scanner file = new Scanner(new File(path + "array2d.txt"));
		
		int columns = file.nextInt();
		int rows = file.nextInt();
		
		int[][] arr = new int[rows][columns];
		
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < columns; j++){
				arr[i][j] = file.nextInt();
			}
		}
		for(int i = 0; i < rows; i++){
			int counter = i+1;
			for(int j = 0; j < columns; j++){
				if(arr[i][j] % 3 == 0 && arr[i][j] % 5 == 0){
					arr[i][j] = arr[i][j]/ 5;
				}
				else if(arr[i][j] % 5 == 0){
					arr[i][j] = (int)(Math.pow(arr[i][j], 1.0/counter) + 0.5);

				}
				else if(arr[i][j] % 3 == 0){
					arr[i][j] = arr[i][j] * arr[i][j];
				}
				
				else{
					arr[i][j] = arr[i][j];
				}
			}
		}
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < columns; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
	}
}
