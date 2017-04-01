package problems;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Hiking {
	public static void main(String[] args) throws FileNotFoundException{
		String path = "C:\\Users\\saibu\\Desktop\\SampleFiles\\";
		
//		String path = "E:\\JudgeFiles\\";
		
		Scanner file = new Scanner(new File(path + "hiking.txt"));
		
		int number = file.nextInt();
		
		for(int i = 0; i < number; i++){
			int[] array = new int[10];
			for(int j = 0; j < 10; j++){
				if(j%2==0){
					file.nextLine();
				}
				array[j] = file.nextInt();
			}
			
		}
	}
}
