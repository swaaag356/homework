package transport;

public class Train implements TransportAction {
    private String category;

    public void move(City cityFrom, City cityTo, Passenger passenger) {
        System.out.println(passenger + " moved by Ship from " + cityFrom + " to " + cityTo);
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
