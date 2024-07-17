package JavaBasics.FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class P7FileReader {
    public static void main(String[] args) {
        String path = "C:\\Users\\chugh\\OneDrive\\Documents\\JavaPractice\\JavaBasics\\FileHandling\\sampletest.txt";

        FileReader fr = null;
        try {
            fr = new FileReader(path);

            System.out.println("File content is: ");
            int c = 0;
            try {
                while ((c = fr.read()) != -1) {
                    System.out.print((char) c);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
