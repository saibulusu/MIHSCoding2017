package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sample {
	
	
	public static void main(String[] args) throws FileNotFoundException{
		String path = "C:\\Users\\saibu\\Desktop\\SampleFiles\\";
		
//		String path = "E:\\JudgeFiles\\";
		
		Scanner file = new Scanner(new File(path + "sample.txt"));
		
		int number = file.nextInt();

		file.nextLine();

		

		for(int i = 0; i < number; i++){
			String answer = "None";
			String k = file.nextLine();
			for(int j = 0; j < k.length(); j++){
				if((k.charAt(j)!= 'A') && (k.charAt(j) != 'B') && (k.charAt(j) != 'C')){
					answer = "" + k.charAt(j);
				}
			}
			System.out.println(answer);
		}
	}
}
