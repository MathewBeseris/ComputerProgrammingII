import java.util.*;
import java.io.*;

public class files
{  
    public static void main(String[]args) throws FileNotFoundException        
    { 
            Scanner console = new Scanner(System.in);           

            System.out.println("File to be read: ");
            String inputFile = console.next();

            File file = new File(inputFile);
            Scanner in = new Scanner(file);
            Scanner in2 = new Scanner(file);
            Scanner in3 = new Scanner(file);

            int words = 0;
            int lines = 0;
            int chars = 0;

            while(in.hasNext())
            {
                in.next();
                words++;
            }
            while(in2.hasNextLine())
            {
                in2.nextLine();
                lines++;
            }
            while(in3.hasNextByte())
            {
                in3.nextByte();
                chars++;
            }
            
            System.out.println("Number of lines: " + lines);
            System.out.println("Number of words: " + words);
            System.out.println("Number of characters: " + chars);
    }
}