// author: Evie Welch
// date: 24/01/23
import java.util.Scanner;
import java.util.Random;
import java.io.File;
import java.io.PrintWriter;
import java.io.*;
import java.util.*;

class Exercise12_15 {
	public static File getFile(String filePath) {
		File file = new File(filePath);
		if (file.exists()){
			System.out.println("File already exists.");
			System.exit(1);
			// file.delete();
		}
		return file;
	}
	public static void writeFile(File file) throws IOException{
		try(PrintWriter outFile = new PrintWriter(file);){
			//		PrintWriter outFile = new PrintWriter(file);
			Random rand = new Random();
			for(int i = 0; i < 100; i++){
				outFile.print((rand.nextInt(999) + 1) + " ");
			}
		}
		
	}
	public static ArrayList<Integer> readFile(File file) throws IOException{
		try(Scanner inFile = new Scanner(file)){
			ArrayList<Integer> ints = new ArrayList<>();
			while(inFile.hasNext()){
				ints.add(inFile.nextInt());
			}
			return ints;
		}
	}
	public static void printInts(ArrayList<Integer> ints){
		Collections.sort(ints);
		for(Integer i : ints){
			System.out.print(i + " ");
		}
	}
	public static void main(String[] args) {
		File file = getFile("./Exercise12_15.txt.");
		try {
			writeFile(file);
			ArrayList<Integer> ints = readFile(file);
			printInts(ints);
		} catch(Exception e) {
			System.out.println(e);
			System.exit(1);
		}			
	}
}