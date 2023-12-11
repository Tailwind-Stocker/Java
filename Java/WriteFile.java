import java.io.FileWriter;
import java.io.IOException;

class WriteFile {
    public static void main(String[] args) throws IOException{
        FileWriter fin = new FileWriter("Def.txt");

        char ch = 'J';
        String str = "Travel";

        fin.write(str);
        fin.write(ch);
        fin.close();
    }
}
