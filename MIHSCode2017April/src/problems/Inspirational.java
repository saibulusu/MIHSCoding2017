package problems;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Inspirational {
	
	
	public static void main(String[] args) throws FileNotFoundException{
		String path = "C:\\Users\\saibu\\Desktop\\SampleFiles\\";
		
//		String path = "E:\\JudgeFiles\\";
		
		Scanner file = new Scanner(new File(path + "inspiring.txt"));
		
		int number = file.nextInt();
		file.nextLine();
		
		
		
		String[] array = new String[number];
		for(int i = 0; i < number; i++){
			array[i] = file.nextLine();
		}
		
		System.out.println("/----------\\");
		for(int i = 0; i < number; i++){
			array[i].trim();
			System.out.println("\\*!" + array[i] + "!*/");
		}
		System.out.println("\\----------/");
	}
}
