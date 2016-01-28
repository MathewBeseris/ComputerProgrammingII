
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExerciseOne{
	public static void main(String[] args){
		File inputFile = new File("hello.txt");
		PrintWriter out = new PrintWriter("hello.txt");
		out.printf("Hello World!");
	}
}