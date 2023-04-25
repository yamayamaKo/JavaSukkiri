package _13;

import _9.Sword;

public class Hero {
    private int hp;
    private String name;
    private Sword sword;

    public Hero() {
        setHp(100);
        setName("ホゲ");
    }

    private void bye() {
        System.out.println("勇者は別れをつげた");
    }

    public void die() {
        System.out.println(this.name + "は死んでしまった！");
    }

    public void sleep() {
        this.hp = 100;
        System.out.println(this.name + "は眠って回復した！");
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
