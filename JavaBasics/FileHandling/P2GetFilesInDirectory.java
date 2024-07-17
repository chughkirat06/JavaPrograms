/*
 * Print all files and folders in a directory in sorted order
 */
package JavaBasics.FileHandling;

import java.io.*;
import java.util.Arrays;

public class P2GetFilesInDirectory {
    public static void main(String[] args) {
        String path = "C:\\Users\\chugh\\Downloads";

        // Object of file
        File file = new File(path);

        // Array to store list of all files
        File[] listFiles = file.listFiles();

        if (listFiles != null) {
            Arrays.sort(listFiles);

            for (File e : listFiles) {
                if (e.isFile()) {
                    System.out.println("File: " + e.getName());
                } else if (e.isDirectory()) {
                    System.out.println("Directory: " + e.getName());
                } else {
                    System.out.println("Not know: " + e.getName());
                }
            }
        } else {
            System.out.println("The specified path does not exist or there are no files in the directory");
        }

    }
}
