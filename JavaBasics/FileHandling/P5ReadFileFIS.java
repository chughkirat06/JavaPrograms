package JavaBasics.FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class P5ReadFileFIS {
    public static void main(String[] args) {
        String path = "C:\\Users\\chugh\\OneDrive\\Documents\\JavaPractice\\JavaBasics\\FileHandling\\sampletest.txt";
        FileInputStream fileInputStream = null;
        try {
            File file = new File(path);
            fileInputStream = new FileInputStream(file);

            System.out.println("File content is: ");

            int c = 0;
            while ((c = fileInputStream.read()) != -1) {
                System.out.print((char) c);
            }

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
