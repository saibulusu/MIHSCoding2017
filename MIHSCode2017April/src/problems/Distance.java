package problems;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Distance {
	public static void main(String[] args) throws FileNotFoundException{
//		String path = "C:\\Users\\saibu\\Desktop\\SampleFiles\\";
		
		String path = "E:\\JudgeFiles\\";
		
		Scanner file = new Scanner(new File(path + "distance.txt"));
		
		int number = file.nextInt();
		file.nextLine();
		
		
		for(int i = 0; i < number; i++){
			String[] numbers = file.nextLine().split(" ");
			double A = 0;
			double B = 0;
			double C = 0;
			
			for(int j = 0; j < 4; j++){
				if(numbers[j].equals("A")){
					A = Double.parseDouble(numbers[j+1]);
				}
				if(numbers[j].equals("B")){
					B = Double.parseDouble(numbers[j+1]);
				}
				if(numbers[j].equals("C")){
					C = Double.parseDouble(numbers[j+1]);
				}
			}
			
			int zeta = 0;
			
			if(A == 0){
				A = Math.sqrt(C * C - B * B);
				zeta = (int) A;
			}
			
			if(B == 0){
				B = Math.sqrt(C * C - A * A);
				zeta = (int) B;
			}
			
			if(C == 0){
				C = Math.sqrt(A * A + B * B);
				zeta = (int) C;
			}
			
			System.out.println(zeta);
		}
	}
}
