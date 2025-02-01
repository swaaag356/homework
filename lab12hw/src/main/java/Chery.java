public class Chery implements CanCompare{
    private String color;
    private double weight;

    public Chery(String color, double weight){
        this.color = color;
        this.weight = weight;
    }

    public int compare(CanCompare obj){
        Chery apple = (Chery) obj;

        if (this.color == apple.color && this.weight == apple.weight){
            return 0;
        }else if (this.weight > apple.weight){
            return 1;
        }return -1;
    }

    @Override
    public String toString(){
        return "Apple | " + color + " | " + weight;
    }
}