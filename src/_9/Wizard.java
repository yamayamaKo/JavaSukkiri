package _9;

public class Wizard {
    String name;
    int hp;

    public void heal(final Hero hero) {
        hero.hp += 10;
        System.out.println(hero.name + "のHPを10回復した！");
    }
}
