package java_train;

public class twoThree {
    public static void main(String[] args) {
        System.out.println("ようこそ占いの館へ");
        System.out.println("あなたの名前を入力してください");
        String name = new java.util.Scanner(System.in).nextLine();
        System.out.println("それでは、次にあなたの年齢を入力してください");
        int age = new java.util.Scanner(System.in).nextInt();
        int fortune = new java.util.Random().nextInt(3);
        fortune++;
        System.out.println("占いの結果が出ました！");
        System.out.println(age + "才の" + name + "さん、あなたの運気番号は" + fortune + "です。");
        System.out.println("１：大吉　２：中吉　３：吉　４：凶");

    }
}
