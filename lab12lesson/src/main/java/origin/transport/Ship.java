package origin.transport;
import origin.City;
import origin.Passenger;
import origin.TransportAction;


public class Ship implements TransportAction {
    public String name;
    public void move(City cityFrom, City cityTo, Passenger passenger) {
        System.out.println(passenger + " moved by Ship from " + cityFrom + " to " + cityTo);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
