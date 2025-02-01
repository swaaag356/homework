package origin;

import origin.transport.Plane;
import origin.transport.Ship;
import origin.transport.Train;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        City Kazan = new City("Казань");
        City Saransk = new City("Саранск");
        Passenger Roma = new Passenger("Рома");

        TransportAction[] transports = {
                new Plane(),
                new Ship(),
                new Train(),
        };

        Random random = new Random();
        int index = random.nextInt(3);

        transports[index].move(Kazan, Saransk, Roma);

        Plane plane = (Plane) transports[index];
        System.out.println(plane);
    }
}
