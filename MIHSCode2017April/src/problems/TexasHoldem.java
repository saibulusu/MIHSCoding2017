package problems;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TexasHoldem {
	public static void main(String[] args) throws FileNotFoundException{
//		String path = "C:\\Users\\saibu\\Desktop\\SampleFiles\\";
		
		String path = "E:\\JudgeFiles\\";
		
		Scanner file = new Scanner(new File(path + "poker.txt"));
		
		int number = file.nextInt();
		file.nextLine();
		
		for(int i = 0; i < number; i++){
			int[] array = new int[15];
			String s = file.nextLine();
			String[] list = s.split(" ");
			
			for(int z = 0; z < list.length; z++){
				if(list[z].equals("A")){
					array[14]++;
				} else if(list[z].equals("K")){
					array[13]++;
				} else if(list[z].equals("Q")){
					array[12]++;
				} else if(list[z].equals("J")){
					array[11]++;
				} else{
					array[Integer.parseInt(list[z])]++;
				}
			}
			
			int god = -1;
			int king = -1;
			
			for(int splash = 0; splash < array.length; splash++){
				//highest index with highest value
				if(array[splash] == 2){
					god = splash;
				}
				if(array[splash] == 3){
					king = splash;
				}
			}
			
			//pair
			if(king == -1){
				if(god == 14){
					System.out.println("A A");
				} else if(god == 12){
					System.out.println("Q Q");
				} else if(god == 13){
					System.out.println("K K");
				} else if(god == 11){
					System.out.println("J J");
				} else {
					System.out.println(god + " " + god);
				}
			} else{
				if(king == 14){
					System.out.println("A A A");
				} else if(king == 12){
					System.out.println("Q Q Q");
				} else if(king == 13){
					System.out.println("K K K");
				} else if(king == 11){
					System.out.println("J J J");
				} else {
					System.out.println(king + " " + king + " " + king);
				}
			}
			
		}
			
	}
}














