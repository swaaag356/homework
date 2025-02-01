package ru.itis.inf403;

public class EvenFloorElevator extends Elevator{
    @Override
    public boolean canServeFloor(int floor) {
        return floor % 2 == 0;
    }
}
