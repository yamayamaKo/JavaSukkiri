package _11;

public class Computer extends TangibleAsset {
    String makerName;

    public Computer(final String name, final int price, final String color, final String makerName) {
        super(name, price, color);
        this.makerName = makerName;
    }

    public String getMakerName() {
        return this.makerName;
    }
}
