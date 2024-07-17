/*
 * Get bytes in file and make a copy of the file
 */
package JavaBasics.FileHandling;

import java.io.*;

public class P1FileHandling {

    public static void copyFile() {
        // File object - Input file path
        File ipfile = new File("JavaBasics\\FileHandling\\test.txt");

        // File object - Output file path
        File opFile = new File("JavaBasics\\FileHandling\\test-copy.txt");

        // Using try-with-resources to automatically close the streams
        try (FileInputStream fileInputStream = new FileInputStream(ipfile);
                FileOutputStream fileOutputStream = new FileOutputStream(opFile)) {

            // Give bytes in file
            System.out.println(fileInputStream.available());

            // Reads the input file byte by byte and write file contents
            // -1 if there is no data - end of file
            int i = 0;
            while ((i = fileInputStream.read()) != -1) {
                fileOutputStream.write(i);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        copyFile();
    }
}
