package com.company;

import java.util.Random;

public class InfoTruck {

    private int id;
    private String name;
    private State state;
    private Driver driver;

    public InfoTruck(int id, String name, State state) {
        this.id = id;
        this.name = name;
        this.state = state;
    }

    public InfoTruck() {
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

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void printTrucks() {
        System.out.println("#  | Bus       |  Driver  |  State");
        System.out.println("—--+———--------+——-------—+———----");
        System.out.println(getId() + " |\t" + getName() + "|\t\t\t\t\t" + getState().getWhatCondition());
        System.out.println("----------------------------------\n");
    }

    public void changeDriver(InfoTruck infoTruck, Driver driver) {
        if (infoTruck.getState() == State.BASE) {
           infoTruck.setDriver(driver);
        }else if(infoTruck.getState() == State.ROUTE) {
            System.out.println("Водитель " + driver + " " + State.ROUTE.getWhatCondition());
        }else {
            System.out.println("Можно менять водителя");
        }
    }

    public void startDriving(InfoTruck infoTruck) {
        if (infoTruck.getState() == State.BASE) {
            if (infoTruck.getName() != null) {
                infoTruck.setState(State.ROUTE);
                System.out.println("водитель успешно находится в дороге");
            }else {
                System.out.println("Нет свободного водителя");
            }
        }
    }

    public void startRepair(InfoTruck infoTruck) {
        System.out.println("Грузовик " + infoTruck);
    }

    @Override
    public String toString() {
        return
                "id:" + id +
                ", name: " + name + '\'' +
                ", состояние: " + state.getWhatCondition() + ":";
    }
}
