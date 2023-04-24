package _10;

public class PoisonMatango extends Matango {
    int remainPoisonAttack = 5;

    public PoisonMatango(final char suffix) {
        super(suffix);
    }

    public void attack(final Hero hero) {
        super.attack(hero);
        if (remainPoisonAttack < 1) {
            return;
        }
        System.out.println("毒の胞子をばら撒いた！");
        final int poisonDamage = hero.hp / 5;
        System.out.println("勇者" + hero.name + "に" + poisonDamage + "のダメージ！");
        hero.hp -= poisonDamage;
        remainPoisonAttack -= 1;
    }
}
