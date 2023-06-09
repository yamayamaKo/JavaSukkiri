package _9;

public class Main {

    public static void main(String[] args) {
        Hero hero = new Hero();

        System.out.println(hero.hp);
        System.out.println(hero.name);

        Hero hero2 = new Hero("変えた名前");

        System.out.println(hero2.hp);
        System.out.println(hero2.name);

        Thief thief = new Thief("hoge");
    }

    public static void main2(String[] args) {
        Sword sword = new Sword();
        sword.name = "炎の剣";
        sword.damage = 10;

        Hero hero = new Hero();
        hero.name = "ホゲ";
        hero.hp = 100;
        hero.sword = sword;

        Hero hero2 = new Hero();
        hero2.name = "ピヨ";

        Hero hero3 = new Hero();
        hero3.name = "poyo";

        Wizard wizard = new Wizard();
        wizard.name = "魔女";
        wizard.hp = 50;

        wizard.heal(hero);
        wizard.heal(hero2);
        wizard.heal(hero3);
//        System.out.println("現在の武器は" + hero.sword.name);
//        hero.attack();
    }
}
