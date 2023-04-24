package _10;

public class Hero {
    String name = "デフォルト名";
    int hp = 100;

    public Hero() {
        System.out.println("Heroのコンストラクタが動作");
    }

    public final void attack() {
        System.out.println(this.name + "は攻撃した！");
        System.out.println("敵に5ポイントのダメージを与えた！");
    }

    public void run() {
        System.out.println(this.name + "は逃げ出した！");
    }
}
