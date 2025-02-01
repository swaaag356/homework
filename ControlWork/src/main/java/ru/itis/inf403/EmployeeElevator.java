package ru.itis.inf403;

public class EmployeeElevator extends Elevator {
    @Override
    public boolean canServeFloor(int floor) {
        return true;
    }
}
