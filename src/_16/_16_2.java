package _16;

import java.util.ArrayList;
import java.util.Iterator;

public class _16_2 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("yamada");
        names.add("tanaka");
        names.add("tomita");
        Iterator<String> it = names.iterator();
        while (it.hasNext()){
            String e = it.next();
            System.out.println(e);
        }
    }
}
