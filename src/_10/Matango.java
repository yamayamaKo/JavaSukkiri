package _10;

public class Matango {
    int hp = 50;
    char suffix;

    public Matango(final char suffix) {
        this.suffix = suffix;
    }

    public void attack(final Hero hero) {
        System.out.println("キノコ" + this.suffix + "の攻撃");
        System.out.println("10のダメージ");
        hero.hp -= 10;
    }
}
