package app;

public class Car {
    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private void startElectricity() {
                System.out.println("Запуск електричної системи");
    }

    private void startCommand() {
                System.out.println("Запуск командного модуля");
    }

    private void startFuelSystem() {
                System.out.println("Запуск системи палива");
    }
}
