package _11;

public class TangibleAsset extends Asset implements Thing {
    int price;
    String color;

    double weight = 0.0;

    public TangibleAsset(final String name, final int price, final String color) {
        super(name);
        this.price = price;
        this.color = color;
    }

    public int getPrice() {
        return this.price;
    }

    public String getColor() {
        return this.color;
    }

    @Override
    public void setWeight(final double weight) {
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return this.weight;
    }
}
