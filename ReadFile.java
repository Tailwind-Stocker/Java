import java.io.File;
import java.util.Scanner;

class ReadFile {
    public static void main(String[] args) {
        try {
            File file = new File("Abc.txt");
            Scanner sc = new Scanner("Readinf file: ");
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
            file.close();
        } catch (Exception e) {
            e.getStackTrace();
            System.out.println(e);
        }
    }
}