package problems;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FindPrime {
	public static void main(String[] args) throws FileNotFoundException{
		String path = "C:\\Users\\saibu\\Desktop\\SampleFiles\\";
		
//		String path = "E:\\JudgeFiles\\";
		
		Scanner file = new Scanner(new File(path + "prime.txt"));
		
		int number = file.nextInt();
		for(int row = 0; row < number; row++){
			int zeta = file.nextInt();
			int n = 2;
			int start = file.nextInt();
			int end = file.nextInt();
			System.out.println(end);
			int counter = 0;
			ArrayList<Integer> list = new ArrayList<Integer>();
			while(counter != zeta){
				int factor = 0;
				for(int splash = 1; splash < n; splash++){
					if(n % splash == 0){
						factor++;
					}
				}
				if(factor == 2){
					counter++;
					list.add(n);	
				} 
				n++;
			}
			for(int god = 0; god < list.size(); god++){
				if(start <= list.get(god) && list.get(god) <= end){
					int king = (int) Math.pow(list.get(god), 2);
					list.set(god,king);
				}				
			}
			
			for(int god = 0; god < list.size(); god++){
				if(Math.sqrt(list.get(god)) > end){
					int alpha = (int)Math.sqrt(list.get(god));
					list.set(god, alpha);
				}
			}
			
			
			for(int god = 0; god < list.size(); god++){
				System.out.print(list.get(god) + " ");
			}
			System.out.println();
		}
		
	}

}
