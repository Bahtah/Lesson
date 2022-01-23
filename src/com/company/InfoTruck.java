package com.company;

public class InfoTruck {

    private int id;
    private String name;
    private Driver driver;
    private State state;

    public InfoTruck(int id, String name, Driver driver, State state) {
        this.id = id;
        this.name = name;
        this.driver = driver;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void printTrucks() {
        System.out.printf("%d, %s, %s, %s%n", getId(), getName(), getDriver(), getState().getWhatCondition());
    }

    public void changeDriver(Driver driver) {
        System.out.println("Теперь грузовик " + getName() + " ведет " + driver);
    }

    public void startDriving(InfoTruck infoTruck) {
        System.out.println("Грузовик " + infoTruck + " Отправляется на маршрут");
    }

    public void startRepair(InfoTruck infoTruck) {
        System.out.println("Грузовик " + infoTruck + " на ремонте");
    }

    @Override
    public String toString() {
        return name;
    }
}
