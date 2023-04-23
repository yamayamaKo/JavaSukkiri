package _8;

import java.util.Random;

public class Cleric {
    int hp = 50;
    final int maxHp = 50;
    int mp = 10;
    final int maxMp = 10;
    String name = "聖職者";

    void selfAid() {
        this.mp -= 5;
        this.hp = this.maxHp;
        System.out.println(this.name + "の体力が" + this.hp + "まで回復しました");
    }

    int pray(final int praySec) {
        Random rand = new Random();
        final int maxRecoveryMp = praySec + rand.nextInt(3);
        final int recoveryMp = Math.min(maxRecoveryMp, this.maxMp);
        return recoveryMp;
    }
}
