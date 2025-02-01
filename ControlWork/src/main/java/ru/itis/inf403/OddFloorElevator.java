package ru.itis.inf403;

public class OddFloorElevator extends Elevator {
    @Override
    public boolean canServeFloor(int floor) {
        return floor % 2 == 1;
    }
}
