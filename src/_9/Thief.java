package _9;

public class Thief {
    String name;
    int hp = 40;
    int mp = 5;

    public Thief(final String name, final int hp, final int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    public Thief(String name, int hp) {
        this(name, hp, 5);
    }

    public Thief(String name) {
        this(name, 40);
    }

}
