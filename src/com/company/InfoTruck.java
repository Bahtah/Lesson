package com.company;

public class InfoTruck implements State{

    private int id;
    private String name;
    private Driver driver;

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


    public static InfoTruck showInfo(int id, String name, Driver driver) {
        InfoTruck info = new InfoTruck();
        info.id = id;
        info.name = name;
        info.driver = driver;

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

    public void printTruck() {
        System.out.println("--------------------Trucks---------------------"+'\n'+
                "#|"+ " Bus " + "| ID " + "| Driver " + " | State "+ '\n' +
                "-+-----------------+-----------+---------------"+'\n'
                + getName() +   "|" + getId() + " " + getDriver() + " " + "\n");
    }

    @Override
    public String toString() {
        return "id: " + id +
                ", название: " + name +
                ", водитель: " + driver;
    }

    @Override
    public void base() {

    }

    @Override
    public void route() {

    }

    @Override
    public void repair() {

    }
}
