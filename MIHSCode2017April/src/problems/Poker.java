package problems;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Poker {
	public static void main(String[] args) throws FileNotFoundException{
		String path = "C:\\Users\\saibu\\Desktop\\SampleFiles\\";
		
//		String path = "E:\\JudgeFiles\\";
		
		
		Scanner file = new Scanner(new File(path + "poker.txt"));
		
		
		HashMap<String, Integer> map = new HashMap();
		
		int number = file.nextInt();
		String[] array = new String[number];

		
		file.nextLine();
		
		for(int i = 0; i < number; i++){
			array[i] = file.nextLine();
			
		}
		
		for(int i = 0; i < number; i++){
			int max = 0;
			for(int j = 0; j < array.length; j++){
				map.put(array[j], +1);
			}
			for(int j = 0; j < array.length; j++ ){
				if(map.containsValue(j)){
					max = j;
				}
			}
			
			
		}
		
		
		
	}
}
