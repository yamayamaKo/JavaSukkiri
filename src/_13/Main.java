package _13;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero();
        Wand wand = new Wand("ホゲ杖", 100);
        Wizard wizard = new Wizard("ホゲ魔法使い", 50, 10, wand);

        wizard.heal(hero);
    }
}
