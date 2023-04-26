package _18;

import java.io.FileWriter;
import java.io.IOException;

public class _18_2 {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("data2.txt")) {
            fw.write("ぴよぴよ");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
