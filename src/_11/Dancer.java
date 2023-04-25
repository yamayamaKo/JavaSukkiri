package _11;

import _10.Matango;

public class Dancer extends Character {

    public void dance(){
        System.out.println(this.name + "は踊った");
    }

    @Override
    public void attack(Matango matango) {
        System.out.println(this.name + "の攻撃");
        System.out.println("敵に3ポイントのダメージ");
        matango.hp -= 3;
    }
}
