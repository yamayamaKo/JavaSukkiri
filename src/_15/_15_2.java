package _15;
import static java.lang.System.*;

public class _15_2 {
    public static void main(String[] args) {
        String s1 = "Java and JavaScript";
        if (s1.contains("Java")){
            out.println("Java含んでるよ");
        }
        if (s1.endsWith("Z")){
            out.println("Zで終わRu");
        }else {
            out.println("Zで終わらない");
        }

        out.println(s1.indexOf("Java"));
        out.println(s1.indexOf("hoge"));
        out.println(1);
    }
}
