package _8;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.name = "ミナト";
        hero.hp = 100;

        System.out.println("勇者" + hero.name + "を生み出しました！");
        hero.sit(5);
        hero.slip();
        hero.sit(30);
        hero.sleep();
        hero.run();

        Cleric cleric = new Cleric();
        cleric.selfAid();
        int recoveryMp = cleric.pray(5);
        System.out.println(recoveryMp);
    }
}
