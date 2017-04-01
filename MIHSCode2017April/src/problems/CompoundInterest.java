package problems;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CompoundInterest {
	public static void main(String[] args) throws FileNotFoundException{
//		String path = "C:\\Users\\saibu\\Desktop\\SampleFiles\\";
		
		String path = "E:\\JudgeFiles\\";
		
		Scanner file = new Scanner(new File(path + "compound.txt"));
		
		int number = file.nextInt();
		file.nextLine();
		
		for(int row = 0; row < number; row++){
			int P = file.nextInt();
			int n = file.nextInt();
			double r = file.nextDouble();
			int t = file.nextInt();
			
			double value = (1 + r/n);
			value = Math.pow(value, n * t);
			value *= P;
			int val = (int)value;
			
			System.out.println("$" + val);
			
		}
	}

}
