package ru.itis.inf403;

public abstract class Elevator implements IElevatorState {
    protected ElevatorStates state;
    protected int currentFloor;
    protected Integer neededFloor;

    public Elevator() {
        this.state = ElevatorStates.Stand;
        this.currentFloor = 1;
        this.neededFloor = null;
    }

    public void assignFloor(int floor) {
        if (neededFloor == null) {
            neededFloor = floor;
            if (floor > currentFloor) {
                state = ElevatorStates.GoingUp;
            } else if (floor < currentFloor) {
                state = ElevatorStates.GoingDown;
            }
        }
    }

    public void move() {
        if (state == ElevatorStates.GoingUp) {
            currentFloor++;
            if (currentFloor == neededFloor) {
                state = ElevatorStates.Stand;
                neededFloor = null;
            }
        } else if (state == ElevatorStates.GoingDown) {
            currentFloor--;
            if (currentFloor == neededFloor) {
                state = ElevatorStates.Stand;
                neededFloor = null;
            }
        }
    }

    public ElevatorStates states() {
        return state;
    }

    public boolean isFree () {
        return state == ElevatorStates.Stand;
    }

    public abstract boolean canServeFloor(int floor);
}
