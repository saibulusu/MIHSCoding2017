package problems;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Distance1 {
	public static void main(String[] args) throws FileNotFoundException{
		String path = "C:\\Users\\saibu\\Desktop\\SampleFiles\\";
		
//		String path = "E:\\JudgeFiles\\";
		
		Scanner file = new Scanner(new File(path + "inspiring.txt"));
		
		int number = file.nextInt();
		file.nextLine();
		
		HashMap<String, Double> map  = new HashMap<>();
		
		for(int i = 0; i < number; i++){
			String[] numbers = file.nextLine().split(" ");
			if(numbers[0] == "A"){
				
			}
		}
	}

}
