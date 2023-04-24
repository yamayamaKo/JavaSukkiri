package _10;

public class Main {
    public static void main(String[] args) {
        SuperHero superHero = new SuperHero();
        superHero.run();

        PoisonMatango poisonMatango = new PoisonMatango('A');
        poisonMatango.attack(superHero);
    }
}
