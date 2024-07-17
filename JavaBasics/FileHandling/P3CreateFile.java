/*
 * Create a file in java using:
 * 1. File
 * 2. FileOutputStream
 */
package JavaBasics.FileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class P3CreateFile {
    public static void createFile(String path) {
        // File object
        File file = new File(path);
        try {
            boolean flag = file.createNewFile();
            if (flag) {
                System.out.println("File is created.");
            } else {
                System.out.println("File is already present.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeContent(String path, String content) {
        // Write data in bytes in file
        byte[] byteArray = content.getBytes();

        try (FileOutputStream fileOutputStream = new FileOutputStream(path, true)) {
            fileOutputStream.write(byteArray);
            System.out.println("Success!!!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Path to new file
        String path = "C:\\Users\\chugh\\OneDrive\\Documents\\JavaPractice\\JavaBasics\\FileHandling\\sampletest.txt";

        // 1. Using File
        createFile(path);

        // 2. FileOutputStream
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file content: ");
        String content = sc.nextLine();

        writeContent(path, content);
    }

}
