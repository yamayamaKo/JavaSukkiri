package java_train;

public class Calc {
    public static void main(String[] args) {
        int a = 10;
        int b = 35;
        int total = CalcLogic.plus(a, b);
        int delta = CalcLogic.minus(a, b);
        System.out.println("足すと" + total + "引くと" + delta);
    }
}
