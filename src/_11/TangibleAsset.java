package _11;

public class TangibleAsset {
    String name;
    int price;
    String color;

    public TangibleAsset(final String name, final int price, final String color) {
        this.name = name;
        this.price = price;
        this.color = color;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public String getColor() {
        return this.color;
    }
}
