package ru.itis.inf403;

public class Main {
    public static void main(String[] args) {
        Elevator[] elevators = new Elevator[] {new EmployeeElevator(), new OddFloorElevator(), new OddFloorElevator(), new OddFloorElevator(), new EvenFloorElevator(), new EvenFloorElevator(), new EvenFloorElevator()};
        LogicOfElevators elevators1 = new LogicOfElevators(elevators);
        elevators1.mainLogic();
    }
}
