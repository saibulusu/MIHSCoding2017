package problems;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Decoder {
	public static void main(String[] args) throws FileNotFoundException{
//		String path = "C:\\Users\\saibu\\Desktop\\SampleFiles\\";
		
		String path = "E:\\JudgeFiles\\";
		
		Scanner file = new Scanner(new File(path + "decoder.txt"));
		

		
		String[] array = {"", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", " ", "."};
		
		String message = file.nextLine();
		
		
		String god = "";
		
		String[] splash = message.split(" ");
		for(int i = 0; i < splash.length; i++){
			int val = Integer.parseInt(splash[i]);
			god += array[val];
		}
		System.out.println(god);
	}

}
