/*
 * You have entered a maze, twisty little passages 
 * alike.
 * 
 * Suppose that a file contains information about sales figures for a company in 
various cities. Each line of the file contains a city name, followed by a colon 
(:) followed by the data for that city. The data is a number of type double. 
However, for some cities, no data was available. In these lines, the data is 
replaced by a comment explaining why the data is missing. For example, several 
lines from the file might look like:

         San Francisco:  19887.32
         Chicago:  no report received
         New York: 298734.12

Write a program that will compute and print the total sales from all the cities 
together. The program should also report the number of cities for which data was 
not available. The name of the file is “sales.dat”.
To complete this program, you’ll need one fact about file input with TextIO that 
was not covered in Subsection 2.4.4. Since you don’t know in advance how many lines 
there are in the file, you need a way to tell when you have gotten to the end of 
the file. When TextIO is reading from a file, the function TextIO.eof() can be 
used to test for end of file. This boolean-valued function returns true if the 
file has been entirely read and returns false if there is more data to read in 
the file. This means that you can read the lines of the file in a loop while 
(TextIO.eof() == false).... The loop will end when all the lines of the file 
have been read.
Suggestion: For each line, read and ignore characters up to the colon. Then read 
the rest of the line into a variable of type String. Try to convert the string 
into a number, and use try..catch to test whether the conversion succeeds.
 *
 */

import java.io.*;

/**
 * 
 *
 * @author scott_r_parker
 * IDE: None
 * Date: July 23, 2019
 * 
 */

public class Manip_File_v1 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // The name of the file to open. The file
        // is located in the main project directory
        String fileName = "sales.dat";
        double salesTotal = 0;
        int noData = 0;
        int numCities = 0;
        double salesTemp = 0;

        // This will reference one line at a time
        String fline = null;
        System.out.println("Reading File: " + fileName);
        System.out.println();
        try {
            // FileReader reads text files in the default encoding.
            FileReader fRead = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fRead);

            while((fline = bufferedReader.readLine()) != null) {
                numCities += 1;
                for (int i = 0; i < fline.length(); i++) {
                    if (fline.charAt(i) == ':' ) {
                        i++;
                        try {
                            String tmpStr = fline.substring(fline.indexOf(":")+1);
                            salesTemp = Double.parseDouble(tmpStr);
                        } 
                        catch (NumberFormatException e) {
                            noData += 1;
                            salesTemp = 0;
                        }
                        break;
                    }
                }
                salesTotal += salesTemp;
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
        System.out.println("Sales data as follows: ");
        System.out.printf("    Total Sales: %1.2f", salesTotal);
        System.out.println();
        System.out.printf("    Total number of cities: %1d", numCities);
        System.out.println();
        System.out.printf("    Total of cities with no data: %1d", noData);
        System.out.println();
    }
}