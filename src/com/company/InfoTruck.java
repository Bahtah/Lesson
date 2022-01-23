package com.company;

public class InfoTruck {

    private int id;
    private String name;
    private State state;

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

    public void printTrucks() {
        System.out.println("#  | Bus       |  Driver  |  State");
        System.out.println("—--+———--------+——-------—+———----");
        System.out.println(getId() + " |\t" + getName() + "|\t\t\t\t\t" + getState().getWhatCondition());
        System.out.println("----------------------------------\n");
    }

    public void changeDriver(InfoTruck infoTruck, Driver driver) {
        if (infoTruck.getState() == State.BASE) {
            System.out.println("Теперь грузовик " + getName() + " ведет " + driver);
            startDriving(infoTruck);
            infoTruck.getState().setWhatCondition("в пути");
        }
    }

    public void startDriving(InfoTruck infoTruck) {
        System.out.println("Грузовик " + infoTruck + " Отправляется на маршрут");
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
