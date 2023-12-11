import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class CopyFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("abc.txt");
        // Use FileWriter and FileReader for working with character

        FileOutputStream fos = new FileOutputStream("xyz.txt");

        int b;
        while ((b = fis.read()) != 1) {
            fos.write(b);
        }
        fis.close();
        fos.close();

        System.out.println("File Succesfully copied");
    }
}