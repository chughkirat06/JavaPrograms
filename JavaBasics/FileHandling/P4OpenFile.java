/*
 * Open file using desktop.
 */
package JavaBasics.FileHandling;

import java.awt.Desktop;
import java.io.File;

public class P4OpenFile {
    public static void main(String[] args) {
        String path = "C:\\Users\\chugh\\OneDrive\\Documents\\JavaPractice\\JavaBasics\\FileHandling\\sampletest.txt";

        try {
            File file = new File(path);

            if (!Desktop.isDesktopSupported()) {
                System.out.println("Desktop not supported.");
                return;
            }

            Desktop desktop = Desktop.getDesktop();

            if (file.exists()) {
                desktop.open(file);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
