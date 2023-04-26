package _18;

import java.io.FileReader;
import java.io.IOException;

public class _18_1 {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("data.txt");) {
            int input = fr.read();
            while (input != -1) {
                System.out.print((char) input);
                input = fr.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
