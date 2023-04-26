package _18;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class _18_3 {
    public static void main(String[] args) {
        try {
            URL u = new URL("https://book.impress.co.jp/");
            InputStream is = u.openStream();
            int i = is.read();
            while (i != -1) {
                char c = (char) i;
                System.out.print(c);
                i = is.read();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
