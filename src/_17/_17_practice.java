package _17;

public class _17_practice {
    public static void main(String[] args) {
        try {
            String s = null;
            Integer num = s.length();
        } catch (NullPointerException e){
            System.out.println("--スタックトレース（ここから）--");
            e.printStackTrace();
            System.out.println("--スタックトレース（ここまで）--");
        }
        System.out.println("10");
    }
}
