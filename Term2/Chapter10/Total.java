import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
/**
*/
This program reads a file with numbers, and writes the numbers to another
file, lined up in a column and followed by their total.
public class Total
{
￼￼￼￼￼￼￼￼￼￼￼￼￼￼￼￼11.1 Reading and Writing Text Files 515 When you are done processing a file, be sure to close the Scanner or PrintWriter:
in.close(); out.close();
If your program exits without closing the PrintWriter, some of the output may not be written to the disk file.
The following program puts these concepts to work. It reads a file containing numbers and writes the numbers, lined up in a column and followed by their total, to another file.
For example, if the input file has the contents
32 54 67.5 29 35 80 115 44.5 100 65
then the output file is
32.00 54.00 67.50 29.00 35.00 80.00
115.00 44.50 100.00 65.00 Total: 622.00
There is one additional issue that we need to tackle. If the input or output file for a Scanner doesn’t exist, a FileNotFoundException occurs when the Scanner object is con- structed. The compiler insists that we specify what the program should do when that happens. Similarly, the PrintWriter constructor generates this exception if it cannot open the file for writing. (This can happen if the name is illegal or the user does not have the authority to create a file in the given location.) In our sample program, we want to terminate the main method if the exception occurs. To achieve this, we label the main method with a throws declaration:
public static void main(String[] args) throws FileNotFoundException
You will see in Section 11.4 how to deal with exceptions in a more professional way. The File, PrintWriter, and FileNotFoundException classes are contained in the java.io
package.
section_1/Total.java
public static void main(String[] args) throws FileNotFoundException {
	// Prompt for the input and output file names
Scanner console = new Scanner(System.in); System.out.print("Input file: ");
String inputFileName = console.next(); System.out.print("Output file: ");
String outputFileName = console.next();
// Construct the Scanner and PrintWriter objects for reading and writing
File inputFile = new File(inputFileName);
Scanner in = new Scanner(inputFile);
PrintWriter out = new PrintWriter(outputFileName);
// Read the input and write the output double total = 0;
while (in.hasNextDouble()) {
double value = in.nextDouble(); out.printf("%15.2f\n", value); total = total + value;
}
out.printf("Total: %8.2f\n", total);
in.close();
out.close();
}
}