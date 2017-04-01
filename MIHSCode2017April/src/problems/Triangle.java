package problems;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) throws FileNotFoundException{
		String path = "C:\\Users\\saibu\\Desktop\\SampleFiles\\";
		
//		String path = "E:\\JudgeFiles\\";
		
		Scanner file = new Scanner(new File(path + "triangle.txt"));
		
		int number = file.nextInt();
		file.nextLine();
		
		for(int i = 0; i < number; i++){
			System.out.println();
			int a = file.nextInt();
			for(int row = 0; row < a; row++){
				for(int space = 0; space < a - 1 - row; space++){
					System.out.print(" ");
				}
				System.out.print("/");
				for(int space = 0; space < 2 * row; space++){
					if(row == a-1){
						System.out.print("_");
					} else{
						System.out.print(" ");
					}
				}
				System.out.print("\\");
				System.out.println();
			}
		}
	}

}
