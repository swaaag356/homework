package apple;

public class Apple implements CanCompare {

    private String color;
    private int weight;
    private String kind;
    private int price;

    @Override
    public int compare(CanCompare other) {
        return this.price - ((Apple)other).getPrice();
    }

    public Apple () {

    }

    public Apple(String color, int weight, String kind, int price) {
        this.color = color;
        this.kind = kind;
        this.price = price;
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public String getKind() {
        return kind;
    }
    @Override
    public String toString() {
        return color + " " + weight + " кг " + kind + " " + price + " рублей ";
    }


}