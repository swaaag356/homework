package ru.itis.inf403;

public class ElevatorCalling implements ICalling{
    private int neededFloor;
    private CallType type;

    public ElevatorCalling(int neededFloor, CallType type) {
        this.neededFloor = neededFloor;
        this.type = type;
    }

    @Override
    public int getNeededFloor() {
        return neededFloor;
    }

    @Override
    public CallType getType() {
        return type;
    }
}
