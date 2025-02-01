package ru.itis.inf403;

import java.util.Random;

public class LogicOfElevators implements IStep {
    private Elevator[] elevators;
    Random random = new Random();

    public LogicOfElevators(Elevator[] elevators) {
        this.elevators = elevators;
    }

    public void callElevator(int floor, CallType type) throws FreeElevatorsNotFound {
        for (int i = 0; i < elevators.length; ++i) {
            Elevator elevator = elevators[i];
            if (elevator.isFree() && elevator.canServeFloor(floor)) {
                elevator.assignFloor(floor);
                System.out.println("Лифт отправлен на этаж " + floor);
                return;
            }
        }
        throw new FreeElevatorsNotFound("Все лифты заняты! Вызов: " + type + ", Этаж: " + floor);
    }

    @Override
    public void updateStates() {
        for (int i = 0; i < elevators.length; ++i) {
            Elevator elevator = elevators[i];
            elevator.move();
        }
    }

    public void mainLogic() {
        for (int i = 0; i < 10000; i++) {
            this.updateStates();
            if (i % 20 == 0) {
                int floor = random.nextInt(20) + 2; // 2-20 этажи
                CallType type = CallType.values()[random.nextInt(CallType.values().length)];
                try {
                    callElevator(floor, type);
                } catch (FreeElevatorsNotFound e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
