package _13;

public class Wand {
    private String name;
    private double power;

    public Wand(final String name, final double power) {
        if (name.length() < 3) {
            throw new IllegalArgumentException("名前は３文字以上で指定してください");
        }
        if (power < 0.5 || power > 100) {
            throw new IllegalArgumentException("杖のpowerは0.5~100で指定する必要があります");
        }

        setName(name);
        setPower(power);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }
}
