package com.company;

public class InfoTruck {

    private int id;
    private String name;
    private Driver driver;
    private State state;

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

    public static InfoTruck showInfo(int id, String name, Driver driver, State state) {
        InfoTruck info = new InfoTruck();
        info.id = id;
        info.name = name;
        info.driver = driver;
        info.state = state;

        return info;
    }

    public  void changeDriver(Driver driver){
        System.out.println("Теперь грузовик " + getName() + " ведёт водитель " + driver);
    }

    public  void startDriving() {
        System.out.println("Грузовик " + getName() + " отправлен на маршрут");
    }

    public  void startRepair() {
        System.out.println("Грузовик " + getName() + " Отправлен на ремонт");
    }
}
