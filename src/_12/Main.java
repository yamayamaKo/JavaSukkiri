package _12;

import _10.Matango;

public class Main {
    public static void main(String[] args) {
//        Wizard wizard = new Wizard();
//        Matango matango = new Matango('A');
//        wizard.name = "ホゲホゲ";
//        wizard.attack(matango);
//        wizard.fireball(matango);
//
//        Character character = new Wizard();
//        character.name = "普通の魔法使い";
//        character.attack(matango);

        Slime slime = new Slime();
        Monster monster = new Slime();
        slime.run();
        monster.run();

        final Y[] ylist = new Y[2];
        ylist[0] = new A();
        ylist[1] = new B();

        for (Y y: ylist){
            y.a();
            y.b();
        }
    }
}
