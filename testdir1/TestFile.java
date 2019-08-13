
import java.io.*;

/**
 * 
 *
 * @author scott_r_parker
 * IDE: None
 * Date: August 12, 2019
 *
 * Just a file to mess around with things on GitHub until we come up with some kind
 * of project to do.
 * 
 */

public class TestFile {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // The name of the file to open. The file
        // is located in the main project directory
        String fileName = "room1.dat";

        // This will reference one line at a time
        String fline = null;
        
        try {
            // FileReader reads text files in the default encoding.
            FileReader fRead = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fRead);

            while((fline = bufferedReader.readLine()) != null) {
                System.out.println(fline);
            }

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
        
        System.out.println();
        System.out.println("Lines of file all printed");
    }
}