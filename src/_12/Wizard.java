package _12;

import _10.Matango;

public class Wizard extends Character {
    int mp;

    public void attack(Monster monster){
        System.out.println(this.name + "の攻撃");
        System.out.println("敵に3ポイントのダメージ！");
        monster.hp -= 3;
    }

    public void fireball(Monster monster) {
        System.out.println(this.name + "は火の玉を使った！");
        System.out.println("敵に20ポイントのダメージ！");
        monster.hp -= 20;
        this.mp -= 5;
    }
}
