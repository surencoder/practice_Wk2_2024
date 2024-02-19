import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class io {
    public static void main(String[] args)
    throws IOException
{

    // Initially assigning null ot objects for
    // reading and writing to file
    FileInputStream input = null;
    FileOutputStream output = null;

    // Try block to check for exceptions
    try {

        // Passing the files via local directory
        input = new FileInputStream(
            "/Users/surndr/Documents/input.rtf");
        output = new FileOutputStream(
            "/Users/surndr/Documents/output.rtf");

        // Reading source file and writing content to
        // target file byte by byte
        int temp;

        // If there is content inside file
        // than read
        while ((temp = input.read()) != -1)
            output.write((byte)temp);
      
      // Display message for successful execution of program
      System.out.print("Program successfully executed");
    }

    // finally block that executes for sure
    // where we are closing file connections
    // to avoid memory leakage
    finally {

        if (input != null)
            input.close();

        if (output != null)
            output.close();
    }
}
}