package _9;

public class Hero {
    String name;
    int hp;
    Sword sword;

    public Hero(String name) {
        this.hp = 100;
        this.name = name;
    }

    public Hero() {
        this.hp = 100;
        this.name = "デフォルト名";
    }

    public void attack() {
        System.out.println(this.name + "は" + this.sword.name + "で攻撃した！");
        System.out.println("敵に5ポイントのダメージを与えた！");
    }
}
