package _13;

public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;

    public Wizard(final String name, final int hp, final int mp, final Wand wand) {
        if (name.length() < 3) {
            throw new IllegalArgumentException("名前は３文字以上で指定してください");
        }
        setName(name);
        setHp(Math.max(hp, 0));
        setMp(Math.max(mp, 0));
        setWand(wand);
    }

    void heal(Hero h) {
        int basePoint = 10;
        int recovPoint = (int) (basePoint * this.wand.getPower());
        h.setHp(h.getHp() + recovPoint);
        System.out.println(h.getName() + "のHPを" + recovPoint + "回復した！");
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWand(Wand wand) {
        this.wand = wand;
    }
}
